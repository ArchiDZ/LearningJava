import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class menu {
    private void myMenu(){

            try {
                File myFile = new File("res/example.txt");
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
        public void run(){
        myMenu();
        }

}
