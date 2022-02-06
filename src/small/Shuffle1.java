package small;

public class Shuffle1 {
    public void abcd(){
        int x = 3;
        while(x>0){
            if(x>2){
                System.out.print("a");
                }
            x=x-1;
            System.out.print("-");
            if(x==2){
                System.out.print("b c");
            }
            x=x-1;
            System.out.print("-");
            if(x==1){
                System.out.print("d");
                x=x-1;
            }
        }
    }

    public void smal1(){
        int x=5;
        while(x>1){
            x=x-1;
            if(x<3){
                System.out.println("Маленький икс");
            }
        }
    }
}
