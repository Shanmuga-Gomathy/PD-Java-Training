abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary = 2000;

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlySalary = 200;
    int hours = 6;

    double calculateSalary() {
        return hourlySalary * hours;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        System.out.println("Full Time Employee pay : " + emp1.calculateSalary());
        System.out.println("Part Time Employee pay : " +emp2.calculateSalary());
    }
}


