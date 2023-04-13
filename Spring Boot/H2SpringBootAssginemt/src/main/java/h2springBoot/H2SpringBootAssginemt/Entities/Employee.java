package h2springBoot.H2SpringBootAssginemt.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int empID ;

    public String empName ;
    public String empDesignation ;

    public Employee(int empID, String empName, String empDesignation) {
        this.empID = empID;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}
