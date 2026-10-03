/*
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.

Date:3 oct
*/

class Course {
    String courseName;
    String duration;

    Course() {

    }

    // no need for course constructor wit parameters
}

class OnlineCourse extends Course {
    String platform;
    String isRecorded;

    OnlineCourse() {

    }

    OnlineCourse(String courseName, String duration, String platform, String isRecorded) {
        this.courseName = courseName;
        this.duration = duration;
        this.platform = platform;
        this.isRecorded = isRecorded;

    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    String discount;

    PaidOnlineCourse(String courseName, String duration, String platform, String isRecorded, double fee,
            String discount) {
        this.courseName = courseName;
        this.duration = duration;
        this.platform = platform;
        this.isRecorded = isRecorded;
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("isRecorded: " + isRecorded);
        System.out.println("fee: " + fee);
        System.out.println("discount: " + discount);

    }

}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse p1 = new PaidOnlineCourse("Development", "4 months", "Physics Wallah", "yes", 4999,
                "10 percent");

        p1.displayCourseDetails();
    }

}