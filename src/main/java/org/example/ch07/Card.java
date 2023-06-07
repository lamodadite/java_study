package org.example.ch07;

public class Card {
    static int width = 100;
    static int height = 150;

    final String kind;
    final int number;

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
