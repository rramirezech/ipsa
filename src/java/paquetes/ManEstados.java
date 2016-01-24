package paquetes;

import paquetes.CatEstados;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ConversationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;

@Named
@ConversationScoped
public class ManEstados implements Serializable {

    private static final long serialVersionUID = 8799478674646788L;
    @Inject
    Login cbean;
    private CatEstados catestados;
    private List<CatEstados> estados;
    private String id_est, des_est;

    public ManEstados() {
    }

    public void setCatestados(CatEstados catestados) {
        this.catestados = catestados;
    }

    public void setEstados(List<CatEstados> estados) {
        this.estados = estados;
    }

    public void setId_est(String id_est) {
        this.id_est = id_est;
    }

    public void setDes_est(String des_est) {
        this.des_est = des_est;
    }

    public void iniciarventana() {
        id_est = "";
        des_est = "";
        llenarEstados();
    }

    public void cerrarventana() {
        id_est = "";
        des_est = "";
        estados = new ArrayList<>();
    }

    public void llenarEstados() {
        String mQuery = "";
        try {
            catestados = new CatEstados();
            estados = new ArrayList<>();

            mQuery = "select id_est, des_est from cat_est order by id_est;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                estados.add(new CatEstados(
                        resVariable.getString(1),
                        resVariable.getString(2)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Catálogo Estados. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void nuevo() {
        id_est = "";
        des_est = "";
        catestados = new CatEstados();
    }

    public void guardar() {
        String mQuery = "";
        if (validardatos()) {
            try {
                Accesos mAccesos = new Accesos();
                mAccesos.Conectar();
                if ("".equals(id_est)) {
                    mQuery = "select ifnull(max(id_et),0)+1 as codigo from cat_est;";
                    id_est = mAccesos.strQuerySQLvariable(mQuery);
                    mQuery = "insert into cat_est (id_est,des_est) "
                            + "values (" + id_est + ",'" + des_est + "');";
                } else {
                    mQuery = "update cat_est SET "
                            + " des_est= '" + des_est + "' "
                            + "WHERE id_est= " + id_est + ";";

                }
                mAccesos.dmlSQLvariable(mQuery);
                mAccesos.Desconectar();
                addMessage("Guardar Estados", "Información Almacenada con éxito.", 1);
            } catch (Exception e) {
                addMessage("Guardar Estados", "Error al momento de guardar la información. " + e.getMessage(), 2);
                System.out.println("Error al Guardar Estados. " + e.getMessage() + " Query: " + mQuery);
            }
            llenarEstados();
        }
        nuevo();

    }

    public void eliminar() {
        String mQuery = "";
        Accesos mAccesos = new Accesos();
        mAccesos.Conectar();
        if ("".equals(id_est) == false) {
            try {
                mQuery = "delete from cat_est where id_est =" + id_est + ";";
                mAccesos.dmlSQLvariable(mQuery);
                addMessage("Eliminar Estados", "Información Eliminada con éxito.", 1);
            } catch (Exception e) {
                addMessage("Eliminar Estados", "Error al momento de Eliminar la información. " + e.getMessage(), 2);
                System.out.println("Error al Eliminar Estados. " + e.getMessage() + " Query: " + mQuery);
            }
            llenarEstados();
            nuevo();
        } else {
            addMessage("Eliminar Estados", "Debe elegir un Registro.", 2);
        }
        mAccesos.Desconectar();

    }

    public boolean validardatos() {
        boolean mValidar = true;
        if ("".equals(des_est) == true) {
            mValidar = false;
            addMessage("Validar Datos", "Debe Ingresar un Nombre para el Estado.", 2);
        }
        Accesos maccesos = new Accesos();
        maccesos.Conectar();
        if ("0".equals(maccesos.strQuerySQLvariable("select count(id_est) from cat_est "
                + "where upper(des_est)='" + des_est.toUpperCase() + "';")) == false && "".equals(id_est)) {
            mValidar = false;
            addMessage("Validar Datos", "El Nombre del Estado ya existe.", 2);
        }
        maccesos.Desconectar();
        return mValidar;

    }

    public void onRowSelect(SelectEvent event) {
        id_est = ((CatEstados) event.getObject()).getId_est();
        des_est = ((CatEstados) event.getObject()).getDes_est();
    }

    public void addMessage(String summary, String detail, int tipo) {
        FacesMessage message = new FacesMessage();
        switch (tipo) {
            case 1:
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
                break;
            case 2:
                message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
                break;
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
