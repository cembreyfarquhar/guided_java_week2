package com.lambdaschool.webemployeesreal;

import java.util.ArrayList;

public class EmpList {
    public ArrayList<Employee> empList = new ArrayList<>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 46000, true, 1, 1));
        empList.add(new Employee("Jerry", "West", 77000, true, 1, 1));
        empList.add(new Employee("LeBron", "James", 95000, true, 1, 1));
    }
}
