import java.time.LocalDate;
import java.time.Period;
public class Employee {
    // Step 1: Define attribute for name, salary, and hire date
    private String name;
    private double salary;
    private LocalDate hireDate;
    // Step 2: Add a constructor
    public Employee (String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    // Step 3: Add getter methods
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    // Step 4: Add a method to calculate years of service
    public int calculateYearsOfService(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }
}
