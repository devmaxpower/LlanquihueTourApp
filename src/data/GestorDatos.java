package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Gestiona la lectura de datos desde archivos de texto.
 * Convierte cada registro leído en objetos de tipo Tour.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class GestorDatos {
    /**
     * Lee un archivo de texto y genera una colección de tours.
     *
     * @param rutaArchivo Ruta del archivo a leer.
     * @return Lista de objetos Tour.
     */
    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);
                Tour tour = new Tour(nombre, tipo, precio);
                tours.add(tour);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return tours;
    }
}