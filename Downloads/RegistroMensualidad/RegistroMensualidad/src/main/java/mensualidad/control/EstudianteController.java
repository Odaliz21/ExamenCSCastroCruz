/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mensualidad.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import mensualidad.modelo.Estudiante;

/**
 * FXML Controller class
 *
 * @author odali
 */
public class EstudianteController implements Initializable {
    private ObservableList<Estudiante> datoEstudiante = FXCollections.observableArrayList();
    
    public  EstudianteController(){
        //Datos de muestra
        datoEstudiante.add(new Estudiante("1","odaliz", "Castro", "Cruz", "1 de primaria"));
        datoEstudiante.add(new Estudiante("2","odaliz", "Castro", "Cruz", "1 de primaria"));
        datoEstudiante.add(new Estudiante("3","odaliz", "Castro", "Cruz", "1 de primaria"));
        datoEstudiante.add(new Estudiante("4","odaliz", "Castro", "Cruz", "1 de primaria"));
        
    }
    public ObservableList<Estudiante> getDatoEstudiantes(){
        return datoEstudiante;
    }    

    
    @FXML
    private TableView<Estudiante> tablaEstudiante;
    @FXML
    private TableColumn<Estudiante, String> idColumna;
    @FXML
    private TableColumn<Estudiante, String> nombreColumna;
    @FXML
    private TableColumn<Estudiante, String> apellidoPaternoColumna;
    @FXML
    private TableColumn<Estudiante, String> apellidoMaternoColumna;
    @FXML
    private TableColumn<Estudiante, String> gradoColumna;
    
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicializar la tabla de estudiantes con las columnas correspondientes
        idColumna.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        nombreColumna.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellidoPaternoColumna.setCellValueFactory(cellData -> cellData.getValue().apellidoPaternoProperty());
        apellidoMaternoColumna.setCellValueFactory(cellData -> cellData.getValue().apellidoMaternoProperty());
        gradoColumna.setCellValueFactory(cellData -> cellData.getValue().gradoProperty());
        
        // Configurar la lista de estudiantes en la tabla
        tablaEstudiante.setItems(getDatoEstudiantes());  
    }    

    @FXML
    private void btnAgregar(ActionEvent event) {
    }

    @FXML
    private void brnReporte(ActionEvent event) {
    }
    
}
