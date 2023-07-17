package org.example.ch12;

public class Card {
    public Card(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
    }

    enum Kind { CLOVER, HEART, DIAMOND, SPADE } // 열거형 Kind를 정의
    enum Value { TWO, THREE, FOUR } // 열거형 Value를 정의

    final Kind kind;
    final Value value;

}
