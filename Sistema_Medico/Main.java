package Sistema_Medico;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Paciente paciente = new Paciente();
        Sistema sistema = new Sistema();

        int op = 0;
        do{
            System.out.println("======================================");
            System.out.println("        .::CLINICA EL DESCANSO::.     ");
            System.out.println("======================================");

            System.out.println("======================================");
            System.out.println("1. .::REGISTRAR PACIENTE::.    ");
            System.out.println("2. .::CALCULAR IMC::.   ");
            System.out.println("3. .::MOSTRAR INFORMACION DE PACIENTE::.");
            System.out.println("4. .::MOSTRAR PACIENTES REGISTRADOS::.");
            System.out.println("5. .::SALIR DEL SISTEMA::. ");
            
            System.out.print("Ingrese la opcion deseada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("====================================");
                    System.out.println("     .::PLANTILLA DE PACIENTE::.    ");
                    System.out.println("====================================");

                    System.out.println("------------------------------------");
                    System.out.print("Cuantos Pacientes desea registrar: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    sistema.RegistrarPaciente(cantidad);
                    System.out.println("------------------------------------");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("        .::IMC DEL PACIENTE::.       ");
                    System.out.println("=====================================");

                    System.out.println("-------------------------------------");
                    sistema.IMC();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("=====================================");
                    System.out.println("     .::REGISTROS DE PACIENTES::.    ");
                    System.out.println("=====================================");
                    
                    sistema.BuscarPaciente();
                    break; 
                case 4:
                    sistema.MostrarPacientes();
                    break;
                case 5:
                    break;
            }
        }while(op != 5);

    }
}
