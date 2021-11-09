/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import tipos.modelos.Tipo;

/**
 *
 * @author Chuba
 */
public class IGestorTipos {

    public String nuevoTipo(String nombre) {
        return nombre;
    }

    ArrayList<Tipo> tipos = new ArrayList<>();

//    public ArrayList<Tipo> verTipos() {
//        for (Tipo tipos : unTipo) 
//        return;
//
//    }
    public Tipo verTipo(String nombre) {

        for (Tipo tipe : tipos) {
            if (tipe.getNombre().equals(nombre)) {
                return tipe;
            }

        }

//    }
    }
