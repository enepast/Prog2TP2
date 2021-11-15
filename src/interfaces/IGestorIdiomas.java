/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import idiomas.modelos.Idioma;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public interface IGestorIdiomas {

    String nuevoIdioma(String nombre);

    ArrayList<Idioma> verIdiomas();

    Idioma verIdioma(String nombre);

}
