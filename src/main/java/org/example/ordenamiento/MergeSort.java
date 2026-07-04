package org.example.ordenamiento;

import org.example.modelo.Pedido;

public class MergeSort {
    public static void ordenarPorMonto(Pedido[] pedidos) {
        mergeSort(pedidos, 0, pedidos.length - 1);
    }

    private static void mergeSort(Pedido[] pedidos, int izquierda, int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            // Ordenar la mitad izquierda
            mergeSort(pedidos, izquierda, medio);

            // Ordenar la mitad derecha
            mergeSort(pedidos, medio + 1, derecha);

            // Fusionar ambas mitades
            merge(pedidos, izquierda, medio, derecha);
        }
    }

    private static void merge(Pedido[] pedidos, int izquierda, int medio, int derecha) {

        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        Pedido[] izquierdaArray = new Pedido[n1];
        Pedido[] derechaArray = new Pedido[n2];

        // Copiar datos
        for (int i = 0; i < n1; i++) {
            izquierdaArray[i] = pedidos[izquierda + i];
        }

        for (int j = 0; j < n2; j++) {
            derechaArray[j] = pedidos[medio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        // Fusionar manteniendo el orden
        while (i < n1 && j < n2) {

            if (izquierdaArray[i].getMonto() <= derechaArray[j].getMonto()) {
                pedidos[k] = izquierdaArray[i];
                i++;
            } else {
                pedidos[k] = derechaArray[j];
                j++;
            }

            k++;
        }

        // Copiar elementos restantes
        while (i < n1) {
            pedidos[k] = izquierdaArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            pedidos[k] = derechaArray[j];
            j++;
            k++;
        }
    }

    public static void mostrar(Pedido[] pedidos) {

        System.out.println("\nPEDIDOS ORDENADOS POR MONTO\n");

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
