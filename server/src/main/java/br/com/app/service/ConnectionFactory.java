package br.com.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public ConnectionFactory(){};
    public Connection Connect() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://sql572.main-hosting.eu/u921222444_cmszada", "u921222444_adm", "CMSadmmd123");
        return con;
    }
}
