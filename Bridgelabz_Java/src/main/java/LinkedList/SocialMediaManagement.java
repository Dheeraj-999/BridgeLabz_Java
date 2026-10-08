import java.util.ArrayList;

class Node {

    int userId;
    String name;
    int age;
    ArrayList<Integer> friends;

    Node next;

    Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}


class SocialMedia {

    Node head = null;


    // Find user by ID
    Node findUser(int userId) {

        Node current = head;

        while (current != null) {

            if (current.userId == userId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }


    // Add a new user
    void addUser(int userId, String name, int age) {

        Node newNode = new Node(userId, name, age);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    // 1. Add friend connection
    void addFriend(int userId1, int userId2) {

        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        user1.friends.add(userId2);
        user2.friends.add(userId1);

        System.out.println("Friend connection added");
    }


    // 2. Remove friend connection
    void removeFriend(int userId1, int userId2) {

        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        user1.friends.remove(Integer.valueOf(userId2));
        user2.friends.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed");
    }


    // 3. Find mutual friends
    void findMutualFriends(int userId1, int userId2) {

        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends:");

        for (int friendId : user1.friends) {

            if (user2.friends.contains(friendId)) {

                Node friend = findUser(friendId);

                System.out.println(
                        friend.userId + " - " + friend.name
                );
            }
        }
    }


    // 4. Display all friends
    void displayFriends(int userId) {

        Node user = findUser(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        for (int friendId : user.friends) {

            Node friend = findUser(friendId);

            System.out.println(
                    friend.userId + " - " + friend.name
            );
        }
    }


    // 5. Search by name or ID
    void searchUser(String name, int userId) {

        Node current = head;

        while (current != null) {

            if (current.name.equals(name) ||
                current.userId == userId) {

                System.out.println("User Found:");
                System.out.println("ID: " + current.userId);
                System.out.println("Name: " + current.name);
                System.out.println("Age: " + current.age);

                return;
            }

            current = current.next;
        }

        System.out.println("User not found");
    }


    // 6. Count friends for each user
    void countFriends() {

        Node current = head;

        while (current != null) {

            System.out.println(
                    current.name + " has " +
                    current.friends.size() +
                    " friends"
            );

            current = current.next;
        }
    }
}


public class SocialMediaManagement {

    public static void main(String[] args) {

        SocialMedia socialMedia = new SocialMedia();


        // Add users
        socialMedia.addUser(101, "Dheeraj", 21);
        socialMedia.addUser(102, "Rahul", 22);
        socialMedia.addUser(103, "Aman", 21);
        socialMedia.addUser(104, "Rohit", 23);


        // Add friendships
        socialMedia.addFriend(101, 102);
        socialMedia.addFriend(101, 103);
        socialMedia.addFriend(102, 103);
        socialMedia.addFriend(102, 104);


        // Display friends
        System.out.println("\n--- FRIENDS ---");
        socialMedia.displayFriends(101);


        // Mutual friends
        System.out.println("\n--- MUTUAL FRIENDS ---");
        socialMedia.findMutualFriends(101, 102);


        // Search user
        System.out.println("\n--- SEARCH ---");
        socialMedia.searchUser("Aman", 103);


        // Remove friendship
        System.out.println("\n--- REMOVE FRIEND ---");
        socialMedia.removeFriend(101, 103);


        // Count friends
        System.out.println("\n--- FRIEND COUNT ---");
        socialMedia.countFriends();
    }
}