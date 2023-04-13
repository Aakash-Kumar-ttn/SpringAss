package com.EmployeeAss1.HibernateAssingment1.Service;

import com.EmployeeAss1.HibernateAssingment1.EntitiesEmployee.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {



    public Employee getEmployeeByID(int empID);


}
