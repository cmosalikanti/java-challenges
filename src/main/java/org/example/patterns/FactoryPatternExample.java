package org.example.patterns;

/** The Factory Method pattern provides an interface for creating objects in a super class but allows subclasses to
 *  alter the type of objects that will be created. It decouples object creation from the client code,
 *  promoting loose coupling.
*   Use case: When the exact type of the object to be created isn't known until runtime, or when you want to
 *   delegate the responsibility of object creation to a subclass.
 *
 */
abstract class Vehicle {
    abstract void create();
}

class Car extends Vehicle {
    @Override
    void create() {
        System.out.println("Car created");
    }
}

class Truck extends Vehicle {
    @Override
    void create() {
        System.out.println("Truck created");
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}

class TruckFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        VehicleFactory factory = new TruckFactory();
        factory.createVehicle();
    }
}
