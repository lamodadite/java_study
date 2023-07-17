package org.example.ch12;

public class Unit {
    int x, y;
    Direction dir; // 열거형을 인스턴스 변수로 선언
    void init() {
        dir = Direction.EAST; // 유닛의 방향을 EAST로 초기화
    }

    public static void main(String[] args) {
        for (Direction x : Direction.values()) {
            System.out.println(x);
        }
        Direction dir = Direction.valueOf("WES");
        System.out.println(dir);
    }
}

enum Direction {
    EAST(1, ">"), SOUTH(5, "V"), WEST(-1, "<"), NORTH(10, "^");	//끝에 ';'를 추가해야 한다.
    private final int value;	//정수를 저장할 필드(인스턴스 변수) 추가
    private final String symbol;

    Direction(int value, String symbol) {	//생성자 추가
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}