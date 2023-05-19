
package uf5.pkg6.projecte.streamin.vista;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
/**
 * Classe CompteTarifaVista que representa la visualització dels contractes de tarifa en una interfície gràfica.
 */
public class CompteTarifaVista {
    
    private TableView tblContactes;
     /**
     * Mètode per visualitzar els contractes de tarifa.
     *
     * @return una instància de VBox que conté la visualització dels contractes de tarifa
     */
    public VBox visualitzarContractesTarifa(){
        
        System.out.println("visualitzarContractesTarifa");
        
        VBox vb = new VBox();
        
        Label lblContractes = new Label("VISUALITZACIÓ DE CONTRACTES");
        lblContractes.setFont(new Font("ArialBond",20));
        
        
        
        return null;
        
        
    
    }   
}
