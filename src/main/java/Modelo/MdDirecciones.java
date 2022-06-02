/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Direcciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MdDirecciones {

    dbData dbData;
    Direcciones Direcciones;

    public MdDirecciones() {
        this.dbData = new dbData();  
    }

    public boolean crearDirecciones(Direcciones d) {
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO tb_direcciones(calleCarreraDireccion, numeroDireccion, barrio, ciudad) VALUES (?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, d.getCalleCarrera());
            statement.setString(2, d.getNumeroDireccion());
            statement.setString(3, d.getBarrio());
            statement.setString(4, d.getCiudad());
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

    public boolean actualizarDirecciones(Direcciones d) {
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE tb_direcciones SET calleCarreraDireccion = ?, numeroDireccion = ?, barrio = ?, ciudad = ? where idDireccion = ?;";
            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, d.getCalleCarrera());
            statement.setString(2, d.getNumeroDireccion());
            statement.setString(3, d.getBarrio());
            statement.setString(4, d.getCiudad());      
            statement.setInt(5, d.getId());
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

    public boolean borrarDirecciones(String ID) {
        if ("".equals(ID)){
            return false;
        }
        try ( Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            if (!ID.isEmpty()) {
                String query = "delete from tb_direcciones where idDireccion = " + ID;
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

    public DefaultTableModel buscarDirecciones(String idDireccion) {
        try {
            String query;
            Statement ejecutor = null;
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Calle/Carrera", "Numero", "Barri", "Ciudad"});
            ResultSet result;
            Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword());
            ejecutor = con.createStatement();
            ejecutor.setQueryTimeout(5);
            if (idDireccion.isEmpty()) {
                query = "select * from tb_direcciones";
            } else {
                query = "select * from tb_direcciones where idDireccion = " + idDireccion;
            }
            result = ejecutor.executeQuery(query);
            while (result.next()) {
                model.addRow(new Object[]{result.getInt("idDireccion"),result.getString("calleCarreraDireccion"),result.getString("numeroDireccion"),result.getString("barrio"),result.getString("ciudad")});
            }
            return model;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
