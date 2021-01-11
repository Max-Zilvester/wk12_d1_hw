package staff;

public abstract class Employee {

    private String deptName;
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary, String deptName){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
        this.deptName = deptName;
    }

    public Employee(String name, String niNumber, double salary) {
    }

    public String getDeptName() {
        return deptName;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(){
        return this.salary + payBonus();
    }

    public double payBonus(){
        return this.salary * .01;
    }
}
