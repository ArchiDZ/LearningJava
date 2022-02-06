package URLshorter;

import java.security.MessageDigest;

public class Encript {
    // Числовой массив в шестнадцатеричном формате
    private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        // Шифровать inputString
    public static String md5(String inputStr){
        return encodeByMD5(inputStr);
    }

    /**
     * Убедитесь, что введенный пароль правильный
     * @param password реальный пароль (зашифрованный реальный пароль)
     * @param inputString входная строка
     * результат проверки @return, логический тип
     */
    public static boolean authenticatePassword(String password,String inputString){
        if(password.equals(encodeByMD5(inputString))){
            return true;
        }else{
            return false;
        }
    }

        /// ** MD5 кодирует строку * /
    private static String encodeByMD5(String originString){
        if (originString!=null) {
            try {
                // Создать дайджест сообщения с указанным именем алгоритма
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                // Используем указанный байтовый массив для обновления сводки, а затем завершаем вычисление сводки
                byte[] results = md5.digest(originString.getBytes());
                // Превращаем полученный байтовый массив в строку и возвращаем
                String result = byteArrayToHexString(results);
                return result;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Поворот массива байтов в шестнадцатеричную строку
     * @param b байтовый массив
     * @return шестнадцатеричная строка
     */
    private static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for(int i=0;i<b.length;i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    // Преобразование байта в строку в шестнадцатеричной форме
    private static String byteToHexString(byte b){
        int n = b;
        if(n<0)
            n=256+n;
        int d1 = n/16;
        int d2 = n%16;
        return hexDigits[d1] + hexDigits[d2];
    }
}