import interfaces.Instrument;
import interfaces.Printable;
import models.*;

public class Main {
    public static void main(String[] args) {
        // Создаем книги и журналы
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Великий Гэтсби");
        printableItems[1] = new Magazine("National Geographic");
        printableItems[2] = new Book("Убить пересмешника");
        printableItems[3] = new Magazine("Vogue");

        // Выводим на консоль все книги и журналы
        for (Printable printableItem : printableItems) {
            printableItem.print();
        }

//        // Выводим на консоль только журналы
//        Magazine.printMagazines(printableItems);

//        // Выводим на консоль только книги
//        Book.printBooks(printableItems);

        // Создаем инструменты
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(22);
        instruments[2] = new Trumpet(3);

        // Выводим в консоль информацию об инструментах
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
