/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Chuba
 */
public class Publicacion {

    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;

    private Idioma unIdioma;
    private Lugar unLugar;
    private ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
    private Tipo unTipo;
    private MiembroEnGrupo miembro;

    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen, Idioma unIdioma, Lugar unLugar, Tipo unTipo, MiembroEnGrupo miembro) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.unIdioma = unIdioma;
        this.unLugar = unLugar;
        this.unTipo = unTipo;
        this.miembro = miembro;
    }
    
    /**
     * Método para mostrar lo requerido en el punto 7 del TP3
     */
    public void mostrar() {
        String lineTwo = this.miembro != null ? this.miembro.getUnProfesor().getApellidoNombre() : "";
        String lineThree = this.miembro != null ? this.miembro.getUnGrupo().getNombre() : "";
        String lineFour = this.miembro != null ? this.miembro.getUnRol().name() : "";
        String lineFive = this.unTipo != null ? this.unTipo.getNombre() : "";
        String lineSix = this.unIdioma != null ? this.unIdioma.getNombre() : "";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Título:  " + this.titulo);
        System.out.println("Autor: " + lineTwo);
        System.out.println("Grupo: " + lineThree);
        System.out.println("Rol: " + lineFour);
        System.out.println("Fecha de publicación: " + this.getFechaPublicacion().format(formatter));
        System.out.println("Tipo: " + lineFive);
        System.out.println("Idioma: " + lineSix);
        System.out.println("Palabras claves");
        for (PalabraClave pal : palabrasClaves) {
            pal.toString();
        }
        System.out.println("Enlace: " + this.enlace);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Idioma getUnIdioma() {
        return unIdioma;
    }

    public void setUnIdioma(Idioma unIdioma) {
        this.unIdioma = unIdioma;
    }

    public Lugar getUnLugar() {
        return unLugar;
    }

    public void setUnLugar(Lugar unLugar) {
        this.unLugar = unLugar;
    }

    public ArrayList<PalabraClave> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<PalabraClave> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public Tipo getUnTipo() {
        return unTipo;
    }

    public void setUnTipo(Tipo unTipo) {
        this.unTipo = unTipo;
    }

    public MiembroEnGrupo getMiembro() {
        return miembro;
    }

    public void setMiembro(MiembroEnGrupo miembro) {
        this.miembro = miembro;
    }

}
