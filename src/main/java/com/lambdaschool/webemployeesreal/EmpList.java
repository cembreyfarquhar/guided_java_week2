package com.lambdaschool.webemployeesreal;

import java.util.ArrayList;

public class EmpList {
    public ArrayList<Employee> empList = new ArrayList<>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 46000, true, 1, 1));
        empList.add(new Employee("Jerry", "West", 77000, true, 1, 1));
        empList.add(new Employee("LeBron", "James", 95000, true, 1, 1));
    }

    public Employee findEmployee(CheckEmployee tester) {
        for (Employee e: empList) {
            if (tester.test(e)) {
                return e;
            }
        }

        return null;
    }

    public ArrayList<Employee> findEmployees(CheckEmployee tester) {
        ArrayList<Employee> tempEmpList = new ArrayList<>();

        for (Employee e: empList) {
            if (tester.test(e)) {
                tempEmpList.add(e);
            }
        }

        return tempEmpList;
    }
}
















