import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ReadWriteToFile {
static   String [][] data = new String [5][3];
  Scanner scn;
    private void out(){
        for (int row=0;row<data.length;row++){
            for(int col=0;col<data[row].length;col++){
                System.out.println(data[row][col]+ " ");
            }
            System.out.println();
        }
    }
    private void read(){
        while(scn.hasNext()){
            for(int row = 0;row< data.length;row++){
                for(int column = 0;column<data[row].length;column++){
                    data[row][column]=scn.next();
                }
            }
        }
    }

    private void openFile(){
        try {
            scn = new Scanner(new File("failo//example.txt"));
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null,"Файл не найден");
        }
        }
        public void run(){
        openFile();
        read();
        out();
        }
}
