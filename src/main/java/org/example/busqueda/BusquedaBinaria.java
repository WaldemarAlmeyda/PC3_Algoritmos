package org.example.busqueda;

import org.example.modelo.Plato;

public class BusquedaBinaria {
    public static Plato buscarPorNombre(Plato[] platos, String nombreBuscado) {

        int izquierda = 0;
        int derecha = platos.length - 1;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;

            int comparacion = platos[medio]
                    .getNombre()
                    .compareToIgnoreCase(nombreBuscado);

            if (comparacion == 0) {
                return platos[medio];
            }

            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }
}
