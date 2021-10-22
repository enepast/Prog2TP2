/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Cargo;
import autores.modelos.Profesor;

/**
 *
 * @author Chuba
 */
public class MiembroEnGrupo {
    private Rol unRol;
    private Profesor unProfesor;
    private Grupo unGrupo;

    public MiembroEnGrupo(Rol unRol, Profesor unProfesor, Grupo unGrupo) {
        this.unRol = unRol;
        this.unProfesor = unProfesor;
        this.unGrupo = unGrupo;
    }
    
    

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    public Grupo getUnGrupo() {
        return unGrupo;
    }

    public void setUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }

    public void mostrarAutor(){
        System.out.println(this.unProfesor.getApellidos() + ", " + this.unProfesor.getNombres() );
        return;
    }
   
}
