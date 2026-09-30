/*
 * Java Constructor, Level 1
 * Create a Person class with a copy constructor that clones another person's
 * attributes.
 * 
 * Author: Dheeraj Buchhha
 * Date: 29 september
 * 
 */

class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args) {

        // Original object
        Person person1 = new Person("Dheeraj", 21);

        // Copy of person1
        Person person2 = new Person(person1);

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}