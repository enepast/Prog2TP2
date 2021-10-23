package grupos.modelos;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author Chuba
 */
public class Grupo {

    private String nombre;
    private String descripcion;
    private List<MiembroEnGrupo> miembros = new ArrayList<>();
    private Autor autor;
    private Rol rol;

    public Grupo() {
        this.nombre = "";
        this.descripcion = "";
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void verMiembros() {
        System.out.println(miembros);
    }

    /**
     *
     * @param autor
     * @param rol
     * @return true if added success or false otherwise
     */
    public boolean agregarMiembro(Autor autor, Rol rol) {
        MiembroEnGrupo miembroNuevo = new MiembroEnGrupo(rol, autor, this);
        if (!miembros.contains(miembroNuevo)) {
            miembros.add(miembroNuevo);
            return true;
        }
        return false;

    }

    public void quitarMiembro(Autor miembro) {
        for (MiembroEnGrupo member : miembros) {
            if (member.getUnAutor().equals(miembro)) {
                miembros.remove(member);
            }
        }
    }

    public boolean esSuperAdministradores() {
        return this.rol == Rol.SUPERADMINISTRADOR;
    }

    public boolean tieneMiembros() {
        return !this.miembros.isEmpty();

    }

    public void mostrar() {
        for (MiembroEnGrupo member : miembros) {
            System.out.println("Miembro: " + member.getUnAutor().getApellidoNombre() + "Descripción: " + member.getUnRol());
        }
    }

    //GET/SET
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase())) {
            return false;
        }
        return true;
    }

}
