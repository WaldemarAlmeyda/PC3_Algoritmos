package org.example.recursividad;

import org.example.modelo.Pedido;

public class TotalVentasRecursivo {
    public static double calcularTotal(Pedido[] pedidos, int indice) {

        // Caso base
        if (indice == pedidos.length) {
            return 0;
        }

        System.out.println("Procesando pedido: "
                                   + pedidos[indice].getNumeroPedido()
                                   + " -> S/" + pedidos[indice].getMonto());

        // Llamada recursiva
        return pedidos[indice].getMonto()
                + calcularTotal(pedidos, indice + 1);

    }
}
