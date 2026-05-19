package Sistema_Medico;

public class Paciente {
    private String Nombre;
    private String Apellido;
    private String Edad;
    private int Peso;
    private double Altura;
    private String Sangre;
    private String Alergia;
    private String EstadodePeso;

    public Paciente () {
    }

    public Paciente (String nombre, String apellido, String edad, int peso, double altura, String sangre, String alergia){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
        this.Peso = peso;
        this.Altura = altura;
        this.Sangre = sangre;
        this.Alergia = alergia;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public int getPeso() {
        return Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public String getSangre() {
        return Sangre;
    }

    public String getAlergia() {
        return Alergia;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public void setEdad(String edad) {
        this.Edad = edad;
    }

    public void setPeso(int peso) {
        this.Peso = peso;
    }

    public void setAltura(double altura) {
        this.Altura = altura;
    }

    public void setSangre(String sangre) {
        this.Sangre = sangre;
    }

    public void setAlergia(String alergia) {
        this.Alergia = alergia;
    }

    public String getEstadoPeso() {
        return EstadodePeso;
    }

    public void setEstadoPeso(String estadopeso) {
        this.EstadodePeso = estadopeso;
    }

    public void MostrarPaciente() {
        System.out.println("======================================");
        System.out.println("        .::INFORMACION DEL PACIENTE::.     ");
        System.out.println("======================================");
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("Edad: " + this.Edad);
        System.out.println("Peso: " + this.Peso + "kg (" + this.EstadodePeso + ")");
        System.out.println("Altura: " + this.Altura);
        System.out.println("Tipo de Sangre: " + this.Sangre);
        System.out.println("Alergias: " + this.Alergia);
    }
}
