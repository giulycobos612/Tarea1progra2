package Ejercicio3_16;

import javax.swing.JOptionPane;

public class PruebaFrecuencias {

    public static void main(String[] args) {


        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento (número):"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento (número):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));


        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);


        String resultado = "===== INFORMACIÓN DE LA PERSONA =====\n"
                + "Nombre:              " + persona.getNombre() + " " + persona.getApellido() + "\n"
                + "Fecha de nacimiento: " + persona.getDiaNacimiento() + "/" + persona.getMesNacimiento() + "/" + persona.getAnioNacimiento() + "\n"
                + "Edad:                " + persona.calcularEdad() + " años\n"
                + "\n===== FRECUENCIA CARDIACA =====\n"
                + "Frecuencia máxima:           " + persona.calcularFrecuenciaMaxima() + " ppm\n"
                + "Rango esperado mínimo (50%): " + persona.calcularFrecuenciaMinima() + " ppm\n"
                + "Rango esperado máximo (85%): " + persona.calcularFrecuenciaMaximaEsperada() + " ppm";

        JOptionPane.showMessageDialog(null, resultado);

        System.exit(0);

    }

}