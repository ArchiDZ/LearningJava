package small;

import java.util.Random;

public class Otpi {
    static char[] OTP (int len){
        System.out.println("Генерация OTP кода случайным образом");
        System.out.print("Твой OTP код: ");
        String numbers="0123456789";
        Random rnd_method = new Random();
        char [] otp = new char[len];
        for (int i = 0; i<len;i++){
            otp [i] = numbers.charAt(rnd_method.nextInt(numbers.length()));
        }
        return otp;
    }
    public int giveOtp(int lenght){
        System.out.println(OTP(lenght));
        return lenght;
    }
}
