package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName, budget);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
