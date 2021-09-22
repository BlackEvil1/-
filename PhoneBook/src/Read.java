import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("kniga.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object consoleNumber = ois.readObject();
            Object consoleName = ois.readObject();

            System.out.println("Имя контакта: "+ consoleName + " номер: "+ consoleNumber);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
        System.out.println("Данные не найдены");
        }
    }
}
