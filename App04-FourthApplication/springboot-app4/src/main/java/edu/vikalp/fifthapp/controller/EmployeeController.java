package edu.vikalp.fifthapp.controller;

import edu.vikalp.fifthapp.model.Employee;
import edu.vikalp.fifthapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/hello")
    public String firstCall(){
        return "hello world";
    }

    @PostMapping(path = "/save-data")
    public String saveData(@RequestBody Employee employee){
        return employeeService.save(employee);

    }

    @GetMapping(value = "/fetch-data")
    public List<Employee> fetchData(){
        return employeeService.getEmployees();
    }

    @PutMapping(path = "/update-data/{id}")
    public Employee updateData(@PathVariable(value = "id") int eid,String name){
        return employeeService.updateEmployee(eid,name);
    }

    @DeleteMapping("/delete-data/{id}")
    public List<Employee> deleteData(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

}
