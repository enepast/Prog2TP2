package grupos.modelos;

import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class Grupo {

    private String nombre;
    private String descripcion;

    public Grupo() {
        this.nombre = "";
        this.descripcion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre + "\nDescripción: " + this.descripcion);
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

}
