/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Facturas;
import Modelo.MdFacturas;
import javax.swing.table.DefaultTableModel;

public class CtFacturas {

    private MdFacturas MdFacturas;

    public CtFacturas() {
        this.MdFacturas = new MdFacturas();
    }

    public boolean crearFacturas(Facturas f) {
        try {
            this.MdFacturas.crearFacturas(f);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarFacturas(Facturas f) {
        try {
            this.MdFacturas.actualizarFacturas(f);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarFacturas(String idFactura) {
        return MdFacturas.buscarFacturas(idFactura);
    }
    
    public boolean borrarFacturas(String idFactura) {
        return MdFacturas.borrarFacturas(idFactura);
    }
}
