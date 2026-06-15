package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.leerTours("resources/tours.txt");
        System.out.println("=== LISTA COMPLETA DE TOURS ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }
        System.out.println("\n=== TOURS GASTRONÓMICOS ===");
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronómico")) {
                System.out.println(tour);
            }
        }
    }
}