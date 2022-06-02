/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Producto;
import Modelo.MdProducto;
import javax.swing.table.DefaultTableModel;

public class CtProducto {

    private MdProducto MdProducto;

    public CtProducto() {
        this.MdProducto = new MdProducto();
    }

    public boolean crearProducto(Producto p) {
        try {
            this.MdProducto.crearProducto(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarProducto(Producto p) {
        try {
            this.MdProducto.actualizarProducto(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public DefaultTableModel buscarProducto(String idProducto) {
        return MdProducto.buscarProducto(idProducto);
    }
    
    public boolean borrarProducto(String idProducto) {
        return MdProducto.borrarProducto(idProducto);
    }
}
