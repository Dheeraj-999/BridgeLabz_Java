/*
 * Problem 2: Online Course Management
 * Create a Course class with instance variables courseName,
 * duration, fee and a class variable instituteName.
 */

class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    static String instituteName = "BridgeLabz"; // class

    // Constructor
    Course(String courseName, int duration, double fee) {

        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() { // Instance method
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {

        Course course1 = new Course("Java", 4, 15000);
        Course course2 = new Course("Web Development", 6, 20000);

        course1.displayCourseDetails();

        System.out.println();
        course2.displayCourseDetails();

        System.out.println();

        // Change institute name
        Course.updateInstituteName("Tech Academy");

        System.out.println("After updating institute name:");

        System.out.println();
        course1.displayCourseDetails();

        System.out.println();

        course2.displayCourseDetails();
    }
}