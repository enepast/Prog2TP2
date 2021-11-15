/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public interface IGestorAutores {

    /**
     * crea un nuevo profesor con el dni, apellidos, nombres, cargo y clave
     * especificados, siempre y cuando no haya otro con el mismo dni (salvo la
     * clave, ningún otro atributo puede ser nulo ni una cadena vacía). Devuelve
     * una cadena con el resultado de la operación.
     *
     * @param dni
     * @param apellidos
     * @param nombres
     * @param cargo
     * @param clave
     * @param claveRepetida
     * @return
     */
    String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo,
            String clave, String claveRepetida);

    String nuevoAutor(int dni, String apellidos, String nombres, String cx,
            String clave, String claveRepetida);

    String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida);

    String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida);

    boolean existeEsteAutor(Autor autor);

    ArrayList<Autor> verAutores();

    ArrayList<Profesor> verProfesores();

    ArrayList<Alumno> verAlumnos();

    Autor verAutor(int dni);

}
