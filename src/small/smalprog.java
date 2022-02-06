package small;

import java.util.Scanner;

public class smalprog {
    public static void sm26(){
        double radius_zemli_km = 6350;//в километрах
        double radius_zemli_m =6367250;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рост человека --");
        double rost_cheloveka = sc.nextDouble();

        double formula = Math.sqrt((Math.pow((radius_zemli_m+rost_cheloveka),2))-radius_zemli_m);
        double fir = radius_zemli_m+rost_cheloveka;
        double fir2 = Math.pow(fir,2);
        double fir3 = fir2-radius_zemli_m;
        double fir4 = Math.sqrt(fir3);
        System.out.println("Расстояние до горизонта: "+formula);
        System.out.println("Расстояние до горизонта вариант 2 : "+fir4);
    }
    //===========================================================
    public static void sm27(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        double rebro = sc.nextDouble();
        double objom = rebro*rebro*rebro;
        double ploshad = rebro*rebro;
        System.out.println("Площадь боковой поверхности куба --"+ploshad);
        System.out.println("Обьем куба -- "+objom);
        }
    //====================================================================
    public static void sm29(){
    Scanner cs = new Scanner(System.in);
    System.out.println("Введите число х--");
    double x = cs.nextDouble();
    System.out.println("Введите число У--");
    double y = cs.nextDouble();
    double z = 2*(Math.pow(x,3))-3.44*x*y+2.3*(Math.pow(x,2))-7.1*y+2;
    System.out.println("Результат вычисления по формуле ___"+z);
    }
    //=====================================================================
    //=====================Массивы=Глава 11================================
    //=====================================================================
    public static void sm111(){
        int [] a = {37,0,50,46,34,46,0,13};
        for (int i = 0;i<a.length;i++){
           System.out.println(a[i]);
        }
        System.out.println(" ");
    }
    //======================================================================
    public static void sm112(){
        int [] arr = new int[10];
        Scanner iput = new Scanner(System.in);
        System.out.print(" Введите 10 значений___");
        for(int i=0;i< arr.length;i++){
            arr[i]=iput.nextInt();
        }
        System.out.println("Введеные значения___");
        for(int i=0;i< arr.length;i++){
             System.out.println(arr[i]);
        }
    }
    //=======================================================================
    public static void FizBuz(){
        System.out.println("Hello WOOOOOOOOOZZAAAAAAAAA");

        for (int i = 1;i<101;i++){
            if (i % 3 == 0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
         else if (i%5==0){
                System.out.println("Buzz");
            }
        else if (i%3==0) {
            System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    //=======================================================================
    //Убирает все гласные буквы из строки.
    //=======================================================================
    public static String dismovel(String str){
        String str_rem;
        str_rem = str.replaceAll("[aeiouAEIOU]","");
      //  System.out.println(str_rem);
        return str_rem;
    }
    //========================================================================
    public static  String rem(String words){
        String k_word = "kira";
        k_word = words;
        words.replace("[a-zA-Z]","(");
        System.out.println(words);
        return words.replace("[a-zA-Z]","(");
    }
    //============================================================================
    public static void sm113(){
        int s=0;
        double [] RndArray = new double[15];
        for (int i = 0; i<RndArray.length;i++){
            RndArray[i] = 0+(Math.random()*10);
            System.out.println(s+++"array__"+RndArray[i]);
        }
    }
    //================================================================================
    //Массив в обратную сторону
    //================================================================================
    public static void sm119(){
        int [] backArray = {10,22,35,44,59,60,71,85,93,100};
        for (int i=0;i< backArray.length;i++){
            System.out.print(backArray[i]);
            System.out.print(" " );
        }
        System.out.print("Reverse Array ");
        for (int a = backArray.length-1;a>=0;a--){
            System.out.print(backArray[a]);
            System.out.print(" ");
        }
    }
    //=====================================================================================

}
