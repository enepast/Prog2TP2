/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import grupos.modelos.Grupo;
import java.util.ArrayList;

/**
 *
 * @author Chuba
 */
public interface IGestorGrupos {

    String nuevoGrupo(String nombre, String descripcion);

    String modificarGrupo(Grupo grupo, String descripcion);

    ArrayList<Grupo> verGrupos();

    Grupo verGrupo(String nombre);

    boolean existeEsteGrupo(Grupo grupo);

}
