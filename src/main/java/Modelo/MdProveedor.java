/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Proveedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdProveedor {

    dbData dbData;
    Proveedor Proveedor;

    public MdProveedor() {
        this.dbData = new dbData();
    }

    public boolean crearProveedor(Proveedor p) {
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_proveedores(numeroNit, razonSocial, telefonoProveedor, correoElectronicoProveedor, representanteLegalProveedor, "
                    + "sitioWebProveedor, Direcciones_idDireccion) VALUES(?,?,?,?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNumeroNit());
            statement.setString(2, p.getRazonSocial());
            statement.setString(3, p.getTelefono());
            statement.setString(4, p.getCorreoElectronico());
            statement.setString(5, p.getRepresentanteLegal());
            statement.setString(6, p.getSitioWeb());
            statement.setInt(7, p.getDirecciones_idDireccion());
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

    public boolean actualizarProveedor(Proveedor p) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_proveedores SET numeroNit = ?, razonSocial = ?, telefonoProveedor = ?, correoElectronicoProveedor = ?, "
                    + "representanteLegalProveedor = ?, sitioWebProveedor = ?, Direcciones_idDireccion = ?  where idProveedor = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNumeroNit());
            statement.setString(2, p.getRazonSocial());
            statement.setString(3, p.getTelefono());
            statement.setString(4, p.getCorreoElectronico());
            statement.setString(5, p.getRepresentanteLegal());
            statement.setString(6, p.getSitioWeb());
            statement.setInt(7, p.getDirecciones_idDireccion());     
            statement.setInt(8, p.getId());
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

    public boolean borrarProveedor(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_proveedores where idProveedor = " + ID;
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

    public DefaultTableModel buscarProducto(String idProveedor) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","NIT", "Razon Social", "Telefono", "Correo", "Representante", "Sitio Web", "ID Dirección"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idProveedor.isEmpty()) {
                query = "select * from tb_proveedores";
            } else {
                query = "select * from tb_proveedores where idProveedor  = " + idProveedor;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idProveedor"),result.getString("numeroNit"), result.getString("razonSocial"), result.getString("telefonoProveedor"), result.getString("correoElectronicoProveedor"), result.getString("representanteLegalProveedor"), result.getString("sitioWebProveedor"), result.getInt("Direcciones_idDireccion")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
