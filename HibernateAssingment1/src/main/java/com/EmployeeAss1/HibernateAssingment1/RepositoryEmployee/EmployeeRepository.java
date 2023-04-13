package com.EmployeeAss1.HibernateAssingment1.RepositoryEmployee;

import com.EmployeeAss1.HibernateAssingment1.EntitiesEmployee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//(2) Set up EmployeeRepository with Spring Data JPA
public interface EmployeeRepository extends JpaRepository<Employee,Integer> , PagingAndSortingRepository<Employee,Integer> {


    List<Employee>findByName(String name);
    List<Employee> findByNameStartingWith(String letter);
    List<Employee>findByNameLike(String name) ;
    List<Employee>findByAgeBetween(int starting , int ending) ;

}
