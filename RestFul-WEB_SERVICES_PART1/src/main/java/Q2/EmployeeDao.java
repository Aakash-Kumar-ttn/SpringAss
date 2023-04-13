package Q2;

import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {

    private static List<Employee> employeeList = new ArrayList<>() ;

    static {
        employeeList.add(new Employee(1,"Aakash" , 22));
        employeeList.add(new Employee(2,"Roopak" , 30));
        employeeList.add(new Employee(3,"Satyam" , 25));
    }

    public List<Employee> findAll(){
        return employeeList ;
    }

    public Employee findById(int id){
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null) ;
    }
    public void DeleteById(int id){

        employeeList =  employeeList.stream().filter(e -> e.getId() != id)
                .collect(Collectors.toList());
    }




    public Employee postEmployee(Employee emp){
        employeeList.add(emp) ;
        return emp ;
    }

}
