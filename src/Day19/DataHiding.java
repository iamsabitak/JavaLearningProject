package Day19;

class Car {
    private String model;
    private int year;

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }
}

class Employee {
    private double salary;

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("New salary after " + percentage + "% raise: " + salary);
        } else {
            System.out.println("Raise percentage should be positive.");
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setYear(2022);

        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());
        
        Employee emp = new Employee();
        emp.setSalary(30000);
        System.out.println("Current salary: " + emp.getSalary());

        emp.giveRaise(10);
        emp.giveRaise(-5);
    }
}
