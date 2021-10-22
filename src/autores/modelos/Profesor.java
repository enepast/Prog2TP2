/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chuba
 */
public class Profesor {

    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private Cargo cargo;

    public Profesor() {
        this.apellidos = "";
        this.nombres = "";
        this.clave = "";
        this.cargo = Cargo.TITULAR;

    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Este metodo devuelve el apellido del profesor
     *
     * @return apellido del profesor
     */
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void mostrar() {
        System.out.println("DNI: " + this.dni + ",Apellidos: " + this.apellidos + ",Nombres: " + this.nombres + ", Cargo: " + this.cargo);
    }

    public String getApellidoNombre() {
        return this.apellidos + ", " + this.nombres;
    }
}
