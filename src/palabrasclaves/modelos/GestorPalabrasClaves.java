/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

import interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class GestorPalabrasClaves implements IGestorPalabrasClaves {
    
      private static GestorPalabrasClaves gestor;

    private GestorPalabrasClaves() {

    }

    public static GestorPalabrasClaves crear() {
        if (gestor == null) {
            gestor = new GestorPalabrasClaves();
        }
        return gestor;
    }

    private ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();

    @Override
    /*
    public String nuevaPalabraClave(String nombre): crea una nueva palabra clave con el nombre
especificado, siempre y cuando no haya otra con el mismo nombre (el nombre no puede ser nulo ni
una cadena vacía). Devuelve una cadena con el resultado de la operación.

     */
    public String nuevaPalabraClave(String nombre) {
        for (PalabraClave palabrasClave : palabrasClaves) {
            if (nombre.isEmpty() || nombre.equals("")) {
                return "Ingrese correctamente";
            }
            if (palabrasClave.getNombre().toLowerCase().equals(nombre)) {
                return "Ya se creó anteriormente";
            } else {
                PalabraClave newPalabra = new PalabraClave(nombre);
                this.palabrasClaves.add(newPalabra);
                return "Creado correctamente";
            }
        }
        return null;
    }

    @Override
    /*
    devuelve todas las palabras claves.
     */
    public ArrayList<PalabraClave> verPalabrasClaves() {
        return this.palabrasClaves;
    }

    @Override
    /*
    busca si existe una palabra clave cuyo nombre coincida con el especificado. 
    Si existe, la devuelve, y si no devuelve null.
     */
    public PalabraClave verPalabraClave(String nombre) {
        for (PalabraClave palabrasClave : palabrasClaves) {
            if (palabrasClave.getNombre().toLowerCase().equals(nombre)) {
                return palabrasClave;
            }
        }
        return null;
    }

}
