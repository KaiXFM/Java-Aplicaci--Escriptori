package uf5.pkg6.projecte.streamin.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static uf5.pkg6.projecte.streamin.vista.GestioProduccionsVista.centerGestioProduccio;

public class AplicacioVista {
    public void start(Stage escenari) throws Exception{  
    
        BorderPane bp = new BorderPane();
        
        bp.setTop(top());
        
        bp.setCenter(centerGestioProduccio());
        
        bp.setLeft(left());
        
        Label lblSaluda = new Label("Benvingut a JavaFX");
        TextField txtMsg = new TextField();
        
        VBox vb = new VBox();
        
        vb.getChildren().addAll(lblSaluda,txtMsg);

        
        Scene escena = new Scene(bp);
        
        escenari.setTitle("Prova Interfície");
        escenari.setScene(escena);
        escenari.setMaxHeight(1080);
        escenari.setMinWidth(1980);
        
        escenari.show();
    
    
    }
    
     private HBox top() {
        HBox hb = new HBox();
        
        Label lblAplicacio = new Label("Aplicació Gestio Streaming");
        
        
        
        lblAplicacio.setFont(new Font("ArialBold", 40));
        lblAplicacio.setTextFill(Color.WHITESMOKE);
        
        hb.getChildren().add(lblAplicacio);
        
        hb.setSpacing(30);
        hb.setPadding(new Insets(10,10,10,10));
        
        hb.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        hb.setMinHeight(200);
        hb.setAlignment(Pos.CENTER);

        return hb;
    }
    
    private VBox left(){
        
        BorderPane bp = new BorderPane();
        
        VBox vb = new VBox();
        
        Label lblGestio = new Label("GESTIÓ PRODUCCIONS");
        
        lblGestio.setFont(new Font("ArialBold",20));
        lblGestio.setTextFill(Color.WHITESMOKE);
        
        Button btnPelis = new Button("Gestió Pel·lícules/Series");
        btnPelis.setMinWidth(80);
        
        btnPelis.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent c){
                bp.setCenter(centerGestioProduccio());
            }
        });
        
        Label lblEstadistiques = new Label("ESTADISTIQUES");
        
        lblEstadistiques.setFont(new Font("ArialBold",20));
        lblEstadistiques.setTextFill(Color.WHITESMOKE);
        
        Button btnClients = new Button("Contractes clients Tarifa");
        btnClients.setMinWidth(80);
        Button btnCliTarifes = new Button("Produccions preferides");
        btnClients.setMinWidth(80);
        
        vb.getChildren().addAll(lblGestio,btnPelis,lblEstadistiques,btnClients,btnCliTarifes);
        
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(30);
        vb.setPadding(new Insets(10,10,10,10));
        vb.setMinSize(180,100);
        vb.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
        
        return vb;
    }

}
