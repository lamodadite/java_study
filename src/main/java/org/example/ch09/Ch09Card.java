package org.example.ch09;

import org.example.ch07.Card;

import java.util.Objects;

public class Ch09Card {
    String kind;
    int number;

    Ch09Card() {
        this("SPADE", 1);
    }

    Ch09Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }

    public static void main(String[] args) {
        Ch09Card c1 = new Ch09Card();
        Ch09Card c2 = new Ch09Card("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
