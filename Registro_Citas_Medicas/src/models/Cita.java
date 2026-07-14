package models;

import java.time.LocalDate;
import java.util.Date;

public class Cita {
    private String Codigo;
    private String NombrePaciente;
    private int Cedula;
    private int Telefono;
    private String Medico;
    private String Especialidad;
    private Date FechaCita;
    private LocalDate Hora;
    private String MotivoConsulta;
    private String Estado;

    public Cita (String codigo, String NombrePaciente, int cedula, int telefono, String medico, String Especialidad, Date FechaCita, LocalDate hora, String motivo, String estado){
        this.Codigo = codigo;
        this.NombrePaciente = NombrePaciente;
        this.Cedula = cedula;
        this.Telefono = telefono;
        this.Medico = medico;
        this.Especialidad = Especialidad;
        this.FechaCita = FechaCita;
        this.Hora = hora;
        this.MotivoConsulta = motivo;
        this.Estado = estado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getPaciente() {
        return NombrePaciente;
    }

    public int getCedula() {
        return Cedula;
    }

    public int getTelefono(){
        return Telefono;
    }

    public String getMedico() {
        return Medico;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public Date getFechaCita() {
        return FechaCita;
    }

    public LocalDate getHora() {
        return Hora;
    }

    public String getMotivoConsulta() {
        return MotivoConsulta;
    }

    public String getEstado() {
        return Estado;
    }
}
