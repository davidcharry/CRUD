/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdProducto {

    dbData dbData;
    Producto Producto;

    public MdProducto() {
        this.dbData = new dbData();
    }

    public boolean crearProducto(Producto p) {
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_productos(nombreProducto, precioProducto, existencia, Proveedores_idProveedor) VALUES (?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNombreProducto());
            statement.setDouble(2, p.getPrecioProducto());
            statement.setInt(3, p.getExistencia());
            statement.setInt(4, p.getProveedores_idProveedores());
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

    public boolean actualizarProducto(Producto p) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_productos SET nombreProducto = ?, precioProducto = ?, existencia = ?, Proveedores_idProveedor = ? where idProducto = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNombreProducto());
            statement.setDouble(2, p.getPrecioProducto());
            statement.setInt(3, p.getExistencia());
            statement.setInt(4, p.getProveedores_idProveedores());            
            statement.setInt(5, p.getId());
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

    public boolean borrarProducto(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_productos where idProducto = " + ID;
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

    public DefaultTableModel buscarProducto(String idProducto) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Nombre", "Precio", "Existencia", "ID Proveedor"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idProducto.isEmpty()) {
                query = "select * from tb_productos";
            } else {
                query = "select * from tb_productos where idProducto  = " + idProducto;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idProducto"),result.getString("nombreProducto"),result.getDouble("precioProducto"),result.getInt("existencia"),result.getInt("Proveedores_idProveedor")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
