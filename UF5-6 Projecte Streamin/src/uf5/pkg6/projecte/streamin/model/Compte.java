
package uf5.pkg6.projecte.streamin.model;

import java.time.LocalDate;
import java.util.Date;
/**
 * Classe Compte.
 * 
 * Classe que representa un compte d'usuari.
 */
public class Compte extends Client{
    
    private int idCompte;
    private String usuari;
    private String contrassenya;
    private Date dataAlta;
    private int idModalitat;

    public void setIdModalitat(int idModalitat) {
        this.idModalitat = idModalitat;
    }

    public int getIdModalitat() {
        return idModalitat;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public String getUsuari() {
        return usuari;
    }

    public String getContrassenya() {
        return contrassenya;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public void setContrassenya(String contrassenya) {
        this.contrassenya = contrassenya;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }
    
}
