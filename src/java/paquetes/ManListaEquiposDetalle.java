package paquetes;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ConversationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TabChangeEvent;

@Named
@ConversationScoped

public class ManListaEquiposDetalle implements Serializable {

    private static final long serialVersionUID = 8715874748765398L;
    @Inject
    Login cbean;
    @Inject
    ManListaEquipos enc;
    private CatMantenimientosGen catmantenimientosgen;
    private List<CatMantenimientosGen> general;
    private CatMantenimientosPie catmantenimientospie;
    private List<CatMantenimientosPie> piezas;
    private CatMantenimientosAne catmantenimientosane;
    private List<CatMantenimientosAne> anexos;
    private CatOperaciones catoperaciones;
    private List<CatOperaciones> operaciones;

    private String cod_lis_equ, cod_man, cod_usu;
    private String g_det_man, g_fec_man, g_hor_man, g_cod_ope, g_det_obs;
    private String p_det_man, p_det_can, p_cod_lis_pie, p_num_ser;
    private String a_det_man, a_det_obs, a_tip_ane, a_rut_ane;

    private String boolean_e_s, tabindex;

    public ManListaEquiposDetalle() {
    }

    public CatMantenimientosGen getCatmantenimientosgen() {
        return catmantenimientosgen;
    }

    public void setCatmantenimientosgen(CatMantenimientosGen catmantenimientosgen) {
        this.catmantenimientosgen = catmantenimientosgen;
    }

    public List<CatMantenimientosGen> getGeneral() {
        return general;
    }

    public void setGeneral(List<CatMantenimientosGen> general) {
        this.general = general;
    }

    public CatMantenimientosPie getCatmantenimientospie() {
        return catmantenimientospie;
    }

    public void setCatmantenimientospie(CatMantenimientosPie catmantenimientospie) {
        this.catmantenimientospie = catmantenimientospie;
    }

    public List<CatMantenimientosPie> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<CatMantenimientosPie> piezas) {
        this.piezas = piezas;
    }

    public CatMantenimientosAne getCatmantenimientosane() {
        return catmantenimientosane;
    }

    public void setCatmantenimientosane(CatMantenimientosAne catmantenimientosane) {
        this.catmantenimientosane = catmantenimientosane;
    }

    public List<CatMantenimientosAne> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<CatMantenimientosAne> anexos) {
        this.anexos = anexos;
    }

    public CatOperaciones getCatoperaciones() {
        return catoperaciones;
    }

    public void setCatoperaciones(CatOperaciones catoperaciones) {
        this.catoperaciones = catoperaciones;
    }

    public List<CatOperaciones> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<CatOperaciones> operaciones) {
        this.operaciones = operaciones;
    }

    public String getCod_lis_equ() {
        return cod_lis_equ;
    }

    public void setCod_lis_equ(String cod_lis_equ) {
        this.cod_lis_equ = cod_lis_equ;
    }

    public String getCod_man() {
        return cod_man;
    }

    public void setCod_man(String cod_man) {
        this.cod_man = cod_man;
    }

    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getG_det_man() {
        return g_det_man;
    }

    public void setG_det_man(String g_det_man) {
        this.g_det_man = g_det_man;
    }

    public String getG_fec_man() {
        return g_fec_man;
    }

    public void setG_fec_man(String g_fec_man) {
        this.g_fec_man = g_fec_man;
    }

    public String getG_hor_man() {
        return g_hor_man;
    }

    public void setG_hor_man(String g_hor_man) {
        this.g_hor_man = g_hor_man;
    }

    public String getG_cod_ope() {
        return g_cod_ope;
    }

    public void setG_cod_ope(String g_cod_ope) {
        this.g_cod_ope = g_cod_ope;
    }

    public String getG_det_obs() {
        return g_det_obs;
    }

    public void setG_det_obs(String g_det_obs) {
        this.g_det_obs = g_det_obs;
    }

    public String getP_det_man() {
        return p_det_man;
    }

    public void setP_det_man(String p_det_man) {
        this.p_det_man = p_det_man;
    }

    public String getA_det_man() {
        return a_det_man;
    }

    public void setA_det_man(String a_det_man) {
        this.a_det_man = a_det_man;
    }

    public String getA_det_obs() {
        return a_det_obs;
    }

    public void setA_det_obs(String a_det_obs) {
        this.a_det_obs = a_det_obs;
    }

    public String getA_tip_ane() {
        return a_tip_ane;
    }

    public void setA_tip_ane(String a_tip_ane) {
        this.a_tip_ane = a_tip_ane;
    }

    public String getA_rut_ane() {
        return a_rut_ane;
    }

    public void setA_rut_ane(String a_rut_ane) {
        this.a_rut_ane = a_rut_ane;
    }

    public String getBoolean_e_s() {
        return boolean_e_s;
    }

    public void setBoolean_e_s(String boolean_e_s) {
        this.boolean_e_s = boolean_e_s;
    }

    public String getTabindex() {
        return tabindex;
    }

    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    public void iniciarventana() {

        tabindex = "0";

        cod_lis_equ = enc.getCod_lis_equ();
        cod_man = enc.getM_cod_man();
        cod_usu = cbean.getCod_usu();
        g_det_man = "";
        g_fec_man = "";
        g_hor_man = "";
        g_cod_ope = "";
        g_det_obs = "";
        p_det_man = "";
        p_det_can = "";
        p_cod_lis_pie = "";
        p_num_ser = "";
        a_det_man = "";
        a_det_obs = "";
        a_tip_ane = "";
        a_rut_ane = "";
        llenarOperaciones();
        llenarGeneral();
        llenarPiezas();
        llenarAnexos();

    }

    public void cerrarventana() {
        tabindex = "0";

        cod_lis_equ = enc.getCod_lis_equ();
        cod_man = enc.getM_cod_man();
        cod_usu = cbean.getCod_usu();
        g_det_man = "";
        g_fec_man = "";
        g_hor_man = "";
        g_cod_ope = "";
        g_det_obs = "";
        p_det_man = "";
        p_det_can = "";
        p_cod_lis_pie = "";
        p_num_ser = "";
        a_det_man = "";
        a_det_obs = "";
        a_tip_ane = "";
        a_rut_ane = "";
        operaciones = new ArrayList<>();
        general = new ArrayList<>();
        piezas = new ArrayList<>();
        anexos = new ArrayList<>();
    }

    public void llenarOperaciones() {
        String mQuery = "";
        try {
            catoperaciones = new CatOperaciones();
            operaciones = new ArrayList<>();

            mQuery = "select cod_ope, nom_ope from cat_ope order by cod_ope;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                operaciones.add(new CatOperaciones(
                        resVariable.getString(1),
                        resVariable.getString(2)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Operaciones ManListaEquiposDetalle" + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarGeneral() {
        String mQuery = "";
        try {
            catmantenimientosgen = new CatMantenimientosGen();
            general = new ArrayList<>();

            mQuery = "select gen.cod_lis_equ,gen.cod_man,gen.det_man,"
                    + "date_format(gen.fec_man,'%d/%m/%Y'),"
                    + "time_format(gen.hor_man,'%H:%i'),"
                    + "gen.cod_ope,gen.det_obs,"
                    + "gen.cod_usu,ope.nom_ope "
                    + "from tbl_det_man_gen as gen "
                    + "left join cat_ope as ope on gen.cod_ope = ope.cod_ope "
                    + "where gen.cod_lis_equ=" + cod_lis_equ + " "
                    + "and gen.cod_man=" + cod_man + " "
                    + "order by gen.det_man;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                general.add(new CatMantenimientosGen(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8),
                        resVariable.getString(9)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado Detalle General ManListaEquiposDetalle" + e.getMessage() + " Query: " + mQuery);
        }
    }
    
    public void llenarPiezas() {
        String mQuery = "";
        try {
            catmantenimientospie = new CatMantenimientosPie();
            piezas = new ArrayList<>();

            mQuery = "select gen.cod_lis_equ,gen.cod_man,gen.det_man,"
                    + "gen.det_can,gen.cod_lis_pie,gen.num_ser,"
                    + "gen.cod_usu,pie.nom_pie "
                    + "from tbl_det_man_pie as gen "
                    + "left join lis_pie as lis on gen.cod_lis_pie = lis.cod_lis_pie "
                    + "left join cat_pie as pie on lis.cod_pie = pie.cod_pie "
                    + "where gen.cod_lis_equ=" + cod_lis_equ + " "
                    + "and gen.cod_man=" + cod_man + " "
                    + "order by gen.det_man;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                piezas.add(new CatMantenimientosPie(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado Detalle Piezas ManListaEquiposDetalle" + e.getMessage() + " Query: " + mQuery);
        }
    }
    
    public void llenarAnexos() {
        String mQuery = "";
        try {
            catmantenimientosane = new CatMantenimientosAne();
            anexos = new ArrayList<>();

            mQuery = "select cod_lis_equ, cod_man, det_man, "
                    + "det_obs, tip_ane, rut_ane, cod_usu, "
                    + "case tip_ane "
                    + "when 1 then 'PDF' "
                    + "when 2 then 'IMAGEN' "
                    + "when 3 then 'OTRO' "
                    + "end as nomtip "
                    + "from tbl_det_man_ane "
                    + "where cod_lis_equ=" + cod_lis_equ + " "
                    + "and cod_man=" + cod_man + " "
                    + "order by det_man;";
            
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                anexos.add(new CatMantenimientosAne(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado Anexos ManListaEquiposDetalle" + e.getMessage() + " Query: " + mQuery);
        }
    }

}
