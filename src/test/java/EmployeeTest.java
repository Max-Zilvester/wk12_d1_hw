import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

//    @Before
//    public void before(){
//        employee = new Employee("Max", "CF125245D", 250.5);
//    }


    @Test
    public void managerAsEmployeeWithDept(){
        employee = new Manager("Max", "CF125245D", 250, "CustExp", 1000);
        assertEquals("CustExp", employee.getDeptName());
    }

    //Need to understand why it's passing without assertEquals
    @Test
    public void employeeHasName(){

    }

    @Test
    public void employeeHasNiNumber(){

    }

    @Test
    public void employeeHasSalary(){

    }

    @Test
    public  void raiseEmployeeSalary(){
    employee = new Manager("Max", "CF125245D", 250, "CustExp", 1000);
        assertEquals(252.5, employee.raiseSalary(), 0.01);
    }

    @Test
    public void payEmployeeBonus() {
        employee = new Manager("Max", "CF125245D", 250, "CustExp", 1000);
        assertEquals(2.5, employee.payBonus(), 0.01);
    }
}
