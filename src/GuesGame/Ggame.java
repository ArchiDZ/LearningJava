package GuesGame;

import java.util.Random;
import java.util.Scanner;

public class Ggame {
   public static void guesTheNumber() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int answer = 0;
        int numOfTr=0;
        int x = rnd.nextInt(100) + 1;

        do {
            numOfTr++;
            System.out.println("Try to guess number from 1 to 100");
            answer = in.nextInt();
            if (answer > x)
                System.out.println("Hidden number is smaller");
             else if (answer < x)
                System.out.println("Hidden number is bigger");
             else
                System.out.println("Correct! Congratulation!!!");
        }while (answer!=x);
        System.out.println("You guess from "+numOfTr+ " step");

   }
    }
