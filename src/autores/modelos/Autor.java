/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public abstract class Autor {

    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private ArrayList<MiembroEnGrupo> miembros = new ArrayList<>();

    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }

    public ArrayList verGrupos() {
        return this.miembros;
    }

    public boolean agregarGrupo(Grupo grupo, Rol rol) {
        MiembroEnGrupo miembroNuevo = new MiembroEnGrupo(this, grupo, rol);
        if (!miembros.contains(miembroNuevo)) {
            miembros.add(miembroNuevo);
            grupo.agregarMiembro(this, rol);
            return true;
        }
        return false;

    }

    public void quitarGrupo(Grupo group) {
        ArrayList<MiembroEnGrupo> nuevaLista = new ArrayList<>();
        for (MiembroEnGrupo member : miembros) {
            if (!member.getUnGrupo().equals(group)) {
                nuevaLista.add(member);
                group.quitarMiembro(this);
            }
        }
        miembros = nuevaLista;
    }

    public boolean esSuperAdministrador() {
        for (MiembroEnGrupo member : miembros) {
            if (member.getUnRol().equals(Rol.SUPERADMINISTRADOR)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.dni;
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
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    public abstract String getApellidoNombre();

    /**
     * función mostrar de la clase Autor
     */
    public void mostrar() {
        for (MiembroEnGrupo member : miembros) {
            System.out.println("Grupo: " + member.getUnGrupo() + "Rol: " + member.getUnRol());
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
