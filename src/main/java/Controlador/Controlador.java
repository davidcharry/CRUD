/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FacturasClientes;
import Vista.Principal;
import Vista.ProductosFacturas;
import Vista.VistaClientes;
import Vista.VistaDirecciones;
import Vista.VistaFacturas;
import Vista.VistaPedidos;
import Vista.VistaProducto;
import Vista.VistaProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Principal objPpri;
    FacturasClientes objFacCli;
    ProductosFacturas objProFac;
    VistaClientes objCli;
    VistaDirecciones objDir;
    VistaFacturas objFac;
    VistaPedidos objPed;
    VistaProducto objProd;
    VistaProveedor objProv;

    public Controlador() {
        objPpri = new Principal();
        objFacCli = new FacturasClientes();
        objProFac = new ProductosFacturas();
        objCli = new VistaClientes();
        objDir = new VistaDirecciones(); 
        objFac = new VistaFacturas();
        objPed = new VistaPedidos(); 
        objProd = new VistaProducto();
        objProv = new VistaProveedor();
        
        objCli.getCerrar().addActionListener(this);
        objFacCli.getCerrar().addActionListener(this);
        objProFac.getCerrar().addActionListener(this);
        objDir.getCerrar().addActionListener(this);
        objFac.getCerrar().addActionListener(this);
        objPed.getCerrar().addActionListener(this);
        objProd.getCerrar().addActionListener(this);
        objProv.getCerrar().addActionListener(this);
        objPpri.getClientes().addActionListener(this);
        objPpri.getPedidos().addActionListener(this);
        objPpri.getProdFactura().addActionListener(this);
        objPpri.getProductos().addActionListener(this);
        objPpri.getProveedores().addActionListener(this);
        objPpri.getFactCliente().addActionListener(this);
        objPpri.getFacturas().addActionListener(this);
        objPpri.getDirecciones().addActionListener(this);
                        
    }
    
    public void Iniciar(){
        objPpri.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objPpri.getClientes()){
            objCli.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getFactCliente()){
            objFacCli.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getProdFactura()){
            objProFac.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getDirecciones()){
            objDir.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getFacturas()){
            objFac.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getPedidos()){
            objPed.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getProductos()){
            objProd.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objPpri.getProveedores()){
            objProv.setVisible(true);
            objPpri.setVisible(false);
        }
        
        if (e.getSource() == objCli.getCerrar()){
            objCli.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objFacCli.getCerrar()){
            objFacCli.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objProFac.getCerrar()){
            objProFac.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objDir.getCerrar()){
            objDir.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objFac.getCerrar()){
            objFac.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objPed.getCerrar()){
            objPed.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objProd.getCerrar()){
            objProd.setVisible(false);
            objPpri.setVisible(true);
        }
        
        if (e.getSource() ==  objProv.getCerrar()){
            objProv.setVisible(false);
            objPpri.setVisible(true);
        }
        
    }

}
