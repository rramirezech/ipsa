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
public class ManListaEquipos implements Serializable {

    private static final long serialVersionUID = 8774836761534938L;
    @Inject
    Login cbean;
    private CatTipos cattipos;
    private List<CatTipos> tipos;
    private CatMantenimientos catmantenimientos1;
    private List<CatMantenimientos> mantenimientos1;
    private CatMantenimientos catmantenimientos2;
    private List<CatMantenimientos> mantenimientos2;
    private CatProveedores catproveedores;
    private List<CatProveedores> proveedores;
    private CatClientes catclientes;
    private List<CatClientes> clientes;
    private CatPaises catpaises;
    private List<CatPaises> paises;
    private CatUsuarios catusuarios;
    private List<CatUsuarios> usuarios;
    private CatContratos catcontratos;
    private List<CatContratos> contratos;
    private CatGarantias catgarantias;
    private List<CatGarantias> garantias;
    private CatSistemas catsistemas;
    private List<CatSistemas> sistemas;
    private CatEquipos catequipos;
    private List<CatEquipos> equipos;
    private CatListaEquipos catlistaequipos;
    private List<CatListaEquipos> lequipos;

    private String cod_lis_equ, cod_pai, cod_equ, cod_pro, cod_cli, num_mod, num_ser,
            des_equ, des_ubi, fec_ing, fec_pue_ser, fec_ult_man, fec_ret, cod_sys,
            cod_con, cod_gar, cod_usu, cod_bar;

    private String gar_fec_ini, gar_fec_fin, gar_obs;

    private String cod_equ_b, cod_cli_b;

    private String tabindex;

    private String s_cod_sys, s_det_obs, s_ver_ant, s_ver_act, s_fec_act;

    private String c_cod_con, c_cod_ref, c_des_inf, c_fec_con, c_fec_exp;

    private String m_cod_man, m_cod_tip, m_det_obs, m_fec_ini, m_fec_fin, m_det_sta, m_nomtip, m_estado;

    private String nombre_mantenimiento;

    public CatTipos getCattipos() {
        return cattipos;
    }

    public void setCattipos(CatTipos cattipos) {
        this.cattipos = cattipos;
    }

    public List<CatTipos> getTipos() {
        return tipos;
    }

    public void setTipos(List<CatTipos> tipos) {
        this.tipos = tipos;
    }

    public CatMantenimientos getCatmantenimientos1() {
        return catmantenimientos1;
    }

    public void setCatmantenimientos1(CatMantenimientos catmantenimientos1) {
        this.catmantenimientos1 = catmantenimientos1;
    }

    public List<CatMantenimientos> getMantenimientos1() {
        return mantenimientos1;
    }

    public void setMantenimientos1(List<CatMantenimientos> mantenimientos1) {
        this.mantenimientos1 = mantenimientos1;
    }

    public CatMantenimientos getCatmantenimientos2() {
        return catmantenimientos2;
    }

    public void setCatmantenimientos2(CatMantenimientos catmantenimientos2) {
        this.catmantenimientos2 = catmantenimientos2;
    }

    public List<CatMantenimientos> getMantenimientos2() {
        return mantenimientos2;
    }

    public void setMantenimientos2(List<CatMantenimientos> mantenimientos2) {
        this.mantenimientos2 = mantenimientos2;
    }

    public CatProveedores getCatproveedores() {
        return catproveedores;
    }

    public void setCatproveedores(CatProveedores catproveedores) {
        this.catproveedores = catproveedores;
    }

    public List<CatProveedores> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<CatProveedores> proveedores) {
        this.proveedores = proveedores;
    }

    public CatClientes getCatclientes() {
        return catclientes;
    }

    public void setCatclientes(CatClientes catclientes) {
        this.catclientes = catclientes;
    }

    public List<CatClientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<CatClientes> clientes) {
        this.clientes = clientes;
    }

    public CatPaises getCatpaises() {
        return catpaises;
    }

    public void setCatpaises(CatPaises catpaises) {
        this.catpaises = catpaises;
    }

    public List<CatPaises> getPaises() {
        return paises;
    }

    public void setPaises(List<CatPaises> paises) {
        this.paises = paises;
    }

    public CatUsuarios getCatusuarios() {
        return catusuarios;
    }

    public void setCatusuarios(CatUsuarios catusuarios) {
        this.catusuarios = catusuarios;
    }

    public List<CatUsuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<CatUsuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public CatContratos getCatcontratos() {
        return catcontratos;
    }

    public void setCatcontratos(CatContratos catcontratos) {
        this.catcontratos = catcontratos;
    }

    public List<CatContratos> getContratos() {
        return contratos;
    }

    public void setContratos(List<CatContratos> contratos) {
        this.contratos = contratos;
    }

    public CatGarantias getCatgarantias() {
        return catgarantias;
    }

    public void setCatgarantias(CatGarantias catgarantias) {
        this.catgarantias = catgarantias;
    }

    public List<CatGarantias> getGarantias() {
        return garantias;
    }

    public void setGarantias(List<CatGarantias> garantias) {
        this.garantias = garantias;
    }

    public CatSistemas getCatsistemas() {
        return catsistemas;
    }

    public void setCatsistemas(CatSistemas catsistemas) {
        this.catsistemas = catsistemas;
    }

    public List<CatSistemas> getSistemas() {
        return sistemas;
    }

    public void setSistemas(List<CatSistemas> sistemas) {
        this.sistemas = sistemas;
    }

    public CatEquipos getCatequipos() {
        return catequipos;
    }

    public void setCatequipos(CatEquipos catequipos) {
        this.catequipos = catequipos;
    }

    public List<CatEquipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<CatEquipos> equipos) {
        this.equipos = equipos;
    }

    public CatListaEquipos getCatlistaequipos() {
        return catlistaequipos;
    }

    public void setCatlistaequipos(CatListaEquipos catlistaequipos) {
        this.catlistaequipos = catlistaequipos;
    }

    public List<CatListaEquipos> getLequipos() {
        return lequipos;
    }

    public void setLequipos(List<CatListaEquipos> lequipos) {
        this.lequipos = lequipos;
    }

    public String getCod_lis_equ() {
        return cod_lis_equ;
    }

    public void setCod_lis_equ(String cod_lis_equ) {
        this.cod_lis_equ = cod_lis_equ;
    }

    public String getCod_pai() {
        return cod_pai;
    }

    public void setCod_pai(String cod_pai) {
        this.cod_pai = cod_pai;
    }

    public String getCod_equ() {
        return cod_equ;
    }

    public void setCod_equ(String cod_equ) {
        this.cod_equ = cod_equ;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getNum_mod() {
        return num_mod;
    }

    public void setNum_mod(String num_mod) {
        this.num_mod = num_mod;
    }

    public String getNum_ser() {
        return num_ser;
    }

    public void setNum_ser(String num_ser) {
        this.num_ser = num_ser;
    }

    public String getDes_equ() {
        return des_equ;
    }

    public void setDes_equ(String des_equ) {
        this.des_equ = des_equ;
    }

    public String getDes_ubi() {
        return des_ubi;
    }

    public void setDes_ubi(String des_ubi) {
        this.des_ubi = des_ubi;
    }

    public String getFec_ing() {
        return fec_ing;
    }

    public void setFec_ing(String fec_ing) {
        this.fec_ing = fec_ing;
    }

    public String getFec_pue_ser() {
        return fec_pue_ser;
    }

    public void setFec_pue_ser(String fec_pue_ser) {
        this.fec_pue_ser = fec_pue_ser;
    }

    public String getFec_ult_man() {
        return fec_ult_man;
    }

    public void setFec_ult_man(String fec_ult_man) {
        this.fec_ult_man = fec_ult_man;
    }

    public String getFec_ret() {
        return fec_ret;
    }

    public void setFec_ret(String fec_ret) {
        this.fec_ret = fec_ret;
    }

    public String getCod_sys() {
        return cod_sys;
    }

    public void setCod_sys(String cod_sys) {
        this.cod_sys = cod_sys;
    }

    public String getCod_con() {
        return cod_con;
    }

    public void setCod_con(String cod_con) {
        this.cod_con = cod_con;
    }

    public String getCod_gar() {
        return cod_gar;
    }

    public void setCod_gar(String cod_gar) {
        this.cod_gar = cod_gar;
    }

    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getCod_bar() {
        return cod_bar;
    }

    public void setCod_bar(String cod_bar) {
        this.cod_bar = cod_bar;
    }

    public String getGar_fec_ini() {
        return gar_fec_ini;
    }

    public void setGar_fec_ini(String gar_fec_ini) {
        this.gar_fec_ini = gar_fec_ini;
    }

    public String getGar_fec_fin() {
        return gar_fec_fin;
    }

    public void setGar_fec_fin(String gar_fec_fin) {
        this.gar_fec_fin = gar_fec_fin;
    }

    public String getGar_obs() {
        return gar_obs;
    }

    public void setGar_obs(String gar_obs) {
        this.gar_obs = gar_obs;
    }

    public String getTabindex() {
        return tabindex;
    }

    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    public String getCod_equ_b() {
        return cod_equ_b;
    }

    public void setCod_equ_b(String cod_equ_b) {
        this.cod_equ_b = cod_equ_b;
    }

    public String getCod_cli_b() {
        return cod_cli_b;
    }

    public void setCod_cli_b(String cod_cli_b) {
        this.cod_cli_b = cod_cli_b;
    }

    public String getS_cod_sys() {
        return s_cod_sys;
    }

    public void setS_cod_sys(String s_cod_sys) {
        this.s_cod_sys = s_cod_sys;
    }

    public String getS_det_obs() {
        return s_det_obs;
    }

    public void setS_det_obs(String s_det_obs) {
        this.s_det_obs = s_det_obs;
    }

    public String getS_ver_ant() {
        return s_ver_ant;
    }

    public void setS_ver_ant(String s_ver_ant) {
        this.s_ver_ant = s_ver_ant;
    }

    public String getS_ver_act() {
        return s_ver_act;
    }

    public void setS_ver_act(String s_ver_act) {
        this.s_ver_act = s_ver_act;
    }

    public String getS_fec_act() {
        return s_fec_act;
    }

    public void setS_fec_act(String s_fec_act) {
        this.s_fec_act = s_fec_act;
    }

    public String getC_cod_con() {
        return c_cod_con;
    }

    public void setC_cod_con(String c_cod_con) {
        this.c_cod_con = c_cod_con;
    }

    public String getC_cod_ref() {
        return c_cod_ref;
    }

    public void setC_cod_ref(String c_cod_ref) {
        this.c_cod_ref = c_cod_ref;
    }

    public String getC_des_inf() {
        return c_des_inf;
    }

    public void setC_des_inf(String c_des_inf) {
        this.c_des_inf = c_des_inf;
    }

    public String getC_fec_con() {
        return c_fec_con;
    }

    public void setC_fec_con(String c_fec_con) {
        this.c_fec_con = c_fec_con;
    }

    public String getC_fec_exp() {
        return c_fec_exp;
    }

    public void setC_fec_exp(String c_fec_exp) {
        this.c_fec_exp = c_fec_exp;
    }

    public String getM_cod_man() {
        return m_cod_man;
    }

    public void setM_cod_man(String m_cod_man) {
        this.m_cod_man = m_cod_man;
    }

    public String getM_cod_tip() {
        return m_cod_tip;
    }

    public void setM_cod_tip(String m_cod_tip) {
        this.m_cod_tip = m_cod_tip;
    }

    public String getM_det_obs() {
        return m_det_obs;
    }

    public void setM_det_obs(String m_det_obs) {
        this.m_det_obs = m_det_obs;
    }

    public String getM_fec_ini() {
        return m_fec_ini;
    }

    public void setM_fec_ini(String m_fec_ini) {
        this.m_fec_ini = m_fec_ini;
    }

    public String getM_fec_fin() {
        return m_fec_fin;
    }

    public void setM_fec_fin(String m_fec_fin) {
        this.m_fec_fin = m_fec_fin;
    }

    public String getM_det_sta() {
        return m_det_sta;
    }

    public void setM_det_sta(String m_det_sta) {
        this.m_det_sta = m_det_sta;
    }

    public String getM_nomtip() {
        return m_nomtip;
    }

    public void setM_nomtip(String m_nomtip) {
        this.m_nomtip = m_nomtip;
    }

    public String getM_estado() {
        return m_estado;
    }

    public void setM_estado(String m_estado) {
        this.m_estado = m_estado;
    }

    public String getNombre_mantenimiento() {
        return nombre_mantenimiento;
    }

    public void setNombre_mantenimiento(String nombre_mantenimiento) {
        this.nombre_mantenimiento = nombre_mantenimiento;
    }

    public void iniciarventana() {

        tabindex = "0";

        cod_lis_equ = "";
        cod_pai = cbean.getCod_pai();
        cod_equ = "";
        cod_pro = "";
        cod_cli = "";
        num_mod = "";
        num_ser = "";
        des_equ = "";
        des_ubi = "";
        fec_ing = "";
        fec_pue_ser = "";
        fec_ult_man = "";
        fec_ret = "";
        cod_sys = "";
        cod_con = "";
        cod_gar = "";
        cod_usu = cbean.getCod_usu();
        cod_bar = "";
        gar_fec_ini = "";
        gar_fec_fin = "";
        gar_obs = "";
        s_cod_sys = "";
        s_det_obs = "";
        s_ver_ant = "";
        s_ver_act = "";
        s_fec_act = "";
        c_cod_con = "";
        c_cod_ref = "";
        c_des_inf = "";
        c_fec_con = "";
        c_fec_exp = "";
        m_cod_man = "";
        m_cod_tip = "";
        m_det_obs = "";
        m_fec_ini = "";
        m_fec_fin = "";
        m_det_sta = "";
        m_nomtip = "";
        m_estado = "";
        nombre_mantenimiento = "Equipo sin Guardar";
        llenarTipos();
        llenarPaises();
        llenarEquipos();
        llenarProveedores();
        llenarClientes();
        llenarUsuarios();
        mantenimientos1 = new ArrayList<>();
        mantenimientos2 = new ArrayList<>();
        sistemas = new ArrayList<>();
        contratos = new ArrayList<>();
        garantias = new ArrayList<>();
    }

    public void iniciarventanabuscar() {
        cod_equ_b = "0";
        cod_cli_b = "0";
        lequipos = new ArrayList<>();
    }

    public void cerrarventana() {
        tabindex = "0";
        
        cod_lis_equ = "";
        cod_pai = "";
        cod_equ = "";
        cod_pro = "";
        cod_cli = "";
        num_mod = "";
        num_ser = "";
        des_equ = "";
        des_ubi = "";
        fec_ing = "";
        fec_pue_ser = "";
        fec_ult_man = "";
        fec_ret = "";
        cod_sys = "";
        cod_con = "";
        cod_gar = "";
        cod_usu = "";
        cod_bar = "";
        gar_fec_ini = "";
        gar_fec_fin = "";
        gar_obs = "";
        s_cod_sys = "";
        s_det_obs = "";
        s_ver_ant = "";
        s_ver_act = "";
        s_fec_act = "";
        c_cod_con = "";
        c_cod_ref = "";
        c_des_inf = "";
        c_fec_con = "";
        c_fec_exp = "";
        m_cod_man = "";
        m_cod_tip = "";
        m_det_obs = "";
        m_fec_ini = "";
        m_fec_fin = "";
        m_det_sta = "";
        m_nomtip = "";
        m_estado = "";
        nombre_mantenimiento = "";
        tipos = new ArrayList<>();
        paises = new ArrayList<>();
        equipos = new ArrayList<>();
        proveedores = new ArrayList<>();
        clientes = new ArrayList<>();
        usuarios = new ArrayList<>();
        lequipos = new ArrayList<>();
    }

    public void cerrarventanabuscar() {
        cod_equ_b = "";
        cod_cli_b = "";
        nombre_mantenimiento = "";
    }

    public void llenarTipos() {
        String mQuery = "";
        try {
            cattipos = new CatTipos();
            tipos = new ArrayList<>();

            mQuery = "select cod_tip, nom_tip from cat_tip order by cod_tip;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                tipos.add(new CatTipos(
                        resVariable.getString(1),
                        resVariable.getString(2)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Tipos ManListaEquipos" + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarPaises() {
        try {
            paises = new ArrayList<>();

            String mQuery = "select cod_pai, nom_pai "
                    + "from cat_pai order by cod_pai;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                paises.add(new CatPaises(
                        resVariable.getString(1),
                        resVariable.getString(2)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Países en Lista Equipos. " + e.getMessage());
        }
    }

    public void llenarEquipos() {
        String mQuery = "";
        try {
            catequipos = new CatEquipos();
            equipos = new ArrayList<>();

            mQuery = "select equ.cod_equ, equ.cod_mar,equ.cod_ref, "
                    + "equ.nom_equ, equ.des_equ,mar.nom_mar,equ.det_ima "
                    + "from cat_equ as equ "
                    + "left join cat_mar as mar on mar.id_mar = equ.cod_mar "
                    + "order by equ.cod_equ;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                equipos.add(new CatEquipos(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Equipos en Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarProveedores() {
        String mQuery = "";
        try {
            catproveedores = new CatProveedores();
            proveedores = new ArrayList<>();

            mQuery = "select cod_pro,cod_pai,nom_pro,per_con,tel_con,det_mai  "
                    + "from cat_pro where cod_pai = " + cod_pai + " order by cod_pro;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                proveedores.add(new CatProveedores(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Proveedores en Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarClientes() {
        String mQuery = "";
        try {
            catclientes = new CatClientes();
            clientes = new ArrayList<>();

            mQuery = "select cod_cli,cod_pai, nom_cli,per_con,tel_con,det_mai  "
                    + "from cat_cli where cod_pai = " + cod_pai + " order by cod_cli;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                clientes.add(new CatClientes(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Clientes en Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarSistemas() {
        String mQuery = "";
        try {
            catsistemas = new CatSistemas();
            sistemas = new ArrayList<>();

            mQuery = "select cod_lis_equ,cod_sys,det_obs,ver_ant,ver_act,date_format(fec_act,'%d/%m/%Y') "
                    + "from tbl_sys "
                    + "where cod_lis_equ=" + cod_lis_equ + " "
                    + "order by cod_lis_equ;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                sistemas.add(new CatSistemas(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Sistemas en Lista Equipos. "
                    + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarContratos() {
        String mQuery = "";
        try {
            catcontratos = new CatContratos();
            contratos = new ArrayList<>();

            mQuery = "select cod_lis_equ, cod_con, cod_ref, des_inf, date_format(fec_con,'%d/%m/%Y'), date_format(fec_exp,'%d/%m/%Y') "
                    + "from tbl_con "
                    + "where cod_lis_equ=" + cod_lis_equ + " "
                    + "order by cod_lis_equ;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                contratos.add(new CatContratos(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Contratos en Lista Equipos. "
                    + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarGarantias() {
        String mQuery = "";
        try {
            gar_obs = "";
            gar_fec_ini = "";
            gar_fec_fin = "";

            mQuery = "select cod_lis_equ, cod_gar, det_obs, "
                    + "date_format(fec_ini,'%d/%m/%Y'), "
                    + "date_format(fec_exp,'%d/%m/%Y') "
                    + "from tbl_gar "
                    + "where cod_lis_equ=" + cod_lis_equ + " "
                    + "order by cod_lis_equ;";

            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                gar_obs = resVariable.getString(3);
                gar_fec_ini = resVariable.getString(4);
                gar_fec_fin = resVariable.getString(5);
            }
            mAccesos.Desconectar();

            if ("00/00/0000".equals(gar_fec_ini)) {
                gar_fec_ini = "";
            }
            if ("00/00/0000".equals(gar_fec_fin)) {
                gar_fec_fin = "";
            }
        } catch (Exception e) {
            System.out.println("Error en el llenado de Garantías en Lista Equipos. "
                    + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarUsuarios() {
        try {
            catusuarios = new CatUsuarios();
            usuarios = new ArrayList<>();

            String mQuery = "select usu.cod_usu, usu.nom_usu, usu.des_pas, "
                    + "usu.tip_usu, usu.cod_pai, "
                    + "usu.cod_dep, usu.det_nom, usu.det_mai,ifnull(pai.nom_pai,'') as nom_pai, "
                    + "ifnull(dep.nom_dep,'') as nom_dep "
                    + "from cat_usu as usu "
                    + "left join cat_dep as dep on usu.cod_dep = dep.cod_dep "
                    + "and usu.cod_pai = dep.cod_pai "
                    + "left join cat_pai as pai on usu.cod_pai = pai.cod_pai "
                    + "where usu.cod_pai =" + cbean.getCod_pai() + " "
                    + "order by cod_usu;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                usuarios.add(new CatUsuarios(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8),
                        resVariable.getString(9),
                        resVariable.getString(10)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Usuarios en Lista Equipos. " + e.getMessage());
        }
    }

    public void llenarMantenimientos() {
        String mQuery = "";
        try {
            catmantenimientos1 = new CatMantenimientos();
            mantenimientos1 = new ArrayList<>();

            mQuery = "select mm.cod_lis_equ, mm.cod_man, mm.cod_tip, mm.det_obs, "
                    + "date_format(mm.fec_ini,'%d/%m/%Y'), "
                    + "date_format(mm.fec_fin,'%d/%m/%Y'), "
                    + "mm.det_sta, mm.cod_usu,tip.nom_tip,"
                    + "case mm.det_sta "
                    + "when 1 then 'PENDIENTE' "
                    + "when 2 then 'CANCELADO' "
                    + "when 3 then 'EN PROCESO' "
                    + "when 4 then 'FINALIZADO' "
                    + "end as status  "
                    + "from tbl_mae_man as mm "
                    + "left join cat_tip as tip on mm.cod_tip = tip.cod_tip "
                    + "where mm.det_sta IN (2,4) "
                    + "and mm.cod_usu = " + cbean.getCod_usu() + " "
                    + "and mm.cod_lis_equ=" + cod_lis_equ + " "
                    + "order by mm.cod_man;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                mantenimientos1.add(new CatMantenimientos(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8),
                        resVariable.getString(9),
                        resVariable.getString(10)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Mantenimientos en Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarMantenimientosP() {
        String mQuery = "";
        try {
            catmantenimientos2 = new CatMantenimientos();
            mantenimientos2 = new ArrayList<>();

            mQuery = "select mm.cod_lis_equ, mm.cod_man, mm.cod_tip, mm.det_obs, "
                    + "date_format(mm.fec_ini,'%d/%m/%Y'), "
                    + "date_format(mm.fec_fin,'%d/%m/%Y'), "
                    + "mm.det_sta, mm.cod_usu,tip.nom_tip,"
                    + "case mm.det_sta "
                    + "when 1 then 'PENDIENTE' "
                    + "when 2 then 'CANCELADO' "
                    + "when 3 then 'EN PROCESO' "
                    + "when 4 then 'FINALIZADO' "
                    + "end as status  "
                    + "from tbl_mae_man as mm "
                    + "left join cat_tip as tip on mm.cod_tip = tip.cod_tip "
                    + "where "
                    + "mm.det_sta IN (1,3) "
                    + "and mm.cod_usu = " + cbean.getCod_usu() + " "
                    + "and mm.cod_lis_equ =" + cod_lis_equ + " "
                    + "order by mm.cod_man;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                mantenimientos2.add(new CatMantenimientos(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8),
                        resVariable.getString(9),
                        resVariable.getString(10)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Mantenimientos Pendientes en Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
        }
    }

    public void llenarLequipos() {
        try {
            catlistaequipos = new CatListaEquipos();
            lequipos = new ArrayList<>();
            String mAnexo = "";
            if (!"0".equals(cod_equ_b)) {
                mAnexo = "and lequ.cod_equ =" + cod_equ_b;
            } 

            String mQuery = "select lequ.cod_lis_equ, lequ.cod_pai, lequ.cod_equ, "
                    + "lequ.cod_pro, lequ.cod_cli, lequ.num_mod, lequ.num_ser, "
                    + "lequ.des_equ, lequ.des_ubi, "
                    + "DATE_FORMAT(lequ.fec_ing,'%d/%m/%Y'), "
                    + "DATE_FORMAT(lequ.fec_pue_ser,'%d/%m/%Y'), "
                    + "DATE_FORMAT(lequ.fec_ult_man,'%d/%m/%Y'), "
                    + "DATE_FORMAT(lequ.fec_ret,'%d/%m/%Y'), "
                    + "lequ.cod_sys, "
                    + "lequ.cod_con, lequ.cod_gar, lequ.cod_usu, lequ.cod_bar, "
                    + "cequ.nom_equ as nomequ, cpro.nom_pro as nompro, "
                    + "ccli.nom_cli as nomcli, cusu.det_nom as nomusu "
                    + "from lis_equ as lequ "
                    + "left join cat_equ as cequ on lequ.cod_equ = cequ.cod_equ "
                    + "left join cat_pro as cpro on lequ.cod_pro = cpro.cod_pro and lequ.cod_pai = cpro.cod_pai "
                    + "left join cat_cli as ccli on lequ.cod_cli = ccli.cod_cli and lequ.cod_pai = ccli.cod_pai "
                    + "left join cat_usu as cusu on lequ.cod_usu = cusu.cod_usu and lequ.cod_pai = cusu.cod_pai "
                    + "where " 
                    + "lequ.cod_pai = 1 "
                    + mAnexo
                    + " order by lequ.cod_lis_equ;";
            ResultSet resVariable;
            Accesos mAccesos = new Accesos();
            mAccesos.Conectar();
            resVariable = mAccesos.querySQLvariable(mQuery);
            while (resVariable.next()) {
                lequipos.add(new CatListaEquipos(
                        resVariable.getString(1),
                        resVariable.getString(2),
                        resVariable.getString(3),
                        resVariable.getString(4),
                        resVariable.getString(5),
                        resVariable.getString(6),
                        resVariable.getString(7),
                        resVariable.getString(8),
                        resVariable.getString(9),
                        resVariable.getString(10),
                        resVariable.getString(11),
                        resVariable.getString(12),
                        resVariable.getString(13),
                        resVariable.getString(14),
                        resVariable.getString(15),
                        resVariable.getString(16),
                        resVariable.getString(17),
                        resVariable.getString(18),
                        resVariable.getString(19),
                        resVariable.getString(20),
                        resVariable.getString(21),
                        resVariable.getString(22)
                ));
            }
            mAccesos.Desconectar();

        } catch (Exception e) {
            System.out.println("Error en el llenado de Lista Equipos. " + e.getMessage());
        }
    }

    public void nuevo() {

        tabindex = "0";

        cod_lis_equ = "";
        cod_pai = cbean.getCod_pai();
        cod_equ = "";
        cod_pro = "";
        cod_cli = "";
        num_mod = "";
        num_ser = "";
        des_equ = "";
        des_ubi = "";
        fec_ing = "";
        fec_pue_ser = "";
        fec_ult_man = "";
        fec_ret = "";
        cod_sys = "";
        cod_con = "";
        cod_gar = "";
        cod_usu = cbean.getCod_usu();
        cod_bar = "";
        gar_fec_ini = "";
        gar_fec_fin = "";
        gar_obs = "";
        s_cod_sys = "";
        s_det_obs = "";
        s_ver_ant = "";
        s_ver_act = "";
        s_fec_act = "";
        c_cod_con = "";
        c_cod_ref = "";
        c_des_inf = "";
        c_fec_con = "";
        c_fec_exp = "";
        m_cod_man = "";
        m_cod_tip = "";
        m_det_obs = "";
        m_fec_ini = "";
        m_fec_fin = "";
        m_det_sta = "";
        m_nomtip = "";
        m_estado = "";
        nombre_mantenimiento = "Equipo sin Guardar";
        mantenimientos1 = new ArrayList<>();
        mantenimientos2 = new ArrayList<>();
        catsistemas = new CatSistemas();
        catcontratos = new CatContratos();
        catgarantias = new CatGarantias();
        catlistaequipos = new CatListaEquipos();
    }

    public void guardar() {
        String mQuery = "";
        if (validardatos()) {
            try {
                Accesos mAccesos = new Accesos();
                mAccesos.Conectar();
                if ("".equals(cod_lis_equ)) {
                    mQuery = "select ifnull(max(cod_lis_equ),0)+1 as codigo from lis_equ;";
                    cod_lis_equ = mAccesos.strQuerySQLvariable(mQuery);
                    mQuery = "insert into lis_equ ("
                            + "   cod_lis_equ"
                            + "  ,cod_pai"
                            + "  ,cod_equ"
                            + "  ,cod_pro"
                            + "  ,cod_cli"
                            + "  ,num_mod"
                            + "  ,num_ser"
                            + "  ,des_equ"
                            + "  ,des_ubi"
                            + "  ,fec_ing"
                            + "  ,fec_pue_ser"
                            + "  ,fec_ult_man"
                            + "  ,fec_ret"
                            + "  ,cod_sys"
                            + "  ,cod_con"
                            + "  ,cod_gar"
                            + "  ,cod_usu"
                            + "  ,cod_bar"
                            + ") VALUES ("
                            + cod_lis_equ + ","
                            + cod_pai + ","
                            + cod_equ + ","
                            + cod_pro + ","
                            + cod_cli + ",'"
                            + num_mod + "','"
                            + num_ser + "','"
                            + des_equ + "','"
                            + des_ubi + "',str_to_date('"
                            + fec_ing + "','%d/%m/%Y'),str_to_date('"
                            + fec_pue_ser + "','%d/%m/%Y'),str_to_date('"
                            + fec_ult_man + "','%d/%m/%Y'),str_to_date('"
                            + fec_ret + "','%d/%m/%Y'),"
                            + cod_lis_equ + ","
                            + cod_lis_equ + ",0,"
                            + cod_usu + ",'"
                            + cod_bar
                            + "')";

                    mAccesos.dmlSQLvariable("insert into tbl_gar (cod_lis_equ,cod_gar,det_obs,fec_ini,fec_exp) values "
                            + "(" + cod_lis_equ + "," + cod_lis_equ + ",'" + gar_obs + "',str_to_date('" + gar_fec_ini + "','%d/%m/%Y'),"
                            + "str_to_date('" + gar_fec_fin + "','%d/%m/%Y'));");

                } else {
                    mQuery = "update lis_equ SET "
                            + " cod_equ =" + cod_equ
                            + " ,cod_pro =" + cod_pro
                            + " ,cod_cli =" + cod_cli
                            + " ,num_mod =" + num_mod
                            + " ,num_ser =" + num_ser
                            + " ,des_equ =" + des_equ
                            + " ,des_ubi =" + des_ubi
                            + " ,fec_ing =" + fec_ing
                            + " ,fec_pue_ser =" + fec_pue_ser
                            + " ,fec_ult_man =" + fec_ult_man
                            + " ,fec_ret =" + fec_ret
                            + " ,cod_usu =" + cod_usu
                            + " ,cod_bar =" + cod_bar
                            + " WHERE cod_lis_equ = " + cod_lis_equ + ";";

                    mAccesos.dmlSQLvariable("update tbl_gar set "
                            + "det_obs = '" + gar_obs + "' "
                            + ",fec_ini = str_to_date('" + gar_fec_ini + "') "
                            + ",fec_exp = str_to_date('" + gar_fec_fin + "') "
                            + "where cod_lis_equ =" + cod_lis_equ + ";");

                }
                mAccesos.dmlSQLvariable(mQuery);
                mAccesos.Desconectar();
                addMessage("Guardar Lista Equipos", "Información Almacenada con éxito.", 1);
            } catch (Exception e) {
                addMessage("Guardar Lista Equipos", "Error al momento de guardar la información. " + e.getMessage(), 2);
                System.out.println("Error al Guardar Lista Equipos. " + e.getMessage() + " Query: " + mQuery);
            }
            llenarLequipos();
        }
        nuevo();

    }

    public void eliminar() {
        String mQuery = "";
        Accesos mAccesos = new Accesos();
        mAccesos.Conectar();
        if ("".equals(cod_lis_equ) == false) {
            try {
                mQuery = "delete from tbl_con where cod_lis_equ=" + cod_lis_equ + ";";
                mAccesos.dmlSQLvariable(mQuery);
                mQuery = "delete from tbl_sys where cod_lis_equ=" + cod_lis_equ + ";";
                mAccesos.dmlSQLvariable(mQuery);
                mQuery = "delete from tbl_gar where cod_lis_equ=" + cod_lis_equ + ";";
                mAccesos.dmlSQLvariable(mQuery);
                mQuery = "delete from lis_equ where cod_lis_equ=" + cod_lis_equ + ";";
                mAccesos.dmlSQLvariable(mQuery);
                addMessage("Eliminar Equipo", "Información Eliminada con éxito.", 1);
            } catch (Exception e) {
                addMessage("Eliminar Equipo", "Error al momento de Eliminar la información. " + e.getMessage(), 2);
                System.out.println("Error al Eliminar Equipo. " + e.getMessage() + " Query: " + mQuery);
            }
            llenarLequipos();
            nuevo();
        } else {
            addMessage("Eliminar Equipo", "Debe elegir un Registro.", 2);
        }
        mAccesos.Desconectar();

    }

    public boolean validardatos() {
        boolean mValidar = true;
        if ("".equals(cod_equ) || "0".equals(cod_equ)) {
            mValidar = false;
            addMessage("Validar Datos", "Debe Escoger un Equipo.", 2);
        }
        return mValidar;

    }

    public void onRowSelect(SelectEvent event) {
        cod_lis_equ = ((CatListaEquipos) event.getObject()).getCod_lis_equ();
        cod_pai = ((CatListaEquipos) event.getObject()).getCod_pai();
        cod_equ = ((CatListaEquipos) event.getObject()).getCod_equ();
        cod_pro = ((CatListaEquipos) event.getObject()).getCod_pro();
        cod_cli = ((CatListaEquipos) event.getObject()).getCod_cli();
        num_mod = ((CatListaEquipos) event.getObject()).getNum_mod();
        num_ser = ((CatListaEquipos) event.getObject()).getNum_ser();
        des_equ = ((CatListaEquipos) event.getObject()).getDes_equ();
        des_ubi = ((CatListaEquipos) event.getObject()).getDes_ubi();
        fec_ing = ((CatListaEquipos) event.getObject()).getFec_ing();
        fec_pue_ser = ((CatListaEquipos) event.getObject()).getFec_pue_ser();
        fec_ult_man = ((CatListaEquipos) event.getObject()).getFec_ult_man();
        fec_ret = ((CatListaEquipos) event.getObject()).getFec_ret();
        cod_sys = ((CatListaEquipos) event.getObject()).getCod_sys();
        cod_con = ((CatListaEquipos) event.getObject()).getCod_con();
        cod_gar = ((CatListaEquipos) event.getObject()).getCod_gar();
        cod_usu = ((CatListaEquipos) event.getObject()).getCod_usu();
        cod_bar = ((CatListaEquipos) event.getObject()).getCod_bar();
        if ("00/00/0000".equals(fec_ing)) {
            fec_ing = "";
        }
        if ("00/00/0000".equals(fec_pue_ser)) {
            fec_pue_ser = "";
        }
        if ("00/00/0000".equals(fec_ult_man)) {
            fec_ult_man = "";
        }
        if ("00/00/0000".equals(fec_ret)) {
            fec_ret = "";
        }
        nombre_mantenimiento = ((CatListaEquipos) event.getObject()).getNomequ() + " " + num_ser;
        llenarSistemas();
        llenarContratos();
        llenarGarantias();
        llenarMantenimientos();
        llenarMantenimientosP();
        lequipos = null;
        RequestContext.getCurrentInstance().update("frmMantenimientos");
        RequestContext.getCurrentInstance().update("frmListaEquipos");
        RequestContext.getCurrentInstance().execute("PF('wSearchLE').hide()");
    }

    public void onRowSelectMan(SelectEvent event) {
        m_cod_man = ((CatMantenimientos) event.getObject()).getCod_man();
        m_cod_tip = ((CatMantenimientos) event.getObject()).getCod_tip();
        m_det_obs = ((CatMantenimientos) event.getObject()).getDet_obs();
        m_fec_ini = ((CatMantenimientos) event.getObject()).getFec_ini();
        m_fec_fin = ((CatMantenimientos) event.getObject()).getFec_fin();
        m_det_sta = ((CatMantenimientos) event.getObject()).getDet_sta();
        m_nomtip = ((CatMantenimientos) event.getObject()).getNomtip();
        m_estado = ((CatMantenimientos) event.getObject()).getStatus();
    }

    /**
     * ************************* SISTEMAS *************************************
     */
    public void agregarsistema() {
        if (validarsistema()) {
            int correlativo = 0, insert = 0;
            try {
                for (int i = 0; i < sistemas.size(); i++) {
                    if (Integer.valueOf(sistemas.get(i).getCod_sys()) > correlativo) {
                        correlativo = Integer.valueOf(sistemas.get(i).getCod_sys());
                    }
                }

                if (insert == 0) {
                    sistemas.add(new CatSistemas(
                            cod_lis_equ,
                            String.valueOf(correlativo),
                            s_det_obs,
                            s_ver_ant,
                            s_ver_act,
                            s_fec_act
                    ));

                    s_det_obs = "";
                    s_ver_ant = "";
                    s_ver_act = "";
                    s_fec_act = "";

                }

            } catch (Exception e) {
                System.out.println("Error en Agregar Sistemas ManListaEquipos." + e.getMessage());
            }
        }

    }

    public boolean validarsistema() {
        boolean mvalidar = true;
        if ("".equals(s_det_obs)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar un Nombre de Sistema.", 2);
        }
        if ("".equals(s_ver_act)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Versión Actual del Software.", 2);
        }
        if ("".equals(s_fec_act)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Fecha de Actualización.", 2);
        }
        if (s_ver_ant.equals(s_ver_act)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Versión Actual del Software Distinta a la Anterior.", 2);
        }

        return mvalidar;

    }

    public void eliminarsistema() {
        s_cod_sys = catsistemas.getCod_sys();
        catsistemas = null;
        if ("".equals(s_cod_sys)) {
            addMessage("Eliminar Detalles", "Debe Seleccionar un Sistema para Remover.", 2);
        } else {
            for (int i = 0; i < sistemas.size(); i++) {
                if (s_cod_sys.equals(sistemas.get(i).getCod_sys())) {
                    sistemas.remove(i);
                }
            }
            s_cod_sys = "";
            s_det_obs = "";
            s_ver_ant = "";
            s_ver_act = "";
            s_fec_act = "";
            //catlistaequipos = new CatListaEquipos();
        }
    }

    /**
     * ************** CONTRATOS ***********************
     */
    public void agregarcontrato() {
        if (validarcontrato()) {
            int correlativo = 0, insert = 0;
            try {
                for (int i = 0; i < contratos.size(); i++) {
                    if (Integer.valueOf(contratos.get(i).getCod_con()) > correlativo) {
                        correlativo = Integer.valueOf(contratos.get(i).getCod_con());
                    }
                }

                if (insert == 0) {
                    contratos.add(new CatContratos(
                            cod_lis_equ,
                            String.valueOf(correlativo),
                            c_cod_ref,
                            c_des_inf,
                            c_fec_con,
                            c_fec_exp
                    ));

                    c_cod_con = "";
                    c_cod_ref = "";
                    c_des_inf = "";
                    c_fec_con = "";
                    c_fec_exp = "";

                }

            } catch (Exception e) {
                System.out.println("Error en Agregar Contratos ManListaEquipos." + e.getMessage());
            }
        }

    }

    public boolean validarcontrato() {
        boolean mvalidar = true;
        if ("".equals(c_cod_ref)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar un Número de Contrato.", 2);
        }
        if ("".equals(c_fec_con)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Fecha de Inicio del Contrato.", 2);
        }
        if ("".equals(c_fec_exp)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Fecha de Expiración del Contrato.", 2);
        }

        return mvalidar;

    }

    public void eliminarcontrato() {
        c_cod_con = catcontratos.getCod_con();
        catcontratos = null;
        if ("".equals(c_cod_con)) {
            addMessage("Eliminar Detalles", "Debe Seleccionar un Contrato para Remover.", 2);
        } else {
            for (int i = 0; i < contratos.size(); i++) {
                if (c_cod_con.equals(contratos.get(i).getCod_con())) {
                    contratos.remove(i);
                }
            }
            c_cod_con = "";
            c_cod_ref = "";
            c_des_inf = "";
            c_fec_con = "";
            c_fec_exp = "";
        }
    }

    /**
     * ********************* MANTENIMIENTOS ************
     */
    public void agregarmantenimiento() {
        if (validarmantenimiento()) {
            int correlativo = 0, insert = 0;
            try {
                for (int i = 0; i < mantenimientos2.size(); i++) {
                    if (Integer.valueOf(mantenimientos2.get(i).getCod_man()) > correlativo) {
                        correlativo = Integer.valueOf(mantenimientos2.get(i).getCod_man());
                    }
                }
                Accesos macc = new Accesos();
                macc.Conectar();
                String nomtip = macc.strQuerySQLvariable("select nom_tip from cat_tip where cod_tip =" + m_cod_tip + ";");
                String status = macc.strQuerySQLvariable("select case " + m_cod_tip + " when 1 then 'PENDIENTE' when 2 then 'CANCELADO' when 3 then 'EN PROCESO' when 4 then 'FINALIZADO' end as status;");
                macc.Desconectar();

                if (insert == 0) {
                    mantenimientos2.add(new CatMantenimientos(
                            cod_lis_equ,
                            String.valueOf(correlativo),
                            m_cod_tip,
                            m_det_obs,
                            m_fec_ini,
                            m_fec_fin,
                            m_det_sta,
                            cbean.getCod_usu(),
                            nomtip,
                            status
                    ));

                    m_cod_man = "";
                    m_cod_tip = "";
                    m_det_obs = "";
                    m_fec_ini = "";
                    m_fec_fin = "";
                    m_det_sta = "";

                }

            } catch (Exception e) {
                System.out.println("Error en Agregar Mantenimiento ManListaEquipos." + e.getMessage());
            }
        }

    }

    public boolean validarmantenimiento() {
        boolean mvalidar = true;
        if ("".equals(m_cod_tip)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Escoger un Tipo de Mantenimiento.", 2);
        }
        if ("".equals(m_fec_ini)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar La Fecha de Inicio del Mantenimiento.", 2);
        }
        if ("".equals(m_det_sta)) {
            mvalidar = false;
            addMessage("Validar Datos", "Debe Ingresar el Estado del Mantenimiento.", 2);
        }

        return mvalidar;

    }

    public void eliminarmantenimiento() {
        m_cod_man = catmantenimientos2.getCod_man();
        catmantenimientos2 = null;
        if ("".equals(c_cod_con)) {
            addMessage("Eliminar Detalles", "Debe Seleccionar un Mantenimiento para Remover.", 2);
        } else {
            for (int i = 0; i < mantenimientos2.size(); i++) {
                if (c_cod_con.equals(mantenimientos2.get(i).getCod_man())) {
                    mantenimientos2.remove(i);
                }
            }
            m_cod_man = "";
            m_cod_tip = "";
            m_det_obs = "";
            m_fec_ini = "";
            m_fec_fin = "";
            m_det_sta = "";
        }
    }

    /**
     * ************************* GENERALES ***********************************
     */
    public void onTabChange(TabChangeEvent event) {
        switch (event.getTab().getId()) {
            case "tabGeneral":
                tabindex = "0";
                break;
            case "tabHistoria":
                tabindex = "1";
                break;
            case "tabSoftware":
                tabindex = "2";
                break;
            case "tabContratos":
                tabindex = "3";
                break;
            case "tabMantenimiento":
                tabindex = "4";
                break;
        }
        //System.out.println(tabindex);
        //RequestContext.getCurrentInstance().update(":frmListaEquipos:tvLE");
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
