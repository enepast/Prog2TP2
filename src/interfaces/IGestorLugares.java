/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import lugares.modelos.Lugar;

/**
 *
 * @author Chuba
 */
public interface IGestorLugares {

    String nuevoLugar(String nombre);

    ArrayList<Lugar> verLugares();

    Lugar verLugar(String nombre);

}
