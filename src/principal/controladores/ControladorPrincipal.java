/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Chuba
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        
        Alumno a1 = new Alumno(1, "Nieva", "Dario", "asd123", "11");
        alumnos.add(a1);
        Alumno a2 = new Alumno(2, "Dario", "Nieva", "asd123", "12");
        alumnos.add(a2);
        Alumno a3 = new Alumno(3, "Pastoriza", "Dario", "asd123", "13");
        alumnos.add(a3);
                
        for (Alumno alumn : alumnos){
            alumn.mostrar();
        }
        
        
    }
    
}
