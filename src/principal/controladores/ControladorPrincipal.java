/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
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
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        ArrayList<Profesor> profesores = new ArrayList<>();
//        ArrayList<Idioma> idiomas = new ArrayList<>();
//        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
//        ArrayList<Tipo> tipos = new ArrayList<>();
//        ArrayList<Grupo> grupos = new ArrayList<>();
        /*
        Alumno a1 = new Alumno(1, "Nieva", "Dario", "asd123", "11");
        alumnos.add(a1);
        Alumno a2 = new Alumno(2, "Dario", "Nieva", "asd123", "12");
        alumnos.add(a2);
        Alumno a3 = new Alumno(3, "Pastoriza", "Dario", "asd123", "13");
        alumnos.add(a3);
                
        for (Alumno alumn : alumnos) alumn.mostrar();*/
        
        List<String> titulosPublicaciones = List.of("Publicacion 1", "Publicacion 2", "Publicacion 3");
        List<LocalDate> fechasPublicaciones = List.of(LocalDate.now(), LocalDate.now(), LocalDate.now());
        List<String> enlacesPublicaciones = List.of("Enlace 1", "Enlace 2", "Enlace 3");
        List<String> resumenesPublicaciones = List.of("Resumen 1", "Resumen 2", "Resumen 3");
        List<Idioma> idiomasPublicaciones = List.of(new Idioma("Spanish"), new Idioma("English"), new Idioma("Portuguese"));
        List<Lugar> lugaresPublicaciones = List.of(new Lugar("Metan"), new Lugar("Salta"), new Lugar("Casa de Ber"));
        List<Tipo> tiposPublicaciones = List.of(new Tipo("Tipo 1"), new Tipo("Tipo 3"), new Tipo("Tipo 3"));
        MiembroEnGrupo miembrosPublicaciones = new MiembroEnGrupo(Rol.COLABORADOR, new Profesor(0, "Tenca", "Vieja", "124", Cargo.ADG), new Grupo("Petes", "junior"));
        List<Publicacion> publicaciones = new ArrayList<>();
        
        for(int i=0; i<3;i++){
            Publicacion publicacionTemporal = new Publicacion(titulosPublicaciones.get(i),  fechasPublicaciones.get(i),
            enlacesPublicaciones.get(i), resumenesPublicaciones.get(i), idiomasPublicaciones.get(i), lugaresPublicaciones.get(i),
            tiposPublicaciones.get(i), miembrosPublicaciones);
            publicaciones.add(publicacionTemporal);
        }
        
        
       for (Publicacion publi: publicaciones) publi.mostrar();
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
