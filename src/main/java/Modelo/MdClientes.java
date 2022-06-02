/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdClientes {

    dbData dbData;
    Clientes Clientes;

    public MdClientes() {
        this.dbData = new dbData();
    }

    public boolean crearClientes(Clientes c) {
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_clientes(documentoCliente, nombreCliente, apellidoCliente, direccionCliente, "
                    + "correoCliente, telefonoCliente) VALUES (?,?,?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, c.getDocumentoCliente());
            statement.setString(2, c.getNombreCliente());
            statement.setString(3, c.getApellidoCliente());
            statement.setString(4, c.getDireccionCliente());
            statement.setString(5, c.getCorreoCliente());
            statement.setString(6, c.getTelefonoCliente());
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

    public boolean actualizarClientes(Clientes c) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_clientes SET documentoCliente = ?, nombreCliente = ?, apellidoCliente = ?, direccionCliente = ?, correoCliente = ?, telefonoCliente = ? where idCliente = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, c.getDocumentoCliente());
            statement.setString(2, c.getNombreCliente());
            statement.setString(3, c.getApellidoCliente());
            statement.setString(4, c.getDireccionCliente());
            statement.setString(5, c.getCorreoCliente());
            statement.setString(6, c.getTelefonoCliente());           
            statement.setInt(7, c.getId());
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

    public boolean borrarClientes(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_clientes where idCliente = " + ID;
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

    public DefaultTableModel buscarClientes(String idCliente) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Numero ID", "Nombre", "Apellido", "Dirección", "Correo", "Telefono"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idCliente.isEmpty()) {
                query = "select * from tb_clientes";
            } else {
                query = "select * from tb_clientes where idCliente = " + idCliente;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idCliente"),result.getString("documentoCliente"),result.getString("nombreCliente"),result.getString("apellidoCliente"),result.getString("direccionCliente"),result.getString("correoCliente"),result.getString("telefonoCliente")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
