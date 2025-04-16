

public class course {
    // Attributes (fields)
    private String courseName;
    private String courseId;
    private String instructor;
    private int numberOfStudents;

    // Constructor
    public course(String courseName, String courseId, String instructor, int numberOfStudents) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.instructor = instructor;
        setNumberOfStudents(numberOfStudents); // Use setter to apply validation
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        if (numberOfStudents >= 0) {
            this.numberOfStudents = numberOfStudents;
        } else {
            System.out.println("Number of students cannot be negative.");
            this.numberOfStudents = 0;
        }
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println(toString());
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n" +
               "Course ID: " + courseId + "\n" +
               "Instructor: " + instructor + "\n" +
               "Number of Students: " + numberOfStudents;
    }
}
