package org.example.ch07;

public interface Fightable extends Movable, Attackable{ }

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}