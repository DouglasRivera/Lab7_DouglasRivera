/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglas;

/**
 *
 * @author ARLES MACIAS
 */
public class Error {
   private int Codigo;
   private String Descripcion;

    public Error() {
    }

    public Error(int Codigo, String Descripcion) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
