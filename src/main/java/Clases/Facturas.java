/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Facturas {
    private int id;
    private String fechaFactura;
    private double valorFactura;
    private double descuentoFactura;
    private double totalFactura;

    public Facturas(String fechaFactura, double valorFactura, double descuentoFactura, double totalFactura) {
        this.fechaFactura = fechaFactura;
        this.valorFactura = valorFactura;
        this.descuentoFactura = descuentoFactura;
        this.totalFactura = totalFactura;
    }

    public Facturas(int id, String fechaFactura, double valorFactura, double descuentoFactura, double totalFactura) {
        this.id = id;
        this.fechaFactura = fechaFactura;
        this.valorFactura = valorFactura;
        this.descuentoFactura = descuentoFactura;
        this.totalFactura = totalFactura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public double getDescuentoFactura() {
        return descuentoFactura;
    }

    public void setDescuentoFactura(double descuentoFactura) {
        this.descuentoFactura = descuentoFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }
    
    
}
