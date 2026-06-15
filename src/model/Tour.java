package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    //vacio
    public Tour(){
        this.nombre = "Recorrido volcán Villarica";
        this.tipo = "Senderismo";
        this.precio = 200000;
    }
    //Con parametros
    public Tour(String nombre, String tipo, int precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getPrecio() {
        return precio;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //sobrescritura del método princiopal
    public String toString(){
        return "\n Nombre: "+ nombre +
                "\n Precio: " + precio +
                "\n Tipo: " + tipo;
    }
}
