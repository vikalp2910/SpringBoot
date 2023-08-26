package edu.vikalp.fifthapp.service;

import edu.vikalp.fifthapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    public String save(Employee employee);

    public List<Employee> getEmployees();

    public Employee updateEmployee(int eid,String name);

    public List<Employee> deleteEmployee(int eid);
}
