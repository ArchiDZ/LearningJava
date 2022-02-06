package small;

import java.io.IOException;
import java.util.Scanner;

public class HelP {
    public static void helpo() throws IOException {

            System.out.println("Справочная информация: ");
            System.out.println("___1.  if");
            System.out.println("___2.  switch");
            System.out.println("Выберите:__");
            //Scanner in = new Scanner(System.in);
            char choice = (char) System.in.read();
            System.out.println("___");
            switch (choice) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) инструкция");
                    System.out.println("else инструкция");
                    break;
                case '2':
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch(выражение)");
                    System.out.println("case константа");
                    System.out.println("Последовательность инструкций");
                    System.out.println("break;");
                    System.out.println("//...");
                    break;
                default:
                    System.out.println("Введенный запрос не найден... ");
            }
        }
    }

