
package uf5.pkg6.projecte.streamin.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static uf5.pkg6.projecte.streamin.vista.AlertVista.alertWarning;

public class GestioProduccionsVista {
    
        static Label lblId;
        static TextField txtId;
        
        static Label lblNom = new Label("Nom: ");
        static TextField txtNom = new TextField();
        
        static Label lblAny;
        static TextField txtAny;
        
        static Label lblNacionalitat;
        static TextField txtNacionalitat;
        
        static Label lblCategoria;
        static TextField txtCategoria;
        
        static Label lblDirector;
        static TextField txtDirector;
        
        static Label lblActor;
        static TextField txtActor;
        
        static Label lblFavorit;
        static TextField txtFavorit;
        
    public static VBox centerGestioProduccio(){
        
        VBox vb = new VBox();
        
        Label lblPelis = new Label("GESTIÓ PRODUCCIONS");
        lblPelis.setFont(new Font("ArialBlond",30));
        lblPelis.setTextFill(Color.RED);
        
        VBox vbElem = dadesProduccio();
        
        HBox hbBotons = botonsGestio();
        hbBotons.setSpacing(10);
        hbBotons.setAlignment(Pos.CENTER);
        
        vb.getChildren().addAll(lblPelis,vbElem,hbBotons);
        vb.setAlignment(Pos.CENTER);
        
        vb.setSpacing(10);
        
        return vb;
    }

    private static VBox dadesProduccio(){
        
        VBox vb = new VBox();
        
        Label lblProduccions = new Label("GESTIÓ PRODUCCIONS");
        lblProduccions.setFont(new Font("ArianBold",20));
        lblProduccions.setTextFill(Color.RED);
                
        lblId = new Label("Id: ");
        txtId = new TextField();
        
        lblNom = new Label("Nom: ");
        txtNom = new TextField();
        
        lblAny = new Label("Any: ");
        txtAny = new TextField();
        
        lblNacionalitat = new Label("Nacionalitat: ");
        txtNacionalitat = new TextField();
        
        lblCategoria = new Label("Categoría: ");
        txtCategoria = new TextField();
        
        lblDirector = new Label("Director: ");
        txtDirector = new TextField();
        
        lblActor = new Label("Actor: ");
        txtActor = new TextField();
        
        lblFavorit = new Label("Favorit: ");
        txtFavorit = new TextField();
        
        RadioButton rb1 = new RadioButton("Pel·licula");
        RadioButton rb2 = new RadioButton("Serie");
        
        ToggleGroup tg = new ToggleGroup();
        
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        
        GridPane gp = new GridPane();
        
        gp.add(lblId,0,0,1,1);
        gp.add(txtId,1,0,1,1);
        
        gp.add(lblNom, 0,1,1,1);
        gp.add(txtNom, 1,1,1,1);
        
        gp.add(lblAny, 0, 2,1,1);
        gp.add(txtAny, 1, 2,1,1);
        
        gp.add(lblNacionalitat, 0, 3,1,1);
        gp.add(txtNacionalitat, 1, 3,1,1);
        
        gp.add(lblCategoria, 0, 4,1,1);
        gp.add(txtCategoria,1,4,1,1);
        
        gp.add(lblDirector,0,5,1,1);
        gp.add(txtDirector,1,5,1,1);
        
        gp.add(lblActor, 0, 6,1,1);
        gp.add(txtActor, 1, 6,1,1);
        
        gp.add(lblFavorit, 0, 7,1,1);
        gp.add(txtFavorit, 1, 7,1,1);
        
        gp.add(rb1, 0, 8,1,1);
        gp.add(rb2, 1, 8,1,1);
        
        gp.setAlignment(Pos.CENTER);
        
        gp.setHgap(10);
        gp.setVgap(10);
        
        vb.setSpacing(20);
        vb.getChildren().add(gp);
        vb.setAlignment(Pos.CENTER);
        
        return vb;
    }
    
    private static HBox botonsGestio(){
        
        Button btnConsulta = new Button("Consulta");
        Button btnAlta = new Button("Alta");
        Button btnModificacio = new Button("Modificació");
        Button btnBaixa = new Button("Baixa");
        Button btnInicialitza = new Button("Inicialitza");
        
        btnConsulta.setOnAction(e -> consultaProduccio());
        
        btnAlta.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                System.out.println("Alta Peli...");
                altaProduccio();
            }
        });
        
        btnModificacio.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Modificant Pel·licula...");
                modificaProduccio();
            }
        });
        
        btnInicialitza.setOnAction((e -> inicialitzarCampsPantallaProduccio()));

        HBox hbBotons = new HBox(btnConsulta,btnAlta,btnModificacio,btnBaixa,btnInicialitza);
        return hbBotons;
    }
    
    private static void consultaProduccio() {
        txtId = new TextField();
        if (txtId.getText().equalsIgnoreCase("")) {
            
            alertWarning("L'identificador ha de tenir un valor");
        } else{
            int id = Integer.parseInt(txtId.getText());
        }
    }
    
    private static void altaProduccio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static void modificaProduccio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void inicialitzarCampsPantallaProduccio() {
        
        txtId.setText("");
        
    }
    
}
