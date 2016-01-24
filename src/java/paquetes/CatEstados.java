package paquetes;

import java.io.Serializable;

public class CatEstados implements Serializable{

    private String id_est,des_est;
    
    public CatEstados() {
    }

    public CatEstados(String id_est, String des_est) {
        this.id_est = id_est;
        this.des_est = des_est;
    }

    public String getId_est() {
        return id_est;
    }

    public void setId_est(String id_est) {
        this.id_est = id_est;
    }

    public String getDes_est() {
        return des_est;
    }

    public void setDes_est(String des_est) {
        this.des_est = des_est;
    }
    
}
