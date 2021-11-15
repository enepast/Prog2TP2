/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import interfaces.IGestorPublicaciones;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Chuba
 */
public class GestorPublicaciones implements IGestorPublicaciones {

    private static GestorPublicaciones gestor;

    private GestorPublicaciones() {

    }

    public static GestorPublicaciones crear() {
        if (gestor == null) {
            gestor = new GestorPublicaciones();
        }
        return gestor;
    }

    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    //FUNCION AUXILIAR ESNULO para verificar si es nulo o una cadena vacía
    public boolean esNulo(String verificar) {
        if (verificar.isEmpty() || Objects.isNull(verificar)) {
            return true;
        }
        return false;
    }

    /**
     * crea una nueva publicación con el título, autor y grupo (MiembroEnGrupo),
     * fecha, tipo, idioma, lugar, palabras claves, enlace y resumen
     * especificado, siempre y cuando no haya otra con el mismo título (ningún
     * atributo puede ser nulo o vacío). Devuelve una cadena con el resultado de
     * la operación.
     *
     * @param titulo
     * @param miembroEnGrupo
     * @param fechaPublicacion
     * @param tipo
     * @param idioma
     * @param lugar
     * @param palabrasClaves
     * @param enlace
     * @param resumen
     * @return
     */
    @Override
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        if (esNulo(titulo) || Objects.equals(null, miembroEnGrupo) || Objects.equals(null, fechaPublicacion) || Objects.equals(null, tipo) || Objects.equals(null, lugar) || Objects.equals(null, palabrasClaves) || esNulo(enlace) || esNulo(resumen)) {
            return "Datos ingresados incorrectamente (un dato es nulo)";
        }
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getTitulo().toLowerCase().equals(titulo)) {
                return "Titulo de la publicacion ya existente";
            }
            Publicacion nuevaPubli = new Publicacion(titulo, miembroEnGrupo, fechaPublicacion, tipo, idioma, lugar, palabrasClaves, enlace, resumen);
            publicaciones.add(nuevaPubli);
            return "Publicacion creada exitosamente";
        }
        return null;
    }

    /**
     * modifica una publicación (ningún atributo puede ser nulo o vacío).
     * Devuelve una cadena con el resultado de la operación.
     *
     * @param publicacion
     * @param miembroEnGrupo
     * @param fechaPublicacion
     * @param tipo
     * @param idioma
     * @param lugar
     * @param palabrasClaves
     * @param enlace
     * @param resumen
     * @return
     */
    @Override
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        int index = -1;
        for (Publicacion publi : publicaciones) {
            if (publi.getTitulo().toLowerCase().equals(publicacion.getTitulo().toLowerCase())) {
                index = publicaciones.indexOf(publi);
                Publicacion nuevaPubli = new Publicacion(publi.getTitulo(), miembroEnGrupo, fechaPublicacion, tipo, idioma, lugar, palabrasClaves, enlace, resumen);
                publicaciones.add(index, nuevaPubli);
                return "Publicacion modificada exitosamente";
            }
        }
        return "No existe publicacion con los parametros ingresados";
    }

    /**
     * busca si hay al menos una publicación con la palabra clave especificada.
     *
     * @param palabraClave
     * @return
     */
    @Override
    public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave) {
        for (Publicacion publi : publicaciones) {
            if (publi.getPalabrasClaves().contains(palabraClave)) {
                return true;
            }
        }
        return false;
    }

    /**
     * busca si hay al menos una publicación con el lugar especificado.
     *
     * @param lugar
     * @return
     */
    @Override
    public boolean hayPublicacionesConEsteLugar(Lugar lugar) {
        for (Publicacion publi : publicaciones) {
            if (publi.getUnLugar().equals(lugar)) {
                return true;
            }
        }
        return false;
    }

    /**
     * busca si hay al menos una publicación con el idioma especificado.
     *
     * @param idioma
     * @return
     */
    @Override
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma) {
        for (Publicacion publi : publicaciones) {
            if (publi.getUnIdioma().equals(idioma)) {
                return true;
            }
        }
        return false;
    }

    /**
     * busca si hay al menos una publicación con el tipo especificado
     *
     * @param tipo
     * @return
     */
    @Override
    public boolean hayPublicacionesConEsteTipo(Tipo tipo) {
        for (Publicacion publi : publicaciones) {
            if (publi.getUnTipo().equals(tipo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * busca si hay al menos una publicación con el autor especificado
     *
     * @param autor
     * @return
     */
    @Override
    public boolean hayPublicacionesConEsteAutor(Autor autor) {
        for (Publicacion publi : publicaciones) {
            if (publi.getMiembro().equals(autor)) {
                return true;
            }
        }
        return false;
    }

    /**
     * devuelve true si existe la publicación especificada, false en caso
     * contrario
     *
     * @param publicacion
     * @return
     */
    @Override
    public boolean existeEstaPublicacion(Publicacion publicacion) {
        for (Publicacion publi : publicaciones) {
            if (publi.equals(publicacion)) {
                return true;
            }
        }
        return false;
    }

    /**
     * devuelve todas las publicaciones.
     *
     * @return
     */
    @Override
    public ArrayList<Publicacion> verPublicaciones() {
        return publicaciones;
    }

    /**
     * : busca si existe una publicación cuyo título coincida con el
     * especificado. Si existe, la devuelve, y si no devuelve null.
     *
     * @param titulo
     * @return
     */
    @Override
    public Publicacion verPublicacion(String titulo) {
        for (Publicacion publi : publicaciones) {
            if (publi.getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                return publi;
            }
        }
        return null;
    }

}
