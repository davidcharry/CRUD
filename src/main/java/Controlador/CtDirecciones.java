/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Direcciones;
import Modelo.MdDirecciones;
import javax.swing.table.DefaultTableModel;

public class CtDirecciones {

    private MdDirecciones MdDirecciones;

    public CtDirecciones() {
        this.MdDirecciones = new MdDirecciones();
    }

    public boolean crearDirecciones(Direcciones d) {
        try {
            this.MdDirecciones.crearDirecciones(d);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean actualizarDirecciones(Direcciones d) {
        try {
            this.MdDirecciones.actualizarDirecciones(d);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public DefaultTableModel buscarDirecciones(String idDireccion) {
        return MdDirecciones.buscarDirecciones(idDireccion);
    }
    
    public boolean borrarDirecciones(String idDireccion) {
        return MdDirecciones.borrarDirecciones(idDireccion);
    }
}
