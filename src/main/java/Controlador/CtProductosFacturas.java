/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.ProdFact;
import Modelo.MdProductosFacturas;
import javax.swing.table.DefaultTableModel;

public class CtProductosFacturas {

    private MdProductosFacturas MdProductosFacturas;

    public CtProductosFacturas() {
        this.MdProductosFacturas = new MdProductosFacturas();
    }

    public boolean crearProductosFacturas(ProdFact pf) {
        try {
            this.MdProductosFacturas.crearProductosFacturas(pf);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarProductosFacturas(ProdFact pf) {
        try {
            this.MdProductosFacturas.actualizarProductosFacturas(pf);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarProductosFacturas(String idProductosFacturas) {
        return MdProductosFacturas.buscarProductosFacturas(idProductosFacturas);
    }
    
    public boolean borrarProductosFacturas(String idProductosFacturas) {
        return MdProductosFacturas.borrarProductosFacturas(idProductosFacturas);
    }
}
