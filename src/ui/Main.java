package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;
import util.Utilidades;

/**
 * Clase principal de la aplicación.
 * Permite cargar, recorrer y filtrar información
 * de tours turísticos almacenados en un archivo.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */

public class Main {
    /**
     * Método principal de ejecución.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.leerTours("resources/tours.txt");
        Utilidades.mostrarTitulo("Lista completa de tours");
        for (Tour tour : tours) {
            System.out.println(tour);
        }
        Utilidades.mostrarTitulo("Tours gastronómicos");
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronómico")) {
                System.out.println(tour);
            }
        }
    }
}