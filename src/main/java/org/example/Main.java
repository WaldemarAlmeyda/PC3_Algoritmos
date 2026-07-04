package org.example;

import org.example.datos.DatosPrueba;
import org.example.modelo.Plato;
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

        Plato[] platos = DatosPrueba.obtenerPlatos();

        System.out.println("CATÁLOGO ORIGINAL\n");

        for (Plato p : platos) {
            System.out.println(p);
        }

        QuickSort.ordenarPorNombre(platos);

        QuickSort.mostrar(platos);
    }
}
