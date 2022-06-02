/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import Clases.FactCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdFacturasClientes {

    dbData dbData;
    FactCliente FacturasClientes;

    public MdFacturasClientes() {
        this.dbData = new dbData();  
    }

    public boolean crearFacturasClientes(FactCliente fc) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_facturas_clientes(Clientes_idCliente, Facturas_idFactura) VALUES (?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, fc.getIDCliente());
            statement.setDouble(2, fc.getIDFactura());
            int rowsInserter = statement.executeUpdate();
            if (rowsInserter > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizarFacturasClientes(FactCliente fc) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_facturas_clientes SET Clientes_idCliente = ? where Facturas_idFactura = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, fc.getIDCliente());
            statement.setDouble(2, fc.getIDFactura());
            int rowsInserter = statement.executeUpdate();
            if (rowsInserter > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarFacturasClientes(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_facturas_clientes where Clientes_idCliente = " + ID;
                PreparedStatement statement = con.prepareStatement(query);
                int rowsUpdate = statement.executeUpdate();
                if (rowsUpdate > 0) {
                    return true;
                }
                return true;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public DefaultTableModel buscarFactCliente(String ID) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnCount(1);
            model.setColumnIdentifiers(new Object[]{"ID Cliente", "ID Factura"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (ID.isEmpty()) {
                query = "select * from tb_facturas_clientes";
            } else {
                query = "select * from tb_facturas_clientes where Clientes_idCliente = " + ID;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("Clientes_idCliente"),result.getInt("Facturas_idFactura")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
