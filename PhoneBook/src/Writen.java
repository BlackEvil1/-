import java.io.*;
import java.util.Scanner;

public class Writen {
    public static void main(String[] args) {

        Scanner console1 = new Scanner(System.in);
        System.out.println("Введите номер");
        String consoleNumber = console1.nextLine();
        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите имя контакта");
        String consoleName = console2.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream("kniga.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(consoleNumber);
            oos.writeObject (consoleName);

            oos.close();

        } catch (IOException e) {
            System.out.println("Данные не найдены");
        }

    }
}
