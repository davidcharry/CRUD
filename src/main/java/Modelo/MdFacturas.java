/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Facturas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdFacturas {

    dbData dbData;
    Facturas Facturas;

    public MdFacturas() {
        this.dbData = new dbData();  
    }

    public boolean crearFacturas(Facturas f) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_facturas(fechaFactura, valorFactura, descuentoFactura, totalFactura) VALUES (?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, f.getFechaFactura());
            statement.setDouble(2, f.getValorFactura());
            statement.setDouble(3, f.getDescuentoFactura());
            statement.setDouble(4, f.getTotalFactura());
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

    public boolean actualizarFacturas(Facturas f) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_facturas SET fechaFactura = ?, valorFactura = ?, descuentoFactura = ?, totalFactura = ? where idFactura = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, f.getFechaFactura());
            statement.setDouble(2, f.getValorFactura());
            statement.setDouble(3, f.getDescuentoFactura());
            statement.setDouble(4, f.getTotalFactura());          
            statement.setInt(5, f.getId());
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

    public boolean borrarFacturas(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_facturas where idFactura = " + ID;
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

    public DefaultTableModel buscarFacturas(String idFactura) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Fecha", "Valor", "Descuento", "Total"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idFactura.isEmpty()) {
                query = "select * from tb_facturas";
            } else {
                query = "select * from tb_facturas where idFactura = " + idFactura;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idFactura"),result.getString("fechaFactura"),result.getDouble("valorFactura"),result.getDouble("descuentoFactura"),result.getDouble("totalFactura")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
