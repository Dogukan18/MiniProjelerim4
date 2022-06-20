import java.sql.SQLOutput;

public class Employee {

    int EmployeeId;
    String name;
    String surname;
    double salary;

    Employee(int EmpoloyeeID,String name,String surname,double salary){
        this.EmployeeId=EmpoloyeeID;
        this.name=name;
        this.surname=surname;
        this.salary=salary;

    }
    Employee(int EmpoloyeeID,String name,String surname){
        this.EmployeeId=EmpoloyeeID;
        this.name=name;
        this.surname=surname;


    }
    Employee(int EmpoloyeeID,double salary){
        this.EmployeeId=EmpoloyeeID;
        this.salary=salary;

    }
  
}

