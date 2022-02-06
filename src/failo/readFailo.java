package failo;

import java.io.*;
import java.util.Scanner;

public class readFailo {
    private void read(){
        try {
            File myFile = new File("res/todoList.txt");
            Scanner scn = new Scanner(myFile);
            while (scn.hasNextLine()){
                String data = scn.nextLine();
                System.out.println(data);
            }
            scn.close();
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
    private void add(){
        try {
            FileWriter fw = new FileWriter("res/example.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);{
                out.println("the text");
                out.println("more text");
            }
        }catch (IOException e){
            System.out.println("чтото пошло не так");
            //exception
        }
    }
    public void run(){
        read();
      //  add();
    }
}
