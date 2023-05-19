package uf5.pkg6.projecte.streamin.model;

public class Produccio {
    
    private int id;
    private String Nom;
    private String nacionalitat;
    private int any;
    private int preferit;
    private String foto;
    private byte tipus;
    
    public Produccio(){
        
    }

    public Produccio(String Nom, int any, String genere, String categoria, String director, String actor) {
        this.Nom = Nom;
        this.any = any;
    }
    
    public Produccio(int id,String Nom, int any, String genere, String categoria, String director, String actor) {
        this.id = id;
        this.Nom = Nom;
        this.any = any;
    }

    //Getters i Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }
    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }

    public int getPreferit() {
        return preferit;
    }
    public void setPreferit(int preferit) {
        this.preferit = preferit;
    }

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public byte getTipus() {
        return tipus;
    }
    public void setTipus(byte tipus) {
        this.tipus = tipus;
    }
    
}
