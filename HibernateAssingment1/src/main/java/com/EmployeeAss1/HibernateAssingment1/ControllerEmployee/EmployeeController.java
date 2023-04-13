package com.EmployeeAss1.HibernateAssingment1.ControllerEmployee;
import com.EmployeeAss1.HibernateAssingment1.EntitiesEmployee.Employee;
import com.EmployeeAss1.HibernateAssingment1.RepositoryEmployee.EmployeeRepository;
import com.EmployeeAss1.HibernateAssingment1.Service.EmployeeService;
import com.EmployeeAss1.HibernateAssingment1.Service.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public void createEmployee(@RequestBody Employee employee){
       // employeeService.addEmployee(employee);
        employeeRepository.save(employee);
    }

    @GetMapping("/employee")
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employee/{id}")
    public void DeleteData(@PathVariable int id){
        employeeRepository.deleteById(id);
    }
}
