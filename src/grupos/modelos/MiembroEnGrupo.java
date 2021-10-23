/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.modelos.Alumno;
import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Chuba
 */
public class MiembroEnGrupo {

    private Rol unRol;
    private Autor unAutor;
    private Grupo unGrupo;

    public MiembroEnGrupo(Rol unRol, Autor unAutor, Grupo unGrupo) {
        this.unRol = unRol;
        this.unAutor= unAutor;
        this.unGrupo = unGrupo;
    }

    @Override
    public String toString() {
        return "MiembroEnGrupo{" + "unRol=" + unRol + ", unAutor=" + unAutor + ", unGrupo=" + unGrupo + '}';
    }
    
    

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    public Autor getUnAutor() {
        return unAutor;
    }

    public void setUnAutor(Autor unAutor) {
        this.unAutor = unAutor;
    }

    public Grupo getUnGrupo() {
        return unGrupo;
    }

    public void setUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }

    public void mostrarAutor() {
        System.out.println(this.unAutor.getApellidos() + ", " + this.unAutor.getNombres());
        return;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.unAutor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.unAutor, other.unAutor)) {
            return false;
        }
        return true;
    }

}
