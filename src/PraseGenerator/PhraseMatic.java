package PraseGenerator;

import javax.swing.*;

public class PhraseMatic {
    public void PM(){
        String[] wordListOne = {"круглосуточный","трех-звенный","3000 - фунтовый",
        "взаимный","обоюдный выйгрыщ","фронтэнд","на основе веб-технологий",
                "проникающий","умный","глупый","динамический","метод критического пути",
        "хаотичный","сверх естественный","криворукий","приносящий удачу","иррациональный"};

        String [] wordListTwo = {"уполномоченный","трудный","чистый продукт",
                "ориентированный","центральный","распределенный","кластеризованный",
                "фирменный","нестандартный ум","позиционированный","сетевой",
                "сфокусированный", "использованный с выгодой","выровненный","нацеленный на",
                "общий","совместный","прочный","утомленный","премиальный","сбалансированный по",
                "избыточный","несовместимый с "};

        String [] wordListThree = {"процесс","пункт разгрузки","выход из положения",
                "тип структуры","талант","подход","уровень заваоеванного внимания",
                "портал","период времени","обзор","образец",
                "пункт назначения", "шаманский бубен","кубик рубика","палка",
                "кофе","бормотуха","некий артефакт","руки базуки","горелый черенок","картошка",
                "выхухоль","пентагон"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1]+ " "+ wordListTwo[rand2] + " "+wordListThree[rand3];
        //JOptionPane.showMessageDialog(null,"Все, что на нужно - это "+phrase);
        System.out.println("Все, что на нужно - это "+phrase);
    }
}
