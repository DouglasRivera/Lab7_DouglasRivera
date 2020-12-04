/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglas;

import java.io.Serializable;

/**
 *
 * @author ARLES MACIAS
 */
public class Usuario implements Serializable {
    String Nombre;
    String Apellido;
    String Usuario;
    String Contraseña;
    int Notafinal;
    private static final long SerialVersionUID=444L;

    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, String Usuario, String Contraseña, int Notafinal) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Notafinal = Notafinal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getNotafinal() {
        return Notafinal;
    }

    public void setNotafinal(int Notafinal) {
        this.Notafinal = Notafinal;
    }
    
}
