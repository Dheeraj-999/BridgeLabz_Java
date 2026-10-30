package main.java.Patterns;

/*
 * 4. Builder Pattern – Steps
 * 1. Create User class with private fields.
 * 2. Make constructor private.
 * 3. Create static inner Builder class.
 * 4. Add setter-like methods returning Builder.
 * 5. Add build() method.
 * 6. Create User object using Builder.
 * 
 * Dheeraj Buchha
 */

class User {
    private String name;
    private int age;
    private String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public void display() {
        System.out.println(name + " " + age + " " + email);
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Rahul")
                .setAge(22)
                .setEmail("rahul@gmail.com")
                .build();

        user.display();
    }
}
