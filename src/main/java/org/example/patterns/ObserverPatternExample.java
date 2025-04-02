package org.example.patterns;

import java.util.ArrayList;
import java.util.List;

/** The Observer pattern is a behavioral design pattern in which one object (the subject) maintains a list of dependent observers.
 *  When the state of the subject changes, all its observers are notified and updated automatically.
 *  Use case: It's used when one object’s state change should notify other dependent objects, e.g., in event-driven systems.
 *
 */
interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("State Changed");
    }
}


