package org.example;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // 추상메서드
    void stop() { /*현재 위치에 정지*/}
}
class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("마린 이동");
    }
//    void stimPack() {/*스팀팩 사용}
}
class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("탱크 이동");
    }
    void siegeMode() {/*시즈모드 사용*/}
}
class DropShip extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("드랍쉽 이동");
    }
    void load() {/*대상 태움*/}
    void unload() {/*대상 내림*/}
}
class Ch07_1 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new DropShip()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}