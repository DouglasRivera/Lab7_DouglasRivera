/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglas;

import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARLES MACIAS
 */
public class Compilador implements Serializable{
    private String Nombre;
    private String NameCreador;
    private int LineasCodigo;
    private int Alexico;
    private int Asintactico;
    private int Asemantico;
    private int CodigoInter;
    private int OCodigo;
    private int GCodigo;
    private DefaultTableModel Errores;
    private DefaultTableModel Simbolos;
    
    private static final long SerialVersionUID=555L;

    public Compilador() {
    }

    public Compilador(String Nombre, String NameCreador, int LineasCodigo, int Alexico, int Asintactico, int Asemantico, int CodigoInter, int OCodigo, int GCodigo, DefaultTableModel Errores, DefaultTableModel Simbolos) {
        this.Nombre = Nombre;
        this.NameCreador = NameCreador;
        this.LineasCodigo = LineasCodigo;
        this.Alexico = Alexico;
        this.Asintactico = Asintactico;
        this.Asemantico = Asemantico;
        this.CodigoInter = CodigoInter;
        this.OCodigo = OCodigo;
        this.GCodigo = GCodigo;
        this.Errores = Errores;
        this.Simbolos = Simbolos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNameCreador() {
        return NameCreador;
    }

    public void setNameCreador(String NameCreador) {
        this.NameCreador = NameCreador;
    }

    public int getLineasCodigo() {
        return LineasCodigo;
    }

    public void setLineasCodigo(int LineasCodigo) {
        this.LineasCodigo = LineasCodigo;
    }

    public int getAlexico() {
        return Alexico;
    }

    public void setAlexico(int Alexico) {
        this.Alexico = Alexico;
    }

    public int getAsintactico() {
        return Asintactico;
    }

    public void setAsintactico(int Asintactico) {
        this.Asintactico = Asintactico;
    }

    public int getAsemantico() {
        return Asemantico;
    }

    public void setAsemantico(int Asemantico) {
        this.Asemantico = Asemantico;
    }

    public int getCodigoInter() {
        return CodigoInter;
    }

    public void setCodigoInter(int CodigoInter) {
        this.CodigoInter = CodigoInter;
    }

    public int getOCodigo() {
        return OCodigo;
    }

    public void setOCodigo(int OCodigo) {
        this.OCodigo = OCodigo;
    }

    public int getGCodigo() {
        return GCodigo;
    }

    public void setGCodigo(int GCodigo) {
        this.GCodigo = GCodigo;
    }

    public DefaultTableModel getErrores() {
        return Errores;
    }

    public void setErrores(DefaultTableModel Errores) {
        this.Errores = Errores;
    }

    public DefaultTableModel getSimbolos() {
        return Simbolos;
    }

    public void setSimbolos(DefaultTableModel Simbolos) {
        this.Simbolos = Simbolos;
    }
    
}
