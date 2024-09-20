package Day12;

public class PracticeSet1 {
    public class Main {
        public static void main(String[] args) {
            System.out.println("this is our custom class");
            Employee myEmployee = new Employee();
            // Employee sabita = new Employee();
            myEmployee.salary = 4;
            // myEmployee.name = "Nabraj khadka";
            myEmployee.setName("sabitakhadka");
            System.out.println(myEmployee.getName());

            System.out.println(myEmployee.getSalary());

        }
    }

}

class Employee {
    int salary;// class attributes
    String name;

    public int getSalary() {// method
        return salary;
    }

    public String getName() {// method
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
