package mensualidad.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.BorderPane;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    private BorderPane borderBar;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Registro de Mensualidad App");
        showBorde();

    }
    
    private void showBorde() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/mensualidad/vista/Borde.fxml"));
            borderBar = (BorderPane) loader.load();
            
            Scene scene = new Scene(borderBar);
            primaryStage.setScene(scene);
            primaryStage.show();                        
        } catch(IOException e){
            e.printStackTrace();
        }
    }    

    public static void main(String[] args) {
        launch(args);
    }



}