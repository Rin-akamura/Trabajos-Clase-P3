package Sistema_Medico;
import java.util.Scanner;
public class Sistema {
    Scanner leer = new Scanner(System.in);
    Paciente[] registro = new Paciente[100];
    int TotalPacientes = 0;
    
    public Sistema(){

    }

    public void RegistrarPaciente(int cantidad){
        for(int i = 0; i < cantidad; i++){
            Paciente paciente = new Paciente();

            System.out.println("Ingrese el Nombre del paciente");
            String nombre = leer.nextLine();
            paciente.setNombre(nombre);

            System.out.println("Ingrese el apellido del paciente:");
            String apellido = leer.nextLine();
            paciente.setApellido(apellido);

            System.out.println("Ingrese la edad del paciente:");
            String edad = leer.nextLine();
            paciente.setEdad(edad);

            System.out.println("Ingrese el peso del paciente:");
            int peso = leer.nextInt();
            leer.nextLine();
            paciente.setPeso(peso);


            System.out.println("Ingrese la Altura del paciente:");
            double altura = leer.nextDouble();
            leer.nextLine();
            paciente.setAltura(altura);

            System.out.println("Ingrese el tipo de sangre del paciente:");
            String sangre = leer.nextLine();
            paciente.setSangre(sangre);

            System.out.println("Ingrese las Alergias del paciente");
            String alergias = leer.nextLine();
            paciente.setAlergia(alergias);

            registro[i] = paciente;
            TotalPacientes++;


        }
    }

    public void CalcularIMC(Paciente paciente) {
        double IMC = paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());
        String estandar;

        System.out.println(IMC + "kg");

        if(IMC < 18.5){
            paciente.setEstadoPeso("El paciente tiene un bajo peso al estandar");

            return;
        }
        else if(IMC < 25.0){
            paciente.setEstadoPeso("El paciente se encuentra en su peso optimo");
            return;
        }
        else if(IMC < 30.0){
            paciente.setEstadoPeso("El paciente tiene un sobrepeso Comparado al estandar");
            return;
        }
        else if(IMC < 40.0) {
            paciente.setEstadoPeso("El paciente se encuentra en un caso de obesidad");
            return;
        }
        else {
            paciente.setEstadoPeso("El paciente se encuentra en un caso de Obesidad morbida. Recomendado con caracter de urgencia que baje de peso");
            return;
        }
    }

    public void IMC() {
        System.out.print("Ingrese los apellidos del paciente: ");
        String Apellido = leer.nextLine();
        
        for(int i = 0; i < TotalPacientes; i++){
            if(registro[i] != null && registro[i].getApellido().equalsIgnoreCase(Apellido)){
                CalcularIMC(registro[i]);

                System.out.println(registro[i].getEstadoPeso());

                System.out.println("IMC calculado correctamente, guardado en expediente de paciente");

                return;
            }
        }

        System.out.println("Paciente no encontrado.");
    }

    public void BuscarPaciente() {
        System.out.print("Ingrese los apellidos del paciente: ");
        String Apellido = leer.nextLine();
        
        for(int i = 0; i < TotalPacientes; i++){
            if(registro[i] != null && registro[i].getApellido().equalsIgnoreCase(Apellido)){
                registro[i].MostrarPaciente();
                return;
            }
        }

        System.out.println("Paciente no encontrado");
    }

    public void MostrarPacientes(){
        for(int i = 0; i < TotalPacientes; i++){
            registro[i].MostrarPaciente();
        }
    }

}
