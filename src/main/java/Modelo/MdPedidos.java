/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import Clases.Pedidos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdPedidos {

    dbData dbData;
    Pedidos Pedidos;

    public MdPedidos() {
        this.dbData = new dbData();
    }

    public boolean crearPedidos(Pedidos p) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_pedidos(fechaPedido, Productos_idProducto, Clientes_idCliente) VALUES (?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getFechaPedido());
            statement.setInt(2, p.getProductos_idProducto());
            statement.setInt(3, p.getClientes_idCliente());
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

    public boolean actualizarPedidos(Pedidos p) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_pedidos SET fechaPedido = ?, Productos_idProducto = ?, Clientes_idCliente = ? where idPedido = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getFechaPedido());
            statement.setInt(2, p.getProductos_idProducto());
            statement.setInt(3, p.getClientes_idCliente());        
            statement.setInt(4, p.getId());
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

    public boolean borrarPedidos(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_pedidos where idPedido = " + ID;
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

    public DefaultTableModel buscarPedidos(String idPedido) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Fecha", "ID Producto", "ID Cliente"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idPedido.isEmpty()) {
                query = "select * from tb_pedidos";
            } else {
                query = "select * from tb_pedidos where idPedido = " + idPedido;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idPedido"),result.getString("fechaPedido"),result.getInt("Productos_idProducto"),result.getInt("Clientes_idCliente")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
