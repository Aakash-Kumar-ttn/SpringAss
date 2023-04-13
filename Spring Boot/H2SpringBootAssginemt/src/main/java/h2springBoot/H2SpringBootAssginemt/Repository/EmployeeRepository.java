package h2springBoot.H2SpringBootAssginemt.Repository;

import h2springBoot.H2SpringBootAssginemt.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
