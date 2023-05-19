
package uf5.pkg6.projecte.streamin.vista;
import javafx.scene.control.Alert;
/**
 * Classe AlertVista que proporciona mètodes per mostrar finestres emergents d'alerta amb diferents tipus de missatges.
 */
public class AlertVista {
    /**
     * Mostra una finestra emergent d'alerta de tipus "Warning" amb el missatge especificat.
     *
     * @param msg el missatge a mostrar
     */
    public static void alertWarning(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Warning");
        alert.setContentText(msg);
        alert.showAndWait();
    }
    /**
     * Mostra una finestra emergent d'alerta de tipus "Informació" amb el missatge especificat.
     *
     * @param msg el missatge a mostrar
     */
    public static void alertInformacio(String msg){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacio");
        alert.setContentText(msg);
        alert.showAndWait();
    }
    /**
     * Mostra una finestra emergent d'alerta de tipus "Error" amb el missatge especificat.
     *
     * @param msg el missatge a mostrar
     */
    public static void alertError(String msg){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(msg);
        alert.showAndWait();
    }
    
    /**
     * Mostra una finestra emergent d'alerta de tipus "Confirmació" amb el missatge especificat.
     *
     * @param msg el missatge a mostrar
     */
    public static void alertConfirmació(String msg){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmació");
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
