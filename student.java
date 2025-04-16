

class Studentship {
    String name;
    int rollNumber;
    int age;
    String course;

    Studentship(String name, int rollNumber, int age, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class student {
    public static void main(String[] args) {
        Studentship student = new Studentship("John Doe", 101, 20, "Computer Science");
        student.displayDetails();
    }
}
