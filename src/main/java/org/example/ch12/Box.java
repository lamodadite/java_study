package org.example.ch12;

public class Box {
    Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

class GenericBox<T> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
