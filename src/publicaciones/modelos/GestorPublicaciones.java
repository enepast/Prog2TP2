/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

/**
 *
 * @author Chuba
 */
public class GestorPublicaciones {

    private static GestorPublicaciones gestor;

    private GestorPublicaciones() {

    }

    public static GestorPublicaciones crear() {
        if (gestor == null) {
            gestor = new GestorPublicaciones();
        }
        return gestor;
    }

}
