package org.example.ch07;

public class Car {
    String color;
    int door;
    void drive() {}
    void stop() {}
}

class FireEngine extends Car {
    void water() {}
}

class Ambulance extends Car {
    void siren() {}
}

class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = new FireEngine();


        System.out.println(car instanceof Car);
        System.out.println(car instanceof FireEngine);
        System.out.println(fe instanceof Car);
        System.out.println(fe instanceof FireEngine);
    }
}

