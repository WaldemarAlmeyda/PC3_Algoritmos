package org.example.ordenamiento;

import org.example.modelo.Plato;

public class ShellSort {
    public static void ordenarPorPrecio(Plato[] platos) {
        int n = platos.length;

        // El gap comienza siendo la mitad del tamaño del arreglo
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Recorremos desde la posición "gap"
            for (int i = gap; i < n; i++) {

                Plato temp = platos[i];
                int j = i;

                // Compara los precios separados por el gap
                while (j >= gap &&
                        platos[j - gap].getPrecio() > temp.getPrecio()) {

                    platos[j] = platos[j - gap];
                    j -= gap;
                }

                platos[j] = temp;
            }
        }
    }

    public static void mostrar(Plato[] platos) {

        System.out.println("\nCATÁLOGO ORDENADO POR PRECIO\n");

        for (Plato p : platos) {
            System.out.println(p);
        }
    }
}
