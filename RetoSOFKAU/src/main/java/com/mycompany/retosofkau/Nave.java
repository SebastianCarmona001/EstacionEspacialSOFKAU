/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retosofkau;

/**
 *
 * @author PERSONAL
 */
public class Nave {
    //SE ESCOGEN LAS VARIABLES Y SE LES ASIGNAN LOS GETs Y SETs
    private String Nombre;
    private String Tipo_nave;
    private String Tipo_combustible;
    private String Region;
    private double Potencia;
    private double Empuje;
    private double Velocidad;
    private double Peso;
    private String Destino;
    private String Tipo_mision;
    private int Capacidad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Name) {
        this.Nombre = Name;
    }

    public String getTipo_nave() {
        return Tipo_nave;
    }

    public void setTipo_nave(String Tipo_nave) {
        this.Tipo_nave = Tipo_nave;
    }

    public String getTipo_combustible() {
        return Tipo_combustible;
    }

    public void setTipo_combustible(String Tipo_combustible) {
        this.Tipo_combustible = Tipo_combustible;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double Potencia) {
        this.Potencia = Potencia;
    }
    
    public double getEmpuje() {
        return Empuje;
    }

    public void setEmpuje(double Empuje) {
        this.Empuje = Empuje;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getTipo_mision() {
        return Tipo_mision;
    }

    public void setTipo_mision(String Tipo_mision) {
        this.Tipo_mision = Tipo_mision;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

        
}
