package uf5.pkg6.projecte.streamin;

import javafx.application.Application;
import javafx.stage.Stage;
import uf5.pkg6.projecte.basedades.ConexioBDSingleton;

public class UF56ProjecteStreamin extends Application{

    public static void main(String[] args){  
        ConexioBDSingleton.getConnection();
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
