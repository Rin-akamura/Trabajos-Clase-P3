package Exceptions;

public class ErroresPosiblesException extends Exception {
    private String Mensaje;

    public ErroresPosiblesException(String mensaje){
        this.Mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return Mensaje;
    }
}
