/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Producto {

    private int id;
    private String nombreProducto;
    private double precioProducto;
    private int existencia;
    private int Proveedores_idProveedores;

    public Producto(String nombreProducto, double precioProducto, int existencia, int Proveedores_idProveedores) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.existencia = existencia;
        this.Proveedores_idProveedores = Proveedores_idProveedores;
    }

    public Producto(int ID, String nombreProducto, double precioProducto, int existencia, int Proveedores_idProveedores) {
        this.id = ID;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.existencia = existencia;
        this.Proveedores_idProveedores = Proveedores_idProveedores;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getProveedores_idProveedores() {
        return Proveedores_idProveedores;
    }

    public void setProveedores_idProveedores(int Proveedores_idProveedores) {
        this.Proveedores_idProveedores = Proveedores_idProveedores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
