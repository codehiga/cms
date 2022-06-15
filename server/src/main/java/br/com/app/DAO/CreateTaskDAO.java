package br.com.app.DAO;

import br.com.app.service.ConnectionFactory;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateTaskDAO {

    ConnectionFactory connectionFactory = new ConnectionFactory();

    public CreateTaskDAO(){};

    public void createTaskOnDb() throws SQLException {

        Connection con = connectionFactory.Connect();
        String sql = "create table teste (id Integer, nome varchar(50));";

        PreparedStatement preparedStmt = con.prepareStatement(sql);
        preparedStmt.execute();

        con.close();
    }

}