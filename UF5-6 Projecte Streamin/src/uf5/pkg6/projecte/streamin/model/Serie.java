
package uf5.pkg6.projecte.streamin.model;

import java.util.ArrayList;
/**
 * Classe Serie que hereta de Produccio.
 * 
 * Classe que representa una sèrie de televisió.
 */
public class Serie extends Produccio{
    
    private int numCapitols;
    private double duradaTotal;
    
    private ArrayList<String> categories;
    private ArrayList<String> directors;
    private ArrayList<String> actors;

    
    public Serie() {
        
        this.categories = new ArrayList();
        this.directors = new ArrayList();
        this.actors = new ArrayList();
    }
    
    public Serie(int numCapitols ,double duradaTotal, String Nom, int any, String genere, String categoria, String director, String actor) {
        super(Nom, any, genere, categoria, director, actor);
        this.numCapitols = numCapitols;
        this.duradaTotal = duradaTotal;
        
        this.actors = new ArrayList();
        this.directors = new ArrayList();
        this.categories = new ArrayList();
    }
    
    public void afegirDirector(String director){
        this. directors.add(director);
    }
    
    public void afegirActor(String actor){
        this.actors.add(actor);
    }
    
    public void afegirCategoria(String categoria){
        this.categories.add(categoria);
    }
    
    public String getDirector(int pos){
        if (pos<=directors.size()-1) {
            return this.directors.get(pos);
        }
        return "";
    }

    
}
