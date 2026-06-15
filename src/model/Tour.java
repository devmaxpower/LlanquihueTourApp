package model;
/**
 * Representa un tour turístico ofrecido por la agencia Llanquihue Tour.
 * Cada tour posee un nombre, un tipo y un precio.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    /**
     * Constructor vacío.
     *
     */
    //vacio
    public Tour(){
        this.nombre = "Recorrido volcán Villarica";
        this.tipo = "Senderismo";
        this.precio = 200000;
    }
    /**
     * Constructor de la clase Tour.
     *
     * @param nombre Nombre del tour.
     * @param tipo Tipo de tour.
     * @param precio Precio del tour.
     */
    //Con parametros
    public Tour(String nombre, String tipo, int precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    //getters
    /**
     * Obtiene el nombre del tour.
     *
     * @return Nombre del tour.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el tipo del tour.
     *
     * @return Tipo del tour.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Obtiene el precio del tour.
     *
     * @return Precio del tour.
     */
    public int getPrecio() {
        return precio;
    }
    //setters
    /**
     * Modifica el nombre del tour.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Modifica el tipo del tour.
     *
     * @param tipo Nuevo tipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Modifica el precio del tour.
     *
     * @param precio Nuevo precio.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
     * Retorna una representación textual del objeto.
     *
     * @return Información del tour.
     */
    //sobrescritura del método princiopal
    public String toString(){
        return "\n Nombre: "+ nombre +
                "\n Precio: " + precio +
                "\n Tipo: " + tipo;
    }
}
