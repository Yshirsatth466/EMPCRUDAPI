package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import  com.example.demo.Expception.ResourcenotfoundException;

@RestController
@RequestMapping("/api/emp/data")
public class EmployeeController {
    @Autowired
    private EmployeeRepository emprepository;
    
    // Build display employee API
    @GetMapping
    public List<Employee> getAllEmp() {
        List<Employee> employees = emprepository.findAll();
      
        
        return employees;
    }
    
    // Build create employee API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return emprepository.save(employee);
    }
    
    
    
  
   // get employee by id
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = emprepository.findById(id)
                .orElseThrow(() -> new ResourcenotfoundException("Employee does not exist with id: " + id));
        return ResponseEntity.ok(employee);
    }
    
    @DeleteMapping("/delete")
    public void deleteAllEmployees() {
        emprepository.deleteAll();
      System.out.println("delete all emp");
    }

}

 