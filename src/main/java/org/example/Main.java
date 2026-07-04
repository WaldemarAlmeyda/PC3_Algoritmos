package org.example;

import org.example.busqueda.BusquedaLineal;
import org.example.datos.DatosPrueba;
import org.example.modelo.Pedido;
import org.example.modelo.Plato;
import org.example.ordenamiento.MergeSort;
import org.example.ordenamiento.QuickSort;
import org.example.ordenamiento.ShellSort;

public class Main {
    static void main() {
        /* SHELL SORT */
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

        /* QUICK SORT */
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

        /* MERGE SORT */
//        Pedido[] pedidos = DatosPrueba.obtenerPedidos();
//
//        System.out.println("PEDIDOS REGISTRADOS\n");
//
//        for (Pedido pedido : pedidos) {
//            System.out.println(pedido);
//        }
//
//        MergeSort.ordenarPorMonto(pedidos);
//
//        MergeSort.mostrar(pedidos);

        /* BUSQUEDA LINEAL */
        Plato[] platos = DatosPrueba.obtenerPlatos();

        String codigoBuscado = "P006";

        System.out.println("Buscando el plato con código: " + codigoBuscado);

        Plato encontrado = BusquedaLineal.buscarPorCodigo(platos, codigoBuscado);

        if (encontrado != null) {

            System.out.println("\nPLATO ENCONTRADO");
            System.out.println(encontrado);

        } else {

            System.out.println("\nNo existe un plato con ese código.");

        }
    }
}
