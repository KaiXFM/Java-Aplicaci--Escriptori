
package uf5.pkg6.projecte.streamin.vista;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import uf5.pkg6.projecte.basedades.CompteDAO;
import uf5.pkg6.projecte.streamin.model.Compte;
/**
 * Classe CompteTarifaVista que representa la visualització dels contractes de tarifa en una interfície gràfica.
 */
public class CompteTarifaVista {
    
    private TableView tblContractes;
    private Label lblModalitat;
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
        lblContractes.setTextFill(Color.RED);
        
        MenuItem menuItemGR = new MenuItem("Gratuïta");
        MenuItem menuItemBA = new MenuItem("Bàsica");
        MenuItem menuItemPR = new MenuItem("Premium");
        MenuItem menuItemTO = new MenuItem("Totes");
        
        MenuButton menuButton = new MenuButton("Modalitats",null,menuItemGR,menuItemBA,menuItemPR,menuItemTO);
        
        menuItemGR.setOnAction(event -> visualitzarContractesTarifaDades(1));
        menuItemGR.setOnAction(event -> visualitzarContractesTarifaDades(2));
        menuItemGR.setOnAction(event -> visualitzarContractesTarifaDades(3));
        menuItemGR.setOnAction(event -> visualitzarContractesTarifaDades(4));
        
        lblModalitat = new Label();
        lblModalitat.setFont(new Font("ArialBold",30));
        lblModalitat.setTextFill(Color.BLUE);
        
        tblContractes = new TableView();
        
        TableColumn<Compte,Integer> colIdCompte = new TableColumn<>("Id Compte");
        colIdCompte.setCellValueFactory(new PropertyValueFactory<>("idCompte"));
        
        TableColumn<Compte,Integer> colIdCli = new TableColumn<>("Id Client");
        colIdCli.setCellValueFactory(new PropertyValueFactory<>("idClient"));
        
        TableColumn<Compte,Integer> colCliDni = new TableColumn<>("DNI");
        colCliDni.setMinWidth(100);
        colCliDni.setCellValueFactory(new PropertyValueFactory<>("dniCli"));
        
        TableColumn<Compte,Integer> colCliNom = new TableColumn<>("nom");
        colCliNom.setMinWidth(100);
        colCliNom.setCellValueFactory(new PropertyValueFactory<>("nomCli"));
        
        TableColumn<Compte,Integer> colDataAlta = new TableColumn<>("d.Alta");
        colDataAlta.setCellValueFactory(new PropertyValueFactory<>("dataAlta"));
        
        TableColumn<Compte,Integer> colModalitat = new TableColumn<>("Modalitat");
        colIdCli.setCellValueFactory(new PropertyValueFactory<>("idModalitat"));
        
        
        tblContractes.getColumns().addAll(colIdCompte,colIdCli,colCliDni,colCliNom,colDataAlta,colModalitat);
        tblContractes.setMinHeight(100);
        tblContractes.setMaxWidth(600);
        
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(30);
        vb.setPadding(new Insets(20,20,20,20));
        
        vb.getChildren().addAll(lblContractes,menuButton,lblModalitat,tblContractes);
        
        return vb;        
    }   
    
    private void visualitzarContractesTarifaDades(int modalitat){
        
        CompteDAO compteDAO = new CompteDAO();
        
        ArrayList<Compte> comptesTarifa = compteDAO.obtenirComptesModalitatBD(modalitat);
        
        switch(modalitat){
            case 0: lblModalitat.setText("COMPTE DE TOTES LES MODALITATS"); break;
            case 1: lblModalitat.setText("COMPTES MODALITAT GRATUÏTA"); break;
            case 2: lblModalitat.setText("COMPTES MODALITAT BÀSICA"); break;
            case 3: lblModalitat.setText("COMPTES MODALITAT PREMIUM"); break;
        }
    
        tblContractes.getItems().clear();
        
        tblContractes.getItems().addAll(comptesTarifa);
    }
}
