
package inventario;

import java.util.ArrayList;


public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }   
}
