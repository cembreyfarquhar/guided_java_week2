package com.lambdaschool.webemployeesreal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebemployeesrealApplication {

    static EmpList ourEmpList;
    public static void main(String[] args) {
        ourEmpList = new EmpList();
        SpringApplication.run(WebemployeesrealApplication.class, args);
    }


}
