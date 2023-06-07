package org.example.ch09;

import java.util.Objects;

public class Person {
    long id;

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            return id == ((Person) o).id;
//        } else {
//            return false;
//        }
//    }

    public Person(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Person p1 = new Person(10L);
        Person p2 = new Person(10L);

        if (p1.equals(p2)) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }
    }
}
