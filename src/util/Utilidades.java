package util;
/**
 * Clase que contiene métodos auxiliares reutilizables
 * para la salida por consola.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Utilidades {
    /**
     * Muestra un título formateado en consola.
     *
     * @param titulo Texto del encabezado.
     */
    public static void mostrarTitulo(String titulo) {
        System.out.println("\n=== " + titulo.toUpperCase() + " ===");
    }
    /**
     * Imprime una línea separadora.
     */
    public static void separador() {
        System.out.println("----------------------------------");
    }
}
