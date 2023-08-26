package edu.vikalp.fifthapp.service.impl;

import edu.vikalp.fifthapp.model.Employee;
import edu.vikalp.fifthapp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee(1, "vikalp","noida"), new Employee(2, "sonkar","bangalore")));
    @Override
    public String save(Employee employee) {
       if (employee!=null){
           employeeList.add(employee);
       }
        System.out.println(employee);
        return "Success";
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public Employee updateEmployee(int eid, String name) {
        Employee employee=employeeList.stream()
                                      .filter( e->e.getEid()==eid)
                                      .collect(Collectors.toList()).get(0);

        employee.setName("vikalp sonkar");
        return  employee;
    }

    @Override
    public List<Employee> deleteEmployee(int eid) {
        employeeList=employeeList.stream().filter(e->e.getEid()!=eid).collect(Collectors.toList());
        return employeeList;
    }
}
