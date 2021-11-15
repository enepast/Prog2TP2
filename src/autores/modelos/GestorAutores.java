/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import interfaces.IGestorAutores;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Chuba
 */
public class GestorAutores implements IGestorAutores {

    private static GestorAutores gestor;

    private GestorAutores() {

    }

    public static GestorAutores crear() {
        if (gestor == null) {
            gestor = new GestorAutores();
        }
        return gestor;
    }

    ArrayList<Autor> autores = new ArrayList<>();

    ArrayList<Profesor> profesores = new ArrayList<>();

    ArrayList<Alumno> alumnos = new ArrayList<>();

    /**
     * crea un nuevo profesor con el dni, apellidos, nombres, cargo y clave
     * especificados, siempre y cuando no haya otro con el mismo dni (salvo la
     * clave, ningún otro atributo puede ser nulo ni una cadena vacía). Devuelve
     * una cadena con el resultado de la operación.
     *
     */
    //FUNCION AUXILIAR ESNULO para verificar si es nulo o una cadena vacía
    public boolean esNulo(String verificar) {
        if (verificar.isEmpty() || Objects.isNull(verificar)) {
            return true;
        }
        return false;
    }

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if (!clave.equals(claveRepetida)) {
            return "Claves no coinciden";
        }
        if (!(dni <= 0 || esNulo(apellidos) || esNulo(nombres))) {
            for (Autor author : autores) {
                if (author.getDni() == dni) {
                    return "Ya se encuentra registrado ese DNI a nombre de: " + author.getApellidoNombre();
                }
            }
//SI NO SE ENCUENTRA REGISTRADO ESE DNI, LO AGREGA AL ARRAY DE AUTORES Y DE PROFESORES
            Autor nuevoProfesor = new Profesor(dni, apellidos, nombres, clave, cargo);
            autores.add(nuevoProfesor);
            Profesor nuevoProfe = new Profesor(dni, apellidos, nombres, clave, cargo);
            profesores.add(nuevoProfe);
            return "Autor - Profesor agregado correctamente";
        }
        return "Autor ingresado incorrectamente";
    }

    /**
     * crea un nuevo alumno con el dni, apellidos, nombres, cx y clave
     * especificados, siempre y cuando no haya otro con el mismo dni ni con el
     * mismo cx (salvo la clave, ningún otro atributo puede ser nulo ni una
     * cadena vacía). Devuelve una cadena con el resultado de la operación.
     *
     * @return
     */
    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if (!clave.equals(claveRepetida)) {
            return "Claves no coinciden";
        }
        if (!(dni <= 0 || esNulo(apellidos) || esNulo(nombres))) {
            for (Autor author : autores) {
                if (author.getDni() == dni) {
                    return "Ya se encuentra registrado ese DNI a nombre de: " + author.getApellidoNombre();
                }
            }
//SI NO SE ENCUENTRA REGISTRADO ESE DNI, LO AGREGA AL ARRAY DE AUTORES Y DE PROFESORES
            Alumno nuevoAlumno = new Alumno(dni, apellidos, nombres, clave, cx);
            autores.add(nuevoAlumno);
            alumnos.add(nuevoAlumno);
            return "Autor - Alumno agregado correctamente";
        }
        return "Autor ingresado incorrectamente";
    }

    /**
     * modifica un profesor (salvo la clave, ningún otro atributo puede ser nulo
     * ni una cadena vacía). Devuelve una cadena con el resultado de la
     * operación.
     *
     * @param autor
     * @param apellidos
     * @param nombres
     * @param cargo
     * @param clave
     * @param claveRepetida
     * @return
     */
    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        int aux = 0;
        if (!clave.equals(claveRepetida)) {
            return "Claves no coinciden";
        }
        if (!(esNulo(apellidos) || esNulo(nombres))) {
            for (Autor author : autores) {
                if (author.getDni() == autor.getDni()) {
                    author = new Profesor(author.getDni(), apellidos, nombres, clave, cargo);
                    aux = 1;
                    for (Profesor profesore : profesores) {
                        if (profesore.getDni() == autor.getDni()) {
                            profesore = new Profesor(author.getDni(), apellidos, nombres, clave, cargo);
                        }

                    }
                }
            }
        }
        if (aux == 0) {
            return "No se encontró el autor ingresado";
        } else {
            return "Cambio exitoso";
        }
    }

    /**
     * modifica un alumno (salvo la clave, ningún otro atributo puede ser nulo
     * ni una cadena vacía). Devuelve una cadena con el resultado de la
     * operación.
     *
     * @param autor
     * @param apellidos
     * @param nombres
     * @param cx
     * @param clave
     * @param claveRepetida
     * @return
     */
    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        int aux = 0;
        if (!clave.equals(claveRepetida)) {
            return "Claves no coinciden";
        }
        if (!(esNulo(apellidos) || esNulo(nombres))) {
            for (Autor author : autores) {
                if (author.getDni() == autor.getDni()) {
                    author = new Alumno(author.getDni(), apellidos, nombres, clave, cx);
                    aux = 1;
                }
                for (Alumno alumne : alumnos) {
                    if (alumne.getDni() == autor.getDni()) {
                        alumne = new Alumno(author.getDni(), apellidos, nombres, clave, cx);
                    }
                }
            }

            if (aux == 0) {
                return "No se encontró el autor ingresado";
            } else {
                return "Cambio exitoso";
            }
        }
        return "Datos mal ingresados";
    }

    /**
     * devuelve true si existe el autor especificado, false en caso contrario.
     *
     * @param autor
     * @return
     */
    @Override
    public boolean existeEsteAutor(Autor autor
    ) {
        for (Autor autore : autores) {
            if (autore.equals(autor)) {
                return true;
            }
        }
        return false;
    }

    /**
     * devuelve todos los autores.
     *
     * @return
     */
    @Override
    public ArrayList<Autor> verAutores() {
        return autores;
    }

    /**
     * devuelve todos los profesores.
     *
     * @return
     */
    @Override
    public ArrayList<Profesor> verProfesores() {
        return profesores;
    }

    /**
     * devuelve todos los alumnos.
     *
     * @return
     */
    @Override
    public ArrayList<Alumno> verAlumnos() {
        return alumnos;
    }

    /**
     * busca si existe un autor cuyo dni coincida con el especificado. Si
     * existe, lo devuelve, y si no devuelve null.
     *
     * @param dni
     * @return Autor
     */
    @Override
    public Autor verAutor(int dni) {
        for (Autor autore : autores) {
            if (autore.getDni() == dni) {
                return autore;
            }
        }
        return null;
    }

}
