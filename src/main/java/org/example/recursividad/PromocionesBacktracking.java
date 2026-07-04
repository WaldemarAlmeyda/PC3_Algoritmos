package org.example.recursividad;

import org.example.modelo.Plato;

import java.util.ArrayList;

public class PromocionesBacktracking {
    public static void buscarCombinaciones(Plato[] platos, double presupuesto) {

        ArrayList<Plato> combinacion = new ArrayList<>();

        backtracking(platos, presupuesto, 0, 0, combinacion);

    }

    private static void backtracking(Plato[] platos,
                                     double presupuesto,
                                     int indice,
                                     double total,
                                     ArrayList<Plato> combinacion) {

        // Si el total supera el presupuesto, retrocede
        if (total > presupuesto) {
            return;
        }

        // Mostrar la combinación encontrada
        System.out.println("--------------------------------");

        System.out.println("Total: S/" + total);

        for (Plato plato : combinacion) {
            System.out.println("- " + plato.getNombre()
                                       + " (S/" + plato.getPrecio() + ")");
        }

        // Probar nuevas combinaciones
        for (int i = indice; i < platos.length; i++) {

            combinacion.add(platos[i]);

            backtracking(
                    platos,
                    presupuesto,
                    i + 1,
                    total + platos[i].getPrecio(),
                    combinacion
            );

            // Backtracking: eliminar el último plato agregado
            combinacion.remove(combinacion.size() - 1);

        }

    }
}
