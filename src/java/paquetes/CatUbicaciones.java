package paquetes;

import java.io.Serializable;

public class CatUbicaciones implements Serializable {

    private String id_ubi, cod_bod, nom_ubi, nombod;

    public CatUbicaciones() {
    }

    public CatUbicaciones(String id_ubi, String cod_bod, String nom_ubi, String nombod) {
        this.id_ubi = id_ubi;
        this.cod_bod = cod_bod;
        this.nom_ubi = nom_ubi;
        this.nombod = nombod;
    }

    public String getId_ubi() {
        return id_ubi;
    }

    public void setId_ubi(String id_ubi) {
        this.id_ubi = id_ubi;
    }

    public String getCod_bod() {
        return cod_bod;
    }

    public void setCod_bod(String cod_bod) {
        this.cod_bod = cod_bod;
    }

    public String getNom_ubi() {
        return nom_ubi;
    }

    public void setNom_ubi(String nom_ubi) {
        this.nom_ubi = nom_ubi;
    }

    public String getNombod() {
        return nombod;
    }

    public void setNombod(String nombod) {
        this.nombod = nombod;
    }

}
