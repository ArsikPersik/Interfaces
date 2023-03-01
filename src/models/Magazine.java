package models;

import interfaces.Printable;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Название журнала: " + title);
    }

    public static void printMagazines(Printable[] items) {
        for (Printable item : items) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
