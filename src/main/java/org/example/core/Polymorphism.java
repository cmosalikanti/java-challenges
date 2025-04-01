package org.example.core;

import java.util.Optional;

class Animal {
    void makeSound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog sounds");
    }

    void makeSound(String food) {
        System.out.println("Dog making sound when eating the " + food);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        animal = new Dog();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound("biscuit");

    }
}
