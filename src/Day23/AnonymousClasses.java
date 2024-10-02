package Day23;
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("I am a person.");
    }
}
public class AnonymousClasses {
    public static void main(String[] args) {
        // Anonymous class for Student
        Person student = new Person("John") {
            @Override
            public void introduce() {
                System.out.println("Hi, I am " + name + ", and I am a student.");
            }
        };

        // Anonymous class for Teacher
        Person teacher = new Person("Ms. Smith") {
            @Override
            public void introduce() {
                System.out.println("Hello, I am " + name + ", and I am a teacher.");
            }
        };

        // Introduce the student and teacher
        student.introduce();
        teacher.introduce();
    }
}
