/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import interfaces.IGestorGrupos;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class GestorGrupos implements IGestorGrupos {

    private static GestorGrupos gestor;

    private GestorGrupos() {

    }

    public static GestorGrupos crear() {
        if (gestor == null) {
            gestor = new GestorGrupos();
        }
        return gestor;
    }

    ArrayList<Grupo> grupos = new ArrayList<>();

    @Override
    /*
     crea un nuevo grupo con el nombre y
descripción especificados, siempre y cuando no haya otro con el mismo nombre (el nombre no
puede ser nulo ni una cadena vacía). Devuelve una cadena con el resultado de la operación.
     */
    public String nuevoGrupo(String nombre, String descripcion) {
        if (nombre.isBlank() || nombre.equals("")) {
            return "Ingrese correctamente";
        }
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().toLowerCase().equals(nombre)) {
                return "Ya se creó anteriormente";
            } else {
                Grupo newGrupo = new Grupo(nombre, descripcion);
                this.grupos.add(newGrupo);
                return "Creado correctamente";
            }

        }
        return null;
    }

    @Override
    /*
    al grupo especificado le modifica su descripción. Devuelve una cadena con el resultado de la operación.
     */
    public String modificarGrupo(Grupo grupo, String descripcion) {
        int indice;
        Grupo newGrupo = new Grupo(grupo.getNombre(), descripcion);
        for (Grupo grupoAux : grupos) {
            if (grupoAux.getNombre().toLowerCase().equals(grupo)) {
                indice = grupos.indexOf(grupoAux);
                grupos.set(indice, newGrupo);
                return "Modificación exitosa";
            }
            return "Falló la modificación";
        }
        return null;
    }

    @Override
    /*
    devuelve todos los grupos.
     */
    public ArrayList<Grupo> verGrupos() {
        return grupos;
    }

    @Override
    /**
     * busca si existe un grupo cuyo nombre coincida con el especificado. Si
     * existe, lo devuelve, y si no devuelve null.
     */
    public Grupo verGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().toLowerCase().equals(nombre)) {
                return grupo;
            }
        }
        return null;
    }

    @Override
    /**
     * devuelve true si existe el grupo especificado, false en caso contrario.
     *
     */
    public boolean existeEsteGrupo(Grupo grupo) {
        for (Grupo grupoAux : grupos) {
            if (grupoAux.getNombre().toLowerCase().equals(grupo.getNombre().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
