/*
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.

*/

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person() {

    }

}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void performDuties() {
        System.out.println(name + " Chef prepares food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void performDuties() {
        System.out.println(name + " Waiter serves food");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Dheeraj", 101);

        Waiter waiter1 = new Waiter("Rahul", 201);
        chef1.performDuties();
        waiter1.performDuties();
    }
}