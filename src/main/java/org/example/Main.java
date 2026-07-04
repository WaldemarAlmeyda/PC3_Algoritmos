package org.example;

import org.example.datos.DatosPrueba;
import org.example.modelo.Pedido;
import org.example.modelo.Plato;
import org.example.ordenamiento.MergeSort;
import org.example.ordenamiento.QuickSort;
import org.example.ordenamiento.ShellSort;

public class Main {
    static void main() {
//        Plato[] platos = DatosPrueba.obtenerPlatos();
//
//        System.out.println("CATÁLOGO ORIGINAL\n");
//
//        for (Plato p : platos) {
//            System.out.println(p);
//        }
//
//        ShellSort.ordenarPorPrecio(platos);
//
//        ShellSort.mostrar(platos);

//        Plato[] platos = DatosPrueba.obtenerPlatos();
//
//        System.out.println("CATÁLOGO ORIGINAL\n");
//
//        for (Plato p : platos) {
//            System.out.println(p);
//        }
//
//        QuickSort.ordenarPorNombre(platos);
//
//        QuickSort.mostrar(platos);

        Pedido[] pedidos = DatosPrueba.obtenerPedidos();

        System.out.println("PEDIDOS REGISTRADOS\n");

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        MergeSort.ordenarPorMonto(pedidos);

        MergeSort.mostrar(pedidos);
    }
}
