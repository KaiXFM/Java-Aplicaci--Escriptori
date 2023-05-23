
package uf5.pkg6.projecte.streamin.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
import uf5.pkg6.projecte.basedades.PeliculaDAO;
import uf5.pkg6.projecte.basedades.ProduccioDAO;
import uf5.pkg6.projecte.basedades.SerieDAO;
import uf5.pkg6.projecte.streamin.model.Pelicula;
import uf5.pkg6.projecte.streamin.model.Produccio;
import uf5.pkg6.projecte.streamin.model.Serie;
import static uf5.pkg6.projecte.streamin.vista.AlertVista.alertInformacio;
import static uf5.pkg6.projecte.streamin.vista.AlertVista.alertWarning;
/**
 * Classe GestioProduccionsVista que representa la interfície gràfica per a la gestió de produccions.
 */
public class GestioProduccionsVista {
    
        static Label lblId;
        static TextField txtId;
        
        static Label lblNom;
        static TextField txtNom;
        
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
        
        static Label lblDurada = new Label("Durada");
        static TextField txtDurada = new TextField();
        
        static Label lblNumCapitols = new Label("Numero Capitols");
        static TextField txtNumCapitols = new TextField();
        
        static Label lblDuradaTotal = new Label("Durada Total");
        static TextField txtDuradaTotal = new TextField();
        
        static RadioButton rb1 = new RadioButton("Pel·licula");
        static RadioButton rb2 = new RadioButton("Serie");
     /**
     * Mètode per a obtenir la part central de la interfície per a la gestió de produccions.
     *
     * @return una instància de VBox que representa la part central de la interfície
     */   
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
        
        GridPane gpps = new GridPane();
        
        lblDurada.setVisible(false);
        txtDurada.setVisible(false);
        
        lblNumCapitols.setVisible(false);
        txtNumCapitols.setVisible(false);
        
        lblDuradaTotal.setVisible(false);
        txtDuradaTotal.setVisible(false);
        
        gpps.add(lblDurada, 0, 0,1,1);
        gpps.add(txtDurada, 1, 0,1,1);
        
        gpps.add(lblNumCapitols, 0, 1,1,1);
        gpps.add(txtNumCapitols, 1, 1,1,1);
        
        gpps.add(lblDuradaTotal, 0, 2,1,1);
        gpps.add(txtDuradaTotal, 1, 2,1,1);
        
        gpps.setHgap(10);
        gpps.setVgap(10);
        
        gpps.setPadding(new Insets(20,20,20,20));
        
        vb.setSpacing(20);
        vb.getChildren().addAll(gp, gpps);
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
            
            inicialitzarCampsPantallaProduccio();
            
            ProduccioDAO prodDAO = new ProduccioDAO();
            
            Produccio produccio = prodDAO.consultaProduccioBD(id);
            
            if (produccio == null) {
                alertInformacio("No existeix aquest identificador de produccio");
            } else {
                dadesProduccioAPantalla(produccio);
                
                PeliculaDAO peliDAO = new PeliculaDAO();
                Pelicula peli = peliDAO.consultaPeliculaBD(id);
                
                if (peli != null) {
                    dadesPeliculaAPantalla(peli);
                } else {
                    SerieDAO serieDAO = new SerieDAO();
                    Serie serie = serieDAO.consultaSerieBD(id);
                    if (serie != null) {
                        dadesSerieAPantalla(serie);
                    }
                }
            }
        }
    }
    
    private static void altaProduccio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static void modificaProduccio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * Mètode per a inicialitzar els camps de la pantalla de gestió de produccions.
     */
    static void inicialitzarCampsPantallaProduccio() {
        txtId.setText("");
        txtNom.setText("");
        txtAny.setText("");
        txtCategoria.setText("");
        txtDirector.setText("");
        txtActor.setText("");
        txtNacionalitat.setText("");
        txtFavorit.setText("");
        
        rb1.setSelected(false);
        rb2.setSelected(false);
        
        lblDurada.setVisible(false);
        txtDurada.setVisible(false);
        
        lblDuradaTotal.setVisible(false);
        txtDuradaTotal.setVisible(false);
        
        lblNumCapitols.setVisible(false);
        txtNumCapitols.setVisible(false);
    }
    
    private static void dadesProduccioAPantalla(Produccio p){
    
    txtId.setText(String.valueOf(p.getId()));
    txtNom.setText(p.getNom());
    txtNacionalitat.setText(p.getNacionalitat());
    txtAny.setText(String.valueOf(p.getAny()));
    txtFavorit.setText(String.valueOf(p.getPreferit()));
    
    }
    
    private static void dadesPeliculaAPantalla(Pelicula p){
        
        rb1.setSelected(true);
        
        txtDurada.setText(String.valueOf(p.getDurada()));
        
        txtCategoria.setText(p.getCategoria(0));
        txtDirector.setText(p.getDirector(0));
        txtActor.setText(p.getActor(0));
        
        txtDurada.setVisible(true);
    }
    
    private static void dadesSerieAPantalla(Serie s){
        
        rb2.setSelected(true);
        
        txtDuradaTotal.setText(String.valueOf(s.getDuradaTotal()));
        txtNumCapitols.setText(String.valueOf(s.getNumCapitols()));
        
        txtCategoria.setText(s.getCategoria(0));
        txtDirector.setText(s.getDirector(0));
        txtActor.setText(s.getActor(0));
        
        txtDurada.setVisible(true);
        txtNumCapitols.setVisible(true);
    }
    
}
