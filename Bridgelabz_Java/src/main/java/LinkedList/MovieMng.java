import java.util.Scanner;

class Node {
    String Title;
    String Director;
    int YearOfRelease;
    Double Rating;

    Node prev;
    Node next;

    Node(String Title, String Director, int YearOfRelease, Double Rating) {
        this.Title = Title;
        this.Director = Director;
        this.YearOfRelease = YearOfRelease;
        this.Rating = Rating;
    }
}

// operation starts

class Movie {
    Node head = null;
    Node tail = null;

    void addFirst(String Title, String Director, int YearOfRelease, Double Rating) {

        Node newNode = new Node(Title, Director, YearOfRelease, Rating);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }

        head = newNode;
    }

    void addMiddle(int position, String Title, String Director, int YearOfRelease, double Rating) {
        Node newNode = new Node(Title, Director, YearOfRelease, Rating);
        Node current = head;

        if (position == 1) {
           addFirst(Title, Director, YearOfRelease, Rating);
            return;
        }

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        Node temp = current.next;

        current.next = newNode;
                newNode.prev = current;

        newNode.next = temp;

        if(temp!=null){
            temp.prev = newNode;
        }


        if (newNode.next==null) {
            tail=newNode;
        }
    }

    void addEnd(String Title, String Director, int YearOfRelease, double Rating) {
        Node newNode = new Node(Title, Director, YearOfRelease, Rating);

        

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }

        Node current=head;

        while (current.next != null) {
           current=current.next;
        }

         current.next = newNode;
        newNode.prev = current;
        newNode.next = null;
        tail=newNode;

    }

    void Search(String Director,double Rating){
        Node current=head;

        while(current!=null){
            if(current.Director.equals(Director) || current.Rating==Rating){
                System.out.println("Movie found: "+ current.Title);
            }
            current=current.next;
        }
    }

    void DisplayForward(){
        Node current=head;

        while(current!=null){
            System.out.println("Movie: "+ current.Title);
            System.out.println("Director: "+ current.Director);
            System.out.println("Release: "+ current.YearOfRelease);
            System.out.println("Ratings: "+ current.Rating);
            current=current.next;
        }

    }

    void DisplayBackward(){
        Node current=head;

        while(current.next!=null){
            current=current.next;
        }

        while (current!=head){
            System.out.println("Movie: "+ current.Title);
            System.out.println("Director: "+ current.Director);
            System.out.println("Release: "+ current.YearOfRelease);
            System.out.println("Ratings: "+ current.Rating);
            current=current.prev;
        }
        if(current==head){
            System.out.println("Movie: "+ current.Title);
            System.out.println("Director: "+ current.Director);
            System.out.println("Release: "+ current.YearOfRelease);
            System.out.println("Ratings: "+ current.Rating);
        }
    }

    void UpdateRating(String Title,double Rating ){
        Node current=head;

        while(current!=null){
        if(current.Title.equals(Title)){
            current.Rating=Rating;
        }
        current=current.next;
    }
    }
}

public class MovieMng{
    public static void main(String[] args){

        Movie list=new Movie();
            list.addFirst("3 idiots", "Rajkumar", 2015, 4.5);
            list.addFirst("RRR", "Rajmouli", 2025, 4.1);

            list.DisplayForward();
list.addMiddle(2, "Bahubali", "Rajmouli", 2022, 5);
             list.DisplayForward();
   
}
}