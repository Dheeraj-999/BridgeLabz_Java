package main.java.Patterns;

/*
 * 12. Proxy Pattern – Steps
 * 1. Create FileService interface.
 * 2. Create RealFileService class.
 * 3. Create FileAccessProxy.
 * 4. Check user role before calling real service.
 */

interface FileService {
    void openFile();
}

class RealFileService implements FileService {
    public void openFile() {
        System.out.println("File opened");
    }
}

class FileAccessProxy implements FileService {
    RealFileService service = new RealFileService();
    String role;

    FileAccessProxy(String role) {
        this.role = role;
    }

    public void openFile() {
        if (role.equalsIgnoreCase("admin")) {
            service.openFile();
        } else {
            System.out.println("Access Denied");
        }
    }
}

public class Proxy {
    public static void main(String[] args) {
        FileService file = new FileAccessProxy("admin");
        file.openFile();

        FileService user = new FileAccessProxy("user");
        user.openFile();
    }
}
