package ejercicio3_12;

public class Factura {

    // Variables de instancia
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numero, String descripcion, int cant, double precio) {
        numeroPieza = numero;
        descripcionPieza = descripcion;
        setCantidad(cant);
        setPrecioPorArticulo(precio);
    }

    // Métodos establecer (set)
    public void setNumeroPieza(String numero) {
        numeroPieza = numero;
    }

    public void setDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    public void setCantidad(int cant) {
        if (cant > 0)
            cantidad = cant;
        else
            cantidad = 0;
    }

    public void setPrecioPorArticulo(double precio) {
        if (precio > 0)
            precioPorArticulo = precio;
        else
            precioPorArticulo = 0.0;
    }

    // Métodos obtener (get)
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Método que calcula el monto total
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }

} // fin de la clase Factura