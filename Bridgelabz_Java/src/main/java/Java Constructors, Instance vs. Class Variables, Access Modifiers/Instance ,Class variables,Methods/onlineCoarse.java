class Course {
    String courseName;
    String duration;
    double fee;

    static String InstitutionName = "BridgeLabz";

    Course(String courseName,
            String duration,
            double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name=" + courseName);
        System.out.println("duration=" + duration);
        System.out.println("fee= " + fee);
        System.out.println("InstitutionName" + Course.InstitutionName);

    }

    static void updateInstitueName(String newInstituteName) {
        InstitutionName = newInstituteName;
    }

    public static void main(String[] args) {

        Course course1 = new Course("web dev", "5 months", 14000);

        Course course2 = new Course("aiml", "6 months", 18000);
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstitueName("Akash academy");
        System.out.println("After updating institue name");

        course1.displayCourseDetails();
        course2.displayCourseDetails();

    }
}