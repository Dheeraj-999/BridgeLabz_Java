package main.java.Patterns;

/*
5. Prototype Pattern – Steps
1. Create Employee class implementing Cloneable.
2. Override clone() method.

3. Create original Employee object.
4. Clone the object using clone().
5. Verify cloned object has same data.

Dheeraj Buchha
*/
class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Prototype {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = e1.clone();

        e1.display();
        e2.display();

        System.out.println(e1 == e2);
    }
}
