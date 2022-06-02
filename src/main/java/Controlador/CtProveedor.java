/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Proveedor;
import Modelo.MdProveedor;
import javax.swing.table.DefaultTableModel;

public class CtProveedor {

    private MdProveedor MdProveedor;

    public CtProveedor() {
        this.MdProveedor = new MdProveedor();
    }

    public boolean crearProveedor(Proveedor p) {
        try {
            this.MdProveedor.crearProveedor(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarProveedor(Proveedor p) {
        try {
            this.MdProveedor.actualizarProveedor(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarProveedor(String idProveedor) {
        return MdProveedor.buscarProducto(idProveedor);
    }
    
    public boolean borrarProveedor(String id) {
        return MdProveedor.borrarProveedor(id);
    }
}
