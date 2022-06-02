/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.FactCliente;
import Modelo.MdFacturasClientes;
import javax.swing.table.DefaultTableModel;

public class CtFacturasClientes {

    private MdFacturasClientes MdFacturasClientes;

    public CtFacturasClientes() {
        this.MdFacturasClientes = new MdFacturasClientes();
    }

    public boolean crearFacturasClientes(FactCliente fc) {
        try {
            this.MdFacturasClientes.crearFacturasClientes(fc);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarFacturasClientes(FactCliente fc) {
        try {
            this.MdFacturasClientes.actualizarFacturasClientes(fc);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarFacturasClientes(String idFacturasClientes) {
        return MdFacturasClientes.buscarFactCliente(idFacturasClientes);
    }
    
    public boolean borrarFacturasClientes(String idFacturasClientes) {
        return MdFacturasClientes.borrarFacturasClientes(idFacturasClientes);
    }
}
