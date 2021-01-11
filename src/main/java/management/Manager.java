package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, double salary, String deptName, double budget)
    {
        super(name, niNumber, salary, deptName);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}


