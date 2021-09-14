/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

/**
 *
 * @author Chuba
 */
public class Lugar {
    private String nombre;
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre;
    }
}
