package com.EmployeeAss1.HibernateAssingment1.Service;

import com.EmployeeAss1.HibernateAssingment1.EntitiesEmployee.Employee;
import com.EmployeeAss1.HibernateAssingment1.RepositoryEmployee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceimpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByID(int empID) {
        return null;
    }

    //	(3) Perform Create Operation on Entity using Spring Data JPA
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee details added to Database.";
    }

    //  (4) Perform Update Operation on Entity using Spring Data JPA
//    public String updateEmployee(int empID, Employee employee) {
//        Employee emp = getEmployeeByID(empID);
//        emp.setName(employee.getName());
//        emp.setAge(employee.getAge());
//        emp.setLocation(employee.getLocation());
//        employeeRepository.save(emp);
//        return "Employee details updated in employee table in the Database.";
//    }


    }


