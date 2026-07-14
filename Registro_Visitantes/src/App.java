import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
public class App extends Application {
    
    @Override
    public void start(Stage Escene) throws Exception {
        FXMLLoader Load = new FXMLLoader(getClass().getResource("/Registro.fxml"));

        Scene scene = new Scene(Load.load());

        Escene.setTitle("REGISTRO DE VISITANTES");
        Escene.setScene(scene);
        Escene.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
