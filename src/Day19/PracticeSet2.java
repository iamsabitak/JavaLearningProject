package Day19;

public class PracticeSet2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMarks(45, 55, 60);

        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Average Marks: " + student.getAverageMarks());
        student.checkPassOrFail();
    }
}
class Student {
    private int subject1, subject2, subject3;

    public void setMarks(int sub1, int sub2, int sub3) {
        if (sub1 >= 0 && sub2 >= 0 && sub3 >= 0) {
            subject1 = sub1;
            subject2 = sub2;
            subject3 = sub3;
        } else {
            System.out.println("Marks cannot be negative.");
        }
    }

    public int getTotalMarks() {
        return subject1 + subject2 + subject3;
    }

    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    public void checkPassOrFail() {
        if (subject1 >= 40 && subject2 >= 40 && subject3 >= 40) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }
    }
}
