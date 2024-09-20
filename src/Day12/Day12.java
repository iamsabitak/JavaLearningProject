package Day12;

class Student {
    int age;
    String name;
    int grade;
    int salary;

    public void printDetails() {
        System.out.println("this is my custom class");
        System.out.println("the name is" + name);
        System.out.println("the age is" + age);
        System.out.println("the grade is" + grade);
    }

    public int getSalary() {
        return salary;
    }
}

public class Day12 {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Student iamSabu = new Student(); // Instantiating a new Student Object
        Student iamNiru = new Student();

        // Setting Attributes for sabu
        iamSabu.age = 18;
        iamSabu.name = "sabita khadka";
        iamSabu.grade = 12;
        iamSabu.salary = 200;

        iamNiru.age = 17;
        iamNiru.name = "nirmala khadka";
        iamNiru.grade = 11;
        iamNiru.salary = 388;

        iamSabu.printDetails();
        iamNiru.printDetails();
        System.out.println(iamSabu.getSalary());

        System.out.println(iamSabu.name);
        System.out.println(iamSabu.age);
        System.out.println(iamSabu.grade);

    }
}
