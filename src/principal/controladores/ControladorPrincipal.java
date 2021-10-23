/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;
import lugares.modelos.Lugar;

/**
 *
 * @author Chuba
 */
public class ControladorPrincipal {

    public static void main(String[] args) {
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();

        /**
         * Array de alumnos
         */
        Autor a1 = new Alumno(1, "Nieva", "Dario", "asd123", "11");
        autores.add(a1);
        Autor a2 = new Alumno(2, "Dario", "Nieva", "asd123", "12");
        if (!autores.contains(a2)) {
            autores.add(a2);
        }

        Alumno a3 = new Alumno(3, "Pastoriza", "Dario", "asd123", "13");
        if (!autores.contains(a3)) {
            autores.add(a3);
        }

        for (Autor alumn : autores) {
            alumn.mostrar();
        }

        /**
         * Array de profesores
         */
        Autor p1 = new Profesor(1, "Nieva", "Dario", "asd123", Cargo.ADG);
        autores.add(p1);
        Autor p2 = new Profesor(2, "Dario", "Nieva", "asd123", Cargo.ASOCIADO);
        if (!autores.contains(p2)) {
            autores.add(p2);
        }

        Profesor p3 = new Profesor(3, "Pastoriza", "Dario", "asd123", Cargo.JTP);
        if (!autores.contains(p3)) {
            autores.add(p3);
        }

        for (Autor profe : autores) {
            profe.mostrar();
        }

        /**
         * Array de tipos
         */
        Tipo t1 = new Tipo("tipito 1");
        tipos.add(t1);
        Tipo t2 = new Tipo("tipito 2");
        if (!tipos.contains(t2)) {
            tipos.add(t2);
        }
        Tipo t3 = new Tipo("tipito 1");
        if (!tipos.contains(t3)) {
            tipos.add(t3);
        }

        for (Tipo ti : tipos) {
            ti.mostrar();
        }

        /**
         * Array de palabras claves
         */
        PalabraClave palabras1 = new PalabraClave("palabritas 1");
        palabrasClaves.add(palabras1);
        PalabraClave palabras2 = new PalabraClave("cocinar");
        if (!palabrasClaves.contains(palabras2)) {
            palabrasClaves.add(palabras2);
        }
        PalabraClave palabras3 = new PalabraClave("cocinar");
        if (!palabrasClaves.contains(palabras3)) {
            palabrasClaves.add(palabras3);
        }

        for (PalabraClave palabrita : palabrasClaves) {
            palabrita.mostrar();
        }

        /**
         * Array de idiomas
         */
        Idioma idioma1 = new Idioma("Español");
        idiomas.add(idioma1);
        Idioma idioma2 = new Idioma("Portuguese");
        if (!idiomas.contains(idioma2)) {
            idiomas.add(idioma2);
        }
        Idioma idioma3 = new Idioma("Portuguese");
        if (!idiomas.contains(idioma3)) {
            idiomas.add(idioma3);
        }

        for (Idioma idio : idiomas) {
            idio.mostrar();
        }

        /**
         *Array de lugares
         */
        Lugar lugar1 = new Lugar("Tucuman");
        lugares.add(lugar1);
        Lugar lugar2 = new Lugar("Santiago del Estero");
        if(!lugares.contains(lugar2)) lugares.add(lugar2);
        Lugar lugar3 = new Lugar("Santiago del Estero");
        if(!lugares.contains(lugar3)) lugares.add(lugar3);
        
        for(Lugar lug : lugares) lug.mostrar();
        
        Grupo grupo1 = new Grupo("grupo 1", "descripcion 1");
        grupos.add(grupo1);
        Grupo grupo2 = new Grupo("grupo 2", "descripcion 2");
        if(!grupos.contains(grupo2)) grupos.add(grupo2);
        Grupo grupo3 = new Grupo("grupo 2", "descripcion 3");
        if(!grupos.contains(grupo3)) grupos.add(grupo3);
        
        for(Grupo group : grupos) group.mostrar();
        
        List<String> titulosPublicaciones = List.of("Publicacion 1", "Publicacion 2", "Publicacion 1");
        List<LocalDate> fechasPublicaciones = List.of(LocalDate.now(), LocalDate.now(), LocalDate.now());
        List<String> enlacesPublicaciones = List.of("Enlace 1", "Enlace 2", "Enlace 3");
        List<String> resumenesPublicaciones = List.of("Resumen 1", "Resumen 2", "Resumen 3");
        List<Idioma> idiomasPublicaciones = List.of(new Idioma("Spanish"), new Idioma("English"), new Idioma("Portuguese"));
        List<Lugar> lugaresPublicaciones = List.of(new Lugar("Tucuman"), new Lugar("Salta"), new Lugar("Santiago del Estero"));
        List<Tipo> tiposPublicaciones = List.of(new Tipo("Tipo 1"), new Tipo("Tipo 3"), new Tipo("Tipo 3"));
        MiembroEnGrupo miembrosPublicaciones = new MiembroEnGrupo(Rol.COLABORADOR, new Profesor(0, "Nieva", "Dario", "124", Cargo.ADG), new Grupo("Prog", "junior"));
        MiembroEnGrupo miembrosPublicaciones1 = new MiembroEnGrupo(Rol.COLABORADOR, new Alumno(0, "Nieva", "Dario", "124", "clave"), new Grupo("Prog", "junior"));
        List<Publicacion> publicaciones = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Publicacion publicacionTemporal = new Publicacion(titulosPublicaciones.get(i), fechasPublicaciones.get(i),
                    enlacesPublicaciones.get(i), resumenesPublicaciones.get(i), idiomasPublicaciones.get(i), lugaresPublicaciones.get(i),
                    tiposPublicaciones.get(i), miembrosPublicaciones);

            if(!publicaciones.contains(publicacionTemporal)) publicaciones.add(publicacionTemporal);
        }

        for (Publicacion publi : publicaciones) {
            publi.mostrar();
        }
        //publicaciones.stream().forEach(Publicacion::mostrar);

        VentanaAMAlumno ventanaalu = new VentanaAMAlumno(null);
        ventanaalu.setVisible(true);
        VentanaAMProfesor ventanaprofe = new VentanaAMProfesor(null);
        ventanaprofe.setVisible(true);
        VentanaAMGrupo ventanagru = new VentanaAMGrupo(null);
        ventanagru.setVisible(true);
        VentanaAIdioma ventanaidio = new VentanaAIdioma(null);
        ventanaidio.setVisible(true);
        VentanaALugar ventanalu = new VentanaALugar(null);
        ventanalu.setVisible(true);
        VentanaAPalabraClave ventanapal = new VentanaAPalabraClave(null);
        ventanapal.setVisible(true);
        VentanaATipo ventanatipo = new VentanaATipo(null);
        ventanatipo.setVisible(true);
    }

}
