package ejercicio3_12;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario por consola
        System.out.print("Ingrese el número de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad de artículos: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio por artículo: ");
        double precio = entrada.nextDouble();

        // Crear el objeto Factura con los datos ingresados
        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        // Mostrar la factura
        System.out.println("\n===== FACTURA =====");
        System.out.println("Número de pieza:  " + factura.getNumeroPieza());
        System.out.println("Descripción:      " + factura.getDescripcionPieza());
        System.out.println("Cantidad:         " + factura.getCantidad());
        System.out.println("Precio unitario:  $" + factura.getPrecioPorArticulo());
        System.out.println("MONTO TOTAL:      $" + factura.obtenerMontoFactura());

        entrada.close();

    } // fin de main

} // fin de la clase PruebaFactura