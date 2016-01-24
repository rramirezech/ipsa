package paquetes;

import java.io.Serializable;

public class CatListaEquipos implements Serializable {

    private String cod_lis_equ, cod_pai, cod_equ, cod_pro, cod_cli, num_mod, num_ser,
            des_equ, des_ubi, fec_ing, fec_pue_ser, fec_ult_man, fec_ret, cod_sys,
            cod_con, cod_gar, cod_usu, cod_bar, nomequ, nompro, nomcli, nomusu;

    public CatListaEquipos() {
    }

    public CatListaEquipos(String cod_lis_equ, String cod_pai, String cod_equ, String cod_pro, String cod_cli, String num_mod, String num_ser, String des_equ, String des_ubi, String fec_ing, String fec_pue_ser, String fec_ult_man, String fec_ret, String cod_sys, String cod_con, String cod_gar, String cod_usu, String cod_bar, String nomequ, String nompro, String nomcli, String nomusu) {
        this.cod_lis_equ = cod_lis_equ;
        this.cod_pai = cod_pai;
        this.cod_equ = cod_equ;
        this.cod_pro = cod_pro;
        this.cod_cli = cod_cli;
        this.num_mod = num_mod;
        this.num_ser = num_ser;
        this.des_equ = des_equ;
        this.des_ubi = des_ubi;
        this.fec_ing = fec_ing;
        this.fec_pue_ser = fec_pue_ser;
        this.fec_ult_man = fec_ult_man;
        this.fec_ret = fec_ret;
        this.cod_sys = cod_sys;
        this.cod_con = cod_con;
        this.cod_gar = cod_gar;
        this.cod_usu = cod_usu;
        this.cod_bar = cod_bar;
        this.nomequ = nomequ;
        this.nompro = nompro;
        this.nomcli = nomcli;
        this.nomusu = nomusu;
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

    public String getCod_bar() {
        return cod_bar;
    }

    public void setCod_bar(String cod_bar) {
        this.cod_bar = cod_bar;
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

    public String getNomequ() {
        return nomequ;
    }

    public void setNomequ(String nomequ) {
        this.nomequ = nomequ;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

}
