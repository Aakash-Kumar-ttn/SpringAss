package h2springBoot.H2SpringBootAssginemt.Controller;

import h2springBoot.H2SpringBootAssginemt.Entities.Employee;
import h2springBoot.H2SpringBootAssginemt.Repository.EmployeeRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee saveEmp = employeeRepository.save(employee);
        return new ResponseEntity<>(saveEmp , HttpStatus.OK) ;
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployee(){
       List<Employee> getlist = new ArrayList<>();
              getlist=  employeeRepository.findAll();
        return new ResponseEntity<>(getlist , HttpStatus.OK) ;
    }

}
