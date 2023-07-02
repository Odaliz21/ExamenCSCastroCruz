/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mensualidad.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author odali
 */
public class BordeController implements Initializable {

    @FXML
    private BorderPane bp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showEstudiantes();// TODO
    } 
    @FXML
    private void estudiante(MouseEvent event) {
        cargarPaginas("estudiante");
    }    
    @FXML
    private void registroPago(MouseEvent event) {
        cargarPaginas("registroPago");
    }    

    @FXML
    private void salir(MouseEvent event) {
    }

    private void cargarPaginas(String pagina){
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource("/mensualidad/vista/" + pagina + ".fxml"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bp.setCenter(root);
    }
    
    private void showEstudiantes() {
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/mensualidad/vista/registroPago.fxml"));
            AnchorPane Borde = (AnchorPane) loader.load();
            
            bp.setCenter(Borde);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
}
