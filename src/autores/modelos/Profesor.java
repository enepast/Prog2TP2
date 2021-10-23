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
public class Profesor extends Autor {

//    private int dni;
//    private String apellidos;
//    private String nombres;
//    private String clave;
    private Cargo cargo;

//    public Profesor() {
//        this.apellidos = "";
//        this.nombres = "";
//        this.clave = "";
//        this.cargo = Cargo.TITULAR;
//
//    }
    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        super(dni, apellidos, nombres, clave);
//        this.dni = dni;
//        this.apellidos = apellidos;
//        this.nombres = nombres;
//        this.clave = clave;
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("[" + super.getDni() + "] " + super.getApellidos() + ", " + super.getNombres() + ", " + this.cargo);
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
    public int hashCode() {
        int hash = 7;
        int aux = super.getDni();
        hash = 37 * hash + aux;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (this.getDni() != other.getDni()) {
            return false;
        }
        return true;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
