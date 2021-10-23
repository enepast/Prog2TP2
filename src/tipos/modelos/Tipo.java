/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import java.util.Objects;

/**
 *
 * @author Chuba
 */
public class Tipo {
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println(this.nombre);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre;
        }

    /**
     * 
     * @return Método de comparación
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase())) {
            return false;
        }
        return true;
    }
    
    
}
