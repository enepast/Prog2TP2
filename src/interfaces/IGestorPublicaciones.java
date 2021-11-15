/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;

/**
 *
 * @author Chuba
 */
public interface IGestorPublicaciones {

    String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo,
            LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
            ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen);

    String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
            ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen);

    boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave);

    boolean hayPublicacionesConEsteLugar(Lugar lugar);

    boolean hayPublicacionesConEsteIdioma(Idioma idioma);

    boolean hayPublicacionesConEsteTipo(Tipo tipo);

    boolean hayPublicacionesConEsteAutor(Autor autor);

    boolean existeEstaPublicacion(Publicacion publicacion);

    ArrayList<Publicacion> verPublicaciones();

    Publicacion verPublicacion(String titulo);

}
