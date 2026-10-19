
import java.util.*;

abstract class CourseType {
    String evaluation;

    CourseType(String evaluation) {
        this.evaluation = evaluation;
    }
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research-Based");
    }
}

class Course<T extends CourseType> {
    String name;
    T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }
}

public class UniversityManagm {

    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.evaluation);
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> c1 = new Course<>("Java", new ExamCourse());

        Course<AssignmentCourse> c2 = new Course<>("Web Development", new AssignmentCourse());

        Course<ResearchCourse> c3 = new Course<>("AI Research", new ResearchCourse());

        List<CourseType> types = new ArrayList<>();
        types.add(c1.type);
        types.add(c2.type);
        types.add(c3.type);

        displayCourses(types);
    }
}
