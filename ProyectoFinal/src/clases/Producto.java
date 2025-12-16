package clases;

import java.util.List;

public class Producto {
    private List<String> productos;
    private int Cantidad;
    private float precio;

    public Producto(List<String> productos, int cantidad, float precio) {
        this.productos = productos;
        Cantidad = cantidad;
        this.precio = precio;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
