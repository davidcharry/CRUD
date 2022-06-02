/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Direcciones {
    private int id;
    private String calleCarrera;
    private String numeroDireccion;
    private String barrio;
    private String Ciudad;

    public Direcciones(String calleCarrera, String numeroDireccion, String barrio, String Ciudad) {
        this.calleCarrera = calleCarrera;
        this.numeroDireccion = numeroDireccion;
        this.barrio = barrio;
        this.Ciudad = Ciudad;
    }

    public Direcciones(int id, String calleCarrera, String numeroDireccion, String barrio, String Ciudad) {
        this.id = id;
        this.calleCarrera = calleCarrera;
        this.numeroDireccion = numeroDireccion;
        this.barrio = barrio;
        this.Ciudad = Ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalleCarrera() {
        return calleCarrera;
    }

    public void setCalleCarrera(String calleCarrera) {
        this.calleCarrera = calleCarrera;
    }
    
    public String getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(String numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

}
