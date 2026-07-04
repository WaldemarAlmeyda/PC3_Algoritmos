package org.example.ordenamiento;

import org.example.modelo.Plato;

public class QuickSort {
    public static void ordenarPorNombre(Plato[] platos) {
        quickSort(platos, 0, platos.length - 1);
    }

    private static void quickSort(Plato[] platos, int inicio, int fin) {

        if (inicio < fin) {

            int indicePivote = particionar(platos, inicio, fin);

            quickSort(platos, inicio, indicePivote - 1);
            quickSort(platos, indicePivote + 1, fin);
        }
    }

    private static int particionar(Plato[] platos, int inicio, int fin) {

        Plato pivote = platos[fin];

        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (platos[j].getNombre()
                    .compareToIgnoreCase(pivote.getNombre()) <= 0) {

                i++;

                Plato aux = platos[i];
                platos[i] = platos[j];
                platos[j] = aux;
            }
        }

        Plato aux = platos[i + 1];
        platos[i + 1] = platos[fin];
        platos[fin] = aux;

        return i + 1;
    }

    public static void mostrar(Plato[] platos) {

        System.out.println("\nCATÁLOGO ORDENADO POR NOMBRE\n");

        for (Plato plato : platos) {
            System.out.println(plato);
        }
    }
}
