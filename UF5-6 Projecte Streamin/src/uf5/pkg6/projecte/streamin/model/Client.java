/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.pkg6.projecte.streamin.model;

import java.util.Date;

public class Client {
    
    private int idClient;
    private String nomClient;
    private String dni;
    private Date dataN;
    private String adreça;
    private String nacionalitat;
    private String email;
    private String telefon;
    private String num_targeta;
    private String num_compte_banc;

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setNum_targeta(String num_targeta) {
        this.num_targeta = num_targeta;
    }

    public void setNum_compte_banc(String num_compte_banc) {
        this.num_compte_banc = num_compte_banc;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getDni() {
        return dni;
    }

    public Date getDataN() {
        return dataN;
    }

    public String getAdreça() {
        return adreça;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getNum_targeta() {
        return num_targeta;
    }

    public String getNum_compte_banc() {
        return num_compte_banc;
    }
}
