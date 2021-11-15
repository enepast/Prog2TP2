/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

import interfaces.IGestorLugares;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class GestorLugares implements IGestorLugares {

    private ArrayList<Lugar> lugares = new ArrayList<>();

    private static GestorLugares gestor;

    private GestorLugares() {

    }

    public static GestorLugares crear() {
        if (gestor == null) {
            gestor = new GestorLugares();
        }
        return gestor;
    }
    @Override
    /*
    crea un nuevo lugar con el nombre especificado, siempre
y cuando no haya otro con el mismo nombre (el nombre no puede ser nulo ni una cadena vacía).
Devuelve una cadena con el resultado de la operación.

     */
    public String nuevoLugar(String nombre) {
        for (Lugar lugar : lugares) {
            if (nombre.isEmpty() || nombre.equals("")) {
                return "Ingrese correctamente";
            }
            if (lugar.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return "Ya se creó anteriormente";
            } else {
                Lugar newLugar = new Lugar(nombre);
                this.lugares.add(newLugar);
                return "Creado correctamente";
            }
        }
        return null;
    }

    @Override
    /*
    devuelve todos los lugares
     */
    public ArrayList<Lugar> verLugares() {
        return lugares;
    }

    @Override
    /*
    busca si existe un lugar cuyo nombre coincida con el
especificado. Si existe, lo devuelve, y si no devuelve null.
     */
    public Lugar verLugar(String nombre) {
        for (Lugar lugar : lugares) {
            if (lugar.getNombre().toLowerCase().equals(nombre)) {
                return lugar;
            }
        }
        return null;
    }
}
