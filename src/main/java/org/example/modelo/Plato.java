package org.example.modelo;

public class Plato {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Plato(String codigo, String nombre, String categoria,
                 double precio, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre +
                " | S/" + precio +
                " | Stock: " + stock;
    }
}
