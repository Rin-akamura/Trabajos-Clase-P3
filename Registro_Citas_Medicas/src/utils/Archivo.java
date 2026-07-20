package utils;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import models.Cita;

public class Archivo {
    public static void guardarCita(Cita cita){
        try{
            FileWriter lapiz = new FileWriter("Citas.txt", true);
            BufferedWriter escritor = new BufferedWriter(lapiz);
            escritor.write(cita.getCodigo() + " | " + cita.getPaciente() + " | " + cita.getCedula() + " | " + cita.getTelefono() + " | " + cita.getMedico() + " | " + cita.getEspecialidad() + " | " + cita.getFechaCita() + " | " + cita.getHora() + " | " + cita.getMotivoConsulta() + " | " + cita.getEstado());
            escritor.close();
            lapiz.close();

            System.out.println("Cita registrada correctamente en el archivo de citas");
        }catch(IOException e){
            throw new RuntimeException("Error al guardar el paquete: " + e.getMessage());
        }
    }

    public static ArrayList<Cita> leerCita() {
        ArrayList<Cita> registro = new ArrayList<>();

        try{
            FileReader hoja = new FileReader("Cita.txt");
            BufferedReader lector = new BufferedReader(hoja);
            String linea;

            while((linea = lector.readLine()) != null){
                String[] partes = linea.split("\\|");

                int Cedula = Integer.parseInt(partes[2]);
                int Telefono = Integer.parseInt(partes[3]);

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                Date fecha = (Date) formato.parse(partes[6]);


                if(partes.length == 10){
                    Cita cita = new Cita(
                        partes[0],
                        partes[1],
                        Cedula,
                        Telefono,
                        partes[4],
                        partes[5],
                        fecha,
                        partes[7],
                        partes[8],
                        partes[9]
                    );

                    registro.add(cita);
                }
            }

            hoja.close();
            lector.close();

        }catch(IOException e){
            throw new RuntimeException("Error al leer el archivo Cita.txt: " + e.getMessage());
        }

        return registro;
    }
}
