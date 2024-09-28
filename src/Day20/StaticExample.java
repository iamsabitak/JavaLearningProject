package Day20;

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Current count: " + count);
    }

    static void showTotalObjects() {
        System.out.println("Total objects created: " + count);
    }
}

class School {

    private static int totalStudents = 0;

    static {
        System.out.println("School is now open for the new year!");
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    private String name;
    private int grade;

    public School(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void showStudentInfo() {
        System.out.println("Student Name: " + name + ", Grade: " + grade);
    }
}

public class StaticExample {
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Accessing static method without creating an object
        Counter.showTotalObjects();

        School student1 = new School("John", 10);
        School student2 = new School("Alice", 12);
        School student3 = new School("Mark", 9);

        // Display each student's info
        student1.showStudentInfo();
        student2.showStudentInfo();
        student3.showStudentInfo();

        // Display total number of students using the static method
        System.out.println("Total number of students: " + School.getTotalStudents());
    }
}
