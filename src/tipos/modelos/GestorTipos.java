/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import interfaces.IGestorTipos;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class GestorTipos implements IGestorTipos {
    
      private static GestorTipos gestor;

    private GestorTipos() {

    }

    public static GestorTipos crear() {
        if (gestor == null) {
            gestor = new GestorTipos();
        }
        return gestor;
    }

    private ArrayList<Tipo> tipos = new ArrayList<>();

    @Override
    /**
     * crea un nuevo tipo de publicación con el nombre especificado, siempre y
     * cuando no haya otro con el mismo nombre (el nombre no puede ser nulo ni
     * una cadena vacía). Devuelve una cadena con el resultado de la operación.
     */
    public String nuevoTipo(String nombre) {
        for (Tipo tipo : tipos) {
            if (nombre.isEmpty() || nombre.equals("")) {
                return "Ingrese correctamente";
            }
            if (tipo.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return "Ya se creó anteriormente";
            } else {
                Tipo newTipo = new Tipo(nombre);
                this.tipos.add(newTipo);
                return "Creado correctamente";
            }
        }
        return null;
    }

    @Override
    /**
     * devuelve todos los tipos de publicación
     */
    public ArrayList<Tipo> verTipos() {
        return this.tipos;
    }

    @Override
    /**
     * busca si existe un tipo cuyo nombre coincida con el especificado. Si
     * existe, lo devuelve, y si no devuelve null.
     *
     */
    public Tipo verTipo(String nombre) {
        for (Tipo tipo : tipos) {
            if (tipo.getNombre().toLowerCase().equals(nombre)) {
                return tipo;
            }
        }
        return null;
    }
}
