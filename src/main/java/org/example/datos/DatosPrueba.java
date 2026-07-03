package org.example.datos;

import org.example.modelo.Pedido;
import org.example.modelo.Plato;

public class DatosPrueba {
    public static Plato[] obtenerPlatos() {

        return new Plato[]{

                new Plato("P001","Ceviche Clásico","Ceviches",35,20),
                new Plato("P002","Arroz con Mariscos","Arroces",42,15),
                new Plato("P003", "Jalea Mixta", "Fritos", 38, 10),
                new Plato("P004","Leche de Tigre","Entradas",18,30),
                new Plato("P005","Chicharrón","Fritos",28,12),
                new Plato("P006","Parihuela","Sopas",45,8),
                new Plato("P007","Causa","Entradas",22,25),
                new Plato("P008","Sudado","Fondos",40,10),
                new Plato("P009","Tiradito","Ceviches",34,18),
                new Plato("P010","Chupe","Sopas",48,6)
        };

    }

    public static Pedido[] obtenerPedidos(){

        return new Pedido[]{

                new Pedido(101,"Juan",120),
                new Pedido(102,"María",80),
                new Pedido(103,"Pedro",210),
                new Pedido(104,"Luis",60),
                new Pedido(105,"Ana",150)

        };

    }
}
