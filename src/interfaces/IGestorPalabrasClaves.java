/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;

/**
 *
 * @author Chuba
 */
public interface IGestorPalabrasClaves {

    String nuevaPalabraClave(String nombre);

    ArrayList<PalabraClave> verPalabrasClaves();

    PalabraClave verPalabraClave(String nombre);

}
