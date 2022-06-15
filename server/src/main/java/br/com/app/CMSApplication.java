package br.com.app;


import br.com.app.DAO.CreateTaskDAO;
import br.com.app.service.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@SpringBootApplication
@RestController
public class CMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(CMSApplication.class, args);
    }

    @GetMapping("/")
    public void ApiOn() throws SQLException {

        CreateTaskDAO createTaskDAO = new CreateTaskDAO();

        createTaskDAO.createTaskOnDb();
    }

}
