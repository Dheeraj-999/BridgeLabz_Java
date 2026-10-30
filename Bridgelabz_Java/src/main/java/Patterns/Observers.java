package main.java.Patterns;

/*
Observer Pattern – Steps
1. Create Observer interface.
2. Create Subject interface.
3. Implement NewsAgency.
4. Register and notify observers.

Dheeraj Buchha
*/

import java.util.*;

interface Observer {
    void update(String news);
}

interface Subject {
    void register(Observer observer);

    void notifyObservers();
}

class NewsAgency implements Subject {
    List<Observer> observers = new ArrayList<>();
    String news;

    public void register(Observer observer) {
        observers.add(observer);
    }

    void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

class NewsChannel implements Observer {
    String name;

    NewsChannel(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + ": " + news);
    }
}

public class Observers {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        agency.register(new NewsChannel("Channel 1"));
        agency.register(new NewsChannel("Channel 2"));

        agency.setNews("Breaking News!");
    }
}
