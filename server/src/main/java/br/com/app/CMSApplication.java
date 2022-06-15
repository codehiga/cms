package br.com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(CMSApplication.class, args);
    }

    @GetMapping("/")
    public String ApiOn(){
        return "API Online!";
    }

}
