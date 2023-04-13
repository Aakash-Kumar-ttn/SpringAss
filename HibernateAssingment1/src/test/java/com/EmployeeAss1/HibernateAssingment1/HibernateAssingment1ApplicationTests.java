package com.EmployeeAss1.HibernateAssingment1;

import com.EmployeeAss1.HibernateAssingment1.EntitiesEmployee.Employee;
import com.EmployeeAss1.HibernateAssingment1.RepositoryEmployee.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;




@SpringBootTest
class HibernateAssingment1ApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	//(3) Perform Create Operation on Entity using Spring Data JPA
	@Test
	void testCreateData() {
		Employee employee = new Employee();
		employee.setName("Himanshu");
		employee.setAge(23);
		employee.setLocation("Bihar");
        employeeRepository.save(employee);
	}
	//(4) Perform Update Operation on Entity using Spring Data JPA
	@Test
	void UpdateData() {
		Employee emp = employeeRepository.findById(2).get() ;

		emp.setName("Inderpreet");
		emp.setAge(26);
		emp.setLocation("Noida");
		employeeRepository.save(emp) ;
	}

	//(5) Perform Delete Operation on Entity using Spring Data JPA
	@Test
	void DeleteData(){
		employeeRepository.deleteById(3);
	}
	//(5) Perform Read Operation on Entity using Spring Data JPA
		@Test
	void ReadAllDataP() {
		List<Employee> emp = employeeRepository.findAll() ;
		System.out.println(emp);
	}

	//(6) Get the total count of the number of Employees

	@Test
	void testCountAll(){
		long count = employeeRepository.count();
		System.out.println(count);
	}

	//(7) Implement Pagination and Sorting on the bases of Employee Age
	@Test // ASC
	void testSortingAge(){
   employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"age")).forEach(p-> System.out.println(p.getName()));
	}

	@Test //DESC
	public void Sort_Page_On_Age(){
		Pageable pageable = PageRequest.of(0 , 2 , Sort.Direction.DESC ,"age");
//		employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ))).forEach(System.out::println);
		Page<Employee> results = employeeRepository.findAll(pageable) ;
		results.forEach(System.out::println);

	}
//(8) Create and use finder to find Employee by Name
	@Test
	void testFindByName(){
		List<Employee> emp = employeeRepository.findByName("Inderpreet");
		System.out.println(emp);
	}




	//(9) Create and use finder to find Employees starting with A character

	@Test
	void testFindByNameLike(){
		List<Employee> emp = employeeRepository.findByNameLike("I%");
		System.out.println(emp);
	}
//	@Test
//	public List<Employee> getEmployeesByFirstLetter(String letter) {
//		return employeeRepository.findByNameStartingWith("H");
//	}

	//(10) Create and use finder to find Employees Between the age of 22 to 32

	@Test
	void testFindByAgeBetween(){
		List<Employee> emp = employeeRepository.findByAgeBetween(22,32);
		System.out.println(emp);
	}

	//pagination and Sorting

@Test
	void testFindAllPaging(){
		Pageable pageable = PageRequest.of(0,1);
		Page<Employee> result = employeeRepository.findAll(pageable);
	    result.forEach(p-> System.out.println(p));

}

	@Test
	public void SortMutliPropFindAllPaging(){
		employeeRepository.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ),new Sort.Order(Sort.Direction.DESC , "id"))).forEach(System.out::println);
	}

}
