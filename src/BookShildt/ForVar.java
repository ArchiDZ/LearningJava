package BookShildt;

public class ForVar {
    public static void forovar(){
        int sum = 0;
        int fact = 1;
        //вычисление факториала чисел от 1 до 5
        for (int i = 1; i<=5;i++){
            sum+=i;
            fact*=i;
        }
        System.out.println("Сумма "+sum);
        System.out.println("Факториал "+fact);
    }
}
