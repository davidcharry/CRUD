/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Pedidos;
import Modelo.MdPedidos;
import javax.swing.table.DefaultTableModel;

public class CtPedidos {

    private MdPedidos MdPedidos;

    public CtPedidos() {
        this.MdPedidos = new MdPedidos();
    }

    public boolean crearPedidos(Pedidos p) {
        try {
            this.MdPedidos.crearPedidos(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarPedidos(Pedidos p) {
        try {
            this.MdPedidos.actualizarPedidos(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarPedidos(String idPedidos) {
        return MdPedidos.buscarPedidos(idPedidos);
    }
    
    public boolean borrarPedidos(String idPedidos) {
        return MdPedidos.borrarPedidos(idPedidos);
    }
}
