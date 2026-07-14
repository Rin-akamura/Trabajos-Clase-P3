package utils;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class Navegacion {
    public static <T> T cargarVentana(String rutaFXML, String titulo){
        try{
            FXMLLoader cambio = new FXMLLoader(Navegacion.class.getResource(rutaFXML));
            Scene escena = new Scene(cambio.load());
            Stage escenario = new Stage();

            escenario.setScene(escena);
            escenario.setTitle(titulo);
            escenario.show();

            return cambio.getController();
        }catch(Exception e){
            throw new RuntimeException("Error al cargar la ventana: " +  e.getMessage());
        }
    }
}
