import java.util.Scanner;

public class Main{
    private static Exception e = null;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String[] estudiantes = new String[3];
        System.out.println("================================================");
        System.out.println("         .:: REGISTRO DE ESTUDIANTES ::.        ");
        System.out.println("================================================");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del Estudiante: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad del Estudiante: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el indice del Estudiante: ");
            double indice = sc.nextDouble();
            sc.nextLine();

            try{
                validarEstudiante(nombre, edad, indice);
                estudiantes[i] = "Nombre: " + nombre +"\n Edad: " +  edad + "\n Indice: " + indice;
                System.out.println("Estudiante registrado exitosamente.");
            } catch(Exception e){
                System.out.println("Error al registrar el estudiante: " + e.getMessage());
            } finally{
                System.out.println("Proceso finalizado correctamente.");

            }

            System.out.println(estudiantes[i]);
        }

        
        



    }

    public static void validarEstudiante(String Nombre, int edad, double indice) throws Exception{
        if(Nombre.isEmpty()){
            throw new Exception ("El nombre no puede estar vacio");
        } else if(edad < 18){
            throw new Exception ("La edad debe ser mayor a 18 años");
        } 
        if(indice < 0 || indice > 4){
            throw new Exception("El indice debe estar entre 0 y 4");
        }
    }   
}