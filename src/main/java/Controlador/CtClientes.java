/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Clientes;
import Modelo.MdClientes;
import javax.swing.table.DefaultTableModel;

public class CtClientes {

    private MdClientes MdClientes;

    public CtClientes() {
        this.MdClientes = new MdClientes();
    }

    public boolean crearClientes(Clientes c) {
        try {
            this.MdClientes.crearClientes(c);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarClientes(Clientes c) {
        try {
            this.MdClientes.actualizarClientes(c);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public DefaultTableModel buscarClientes(String idCliente) {
        return MdClientes.buscarClientes(idCliente);
    }
    
    public boolean borrarClientes(String idCliente) {
        return MdClientes.borrarClientes(idCliente);
    }
}
