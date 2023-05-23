package uf5.pkg6.projecte.streamin;

import javafx.application.Application;
import javafx.stage.Stage;
import uf5.pkg6.projecte.basedades.ConexioBDSingleton;
import uf5.pkg6.projecte.streamin.vista.AplicacioVista;

public class UF56ProjecteStreamin extends Application{

    public static void main(String[] args){  
        ConexioBDSingleton.getConnection();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AplicacioVista apVista = new AplicacioVista();
        
        apVista.start(stage);
    }
    
}
