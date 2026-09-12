package br.com.sistema.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prof.Darlon Franklin
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:3307/bdvendas", "postgres", "vssql");
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
