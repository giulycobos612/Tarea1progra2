package ejercicio3_12;

public class Factura {


    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;


    public Factura(String numero, String descripcion, int cant, double precio) {
        numeroPieza = numero;
        descripcionPieza = descripcion;
        setCantidad(cant);
        setPrecioPorArticulo(precio);
    }


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


    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }

}