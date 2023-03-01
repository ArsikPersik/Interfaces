package models;

import interfaces.Instrument;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + size + " в " + KEY);
    }
}
