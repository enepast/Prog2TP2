/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Chuba
 */
public class Alumno extends Autor {

    private String cx;

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }

        /**
     *
     * @return Este método devuelve Apellidos, Nombres
     */
    @Override
    public String getApellidoNombre() {
        return super.getApellidos() + ", " + super.getNombres();
    }
    
    @Override
    public void mostrar() {
        System.out.println("[" + super.getDni() + "] " + super.getApellidos() + ", " + super.getNombres() + ", " + this.cx);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + super.getDni();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //Para comprobar si el DNI es el mismo
        if (!super.equals(obj)) {
            return true;
        }

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (super.getDni() != other.getDni()) {
            return false;
        }
        return true;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

}
