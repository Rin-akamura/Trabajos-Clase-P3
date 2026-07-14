import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start (Stage stage) throws Exception{
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Registro_citas.fxml"));
            Scene ventana = new Scene(loader.load());

            stage.setScene(ventana);
            stage.setTitle("Registro de ventana");
            stage.show();

        }catch(Exception e){
            System.out.println("Error al abrir la Aplicacion: " + e.getMessage());
        }
    }
}
