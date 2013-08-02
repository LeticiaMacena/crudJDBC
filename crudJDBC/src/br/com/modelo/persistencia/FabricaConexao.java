/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leticia_macena
 */
public class FabricaConexao {

    public static Connection getConnection()throws SQLException {
        try {
            Class.forName("Com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/revenda","root", " ");
        }catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
}
    }
