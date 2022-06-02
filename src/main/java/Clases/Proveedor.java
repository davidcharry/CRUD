/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Proveedor {

    private int id;
    private String numeroNit;
    private String razonSocial;
    private String telefono;
    private String correoElectronico;
    private String representanteLegal;
    private String sitioWeb;
    private int Direcciones_idDireccion;

    public Proveedor(String numeroNit, String razonSocial, String telefono, String correoElectronico, String representanteLegal, String sitioWeb, int Direcciones_idDireccion) {
        this.numeroNit = numeroNit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.representanteLegal = representanteLegal;
        this.sitioWeb = sitioWeb;
        this.Direcciones_idDireccion = Direcciones_idDireccion;
    }

    public Proveedor(int id, String numeroNit, String razonSocial, String telefono, String correoElectronico, String representanteLegal, String sitioWeb, int Direcciones_idDireccion) {
        this.id = id;
        this.numeroNit = numeroNit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.representanteLegal = representanteLegal;
        this.sitioWeb = sitioWeb;
        this.Direcciones_idDireccion = Direcciones_idDireccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroNit() {
        return numeroNit;
    }

    public void setNumeroNit(String numeroNit) {
        this.numeroNit = numeroNit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public int getDirecciones_idDireccion() {
        return Direcciones_idDireccion;
    }

    public void setDirecciones_idDireccion(int Direcciones_idDireccion) {
        this.Direcciones_idDireccion = Direcciones_idDireccion;
    }

}
