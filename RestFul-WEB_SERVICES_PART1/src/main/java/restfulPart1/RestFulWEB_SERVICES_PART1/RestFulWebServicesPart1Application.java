package restfulPart1.RestFulWEB_SERVICES_PART1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//	Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
//	Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.
//	Implement GET http request for Employee to get list of employees.
//	Implement GET http request using path variable top get one employee
//	Implement POST http request for Employee to create a new employee.
//	Implement Exception Handling for resource not found
//	Implement DELETE http request for Employee to delete employee
//	Implement PUT http request for Employee to update employee
//	Apply validation while create a new employee using POST http Request.
//	Configure actuator in your project to check the health of application and get the information
//		about various beans configured in your application
@SpringBootApplication
public class RestFulWebServicesPart1Application {
	public static void main(String[] args) {
		SpringApplication.run(RestFulWebServicesPart1Application.class, args);
	}

}
