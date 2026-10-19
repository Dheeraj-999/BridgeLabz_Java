
import java.util.*;

abstract class JobRole {
    String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }
}

public class ResumeScreening {

    // Wildcard method
    static void screenRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for: " + role.roleName);
        }
    }

    // Generic method
    static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Candidate: " + resume.candidateName);
        System.out.println("Job Role: " + resume.role.roleName);
        System.out.println();
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>("Aman", new SoftwareEngineer());

        Resume<DataScientist> r2 = new Resume<>("Priya", new DataScientist());

        Resume<ProductManager> r3 = new Resume<>("Rahul", new ProductManager());

        screenResume(r1);
        screenResume(r2);
        screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(r1.role);
        roles.add(r2.role);
        roles.add(r3.role);

        screenRoles(roles);
    }
}
