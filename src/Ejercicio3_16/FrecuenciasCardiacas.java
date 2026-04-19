package Ejercicio3_16;

public class FrecuenciasCardiacas {

    // Variables de instancia
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;


    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDiaNacimiento(int dia) {
        this.diaNacimiento = dia;
    }

    public void setMesNacimiento(int mes) {
        this.mesNacimiento = mes;
    }

    public void setAnioNacimiento(int anio) {
        this.anioNacimiento = anio;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }


    public int calcularEdad() {
        int anioActual = 2026;
        int mesActual = 4;
        int diaActual = 19;

        int edad = anioActual - anioNacimiento;

        if (mesNacimiento > mesActual) {
            edad = edad - 1;
        } else if (mesNacimiento == mesActual && diaNacimiento > diaActual) {
            edad = edad - 1;
        }

        return edad;
    }


    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }


    public double calcularFrecuenciaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }


    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }

}