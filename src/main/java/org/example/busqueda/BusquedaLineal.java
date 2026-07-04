package org.example.busqueda;

import org.example.modelo.Plato;

public class BusquedaLineal {
    public static Plato buscarPorCodigo(Plato[] platos, String codigo) {

        for (Plato plato : platos) {

            if (plato.getCodigo().equalsIgnoreCase(codigo)) {
                return plato;
            }

        }

        return null;
    }
}
