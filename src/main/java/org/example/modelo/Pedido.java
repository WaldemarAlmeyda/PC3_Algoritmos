package org.example.modelo;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private double monto;

    public Pedido(int numeroPedido, String cliente, double monto) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return numeroPedido +
                " - " +
                cliente +
                " -> S/" +
                monto;
    }
}
