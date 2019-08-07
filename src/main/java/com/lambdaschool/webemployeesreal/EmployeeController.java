package com.lambdaschool.webemployeesreal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Managed by Spring Boot
@RequestMapping("/data") // all endpoints start with /data/
public class EmployeeController {
    @GetMapping(value = "/allemployees")
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<>(WebemployeesrealApplication.ourEmpList.empList, HttpStatus.OK);
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<?> getEmpDetail(@PathVariable long id) {
        Employee rtnEmployee = WebemployeesrealApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmployee, HttpStatus.OK);
    }
}

