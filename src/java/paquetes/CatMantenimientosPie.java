package paquetes;

import java.io.Serializable;

public class CatMantenimientosPie implements Serializable {

    private String cod_lis_equ,cod_man,det_man,det_can,cod_lis_pie,num_ser,cod_usu, nompie;

    public CatMantenimientosPie() {
    }

    public CatMantenimientosPie(String cod_lis_equ, String cod_man, String det_man, String det_can, String cod_lis_pie, String num_ser, String cod_usu, String nompie) {
        this.cod_lis_equ = cod_lis_equ;
        this.cod_man = cod_man;
        this.det_man = det_man;
        this.det_can = det_can;
        this.cod_lis_pie = cod_lis_pie;
        this.num_ser = num_ser;
        this.cod_usu = cod_usu;
        this.nompie = nompie;
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

    public String getDet_man() {
        return det_man;
    }

    public void setDet_man(String det_man) {
        this.det_man = det_man;
    }

    public String getDet_can() {
        return det_can;
    }

    public void setDet_can(String det_can) {
        this.det_can = det_can;
    }

    public String getCod_lis_pie() {
        return cod_lis_pie;
    }

    public void setCod_lis_pie(String cod_lis_pie) {
        this.cod_lis_pie = cod_lis_pie;
    }

    public String getNum_ser() {
        return num_ser;
    }

    public void setNum_ser(String num_ser) {
        this.num_ser = num_ser;
    }

    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getNompie() {
        return nompie;
    }

    public void setNompie(String nompie) {
        this.nompie = nompie;
    }

}
