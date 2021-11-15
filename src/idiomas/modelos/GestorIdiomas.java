/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import interfaces.IGestorIdiomas;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public class GestorIdiomas implements IGestorIdiomas {

    private ArrayList<Idioma> idiomas = new ArrayList<>();

    private static GestorIdiomas gestor;

    private GestorIdiomas() {

    }

    public static GestorIdiomas crear() {
        if (gestor == null) {
            gestor = new GestorIdiomas();
        }
        return gestor;
    }

    @Override
    /*
    crea un nuevo idioma con el nombre especificado,
siempre y cuando no haya otro con el mismo nombre (el nombre no puede ser nulo ni una cadena
vacía). Devuelve una cadena con el resultado de la operación.
     */
    public String nuevoIdioma(String nombre) {
        if (nombre.isBlank() || nombre.equals("")) {
            return "ingrese correctamente";
        }
        for (Idioma idioma : idiomas) {
            if (idioma.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return "Ya se creó anteriormente";
            } else {
                Idioma newIdioma = new Idioma(nombre);
                this.idiomas.add(newIdioma);
                return "Creado correctamente";
            }
        }
        return null;
    }

    @Override
    /*
        devuelve todos los idiomas.
     */
    public ArrayList<Idioma> verIdiomas() {
        return idiomas;
    }

    @Override
    /*
    busca si existe un idioma cuyo nombre coincida con el
especificado. Si existe, lo devuelve, y si no devuelve null.
     */
    public Idioma verIdioma(String nombre) {
        for (Idioma idioma : idiomas) {
            if (idioma.getNombre().toLowerCase().equals(nombre)) {
                return idioma;
            }
        }
        return null;
    }

}
