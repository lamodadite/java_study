package org.example.ch07;

public class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class CaptionTv extends Tv {
    String text;
    void caption() {}
}
