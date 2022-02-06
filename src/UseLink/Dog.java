package UseLink;

public class Dog {
    int size;
    String name;
    public void doghy(){
        Dog dog1 = new Dog();
        dog1.size = 70;
        dog1.bark(2);
        dog1.name = "Барт";

        Dog[] myDog= new Dog[3];

        myDog[0]= new Dog();
        myDog[1] = new Dog();
        myDog[2] = dog1;

        myDog[0].name = "Шарик";
        myDog[0].size = 8;
        myDog[1].name = "Жорж";
/*
        Dog dog2 = new Dog();
        dog2.name = "Bucky";
        dog2.size = 35;
        dog2.bark(3);
*/
        System.out.println("Имя последней собаки - ");
        System.out.println(myDog[2].name);

        int x = 0;
        while(x< myDog.length){
            myDog[x].bark(2);
            x=x+1;
        }

    }
    public void bark(int numOfBark){
        while(numOfBark>0) {
            if (size > 60) {
                System.out.println(name + " Сказал Гав-гав!");
            } else if (size < 14) {
                System.out.println(name + " ВУФ-ВУФ!");
            } else {
                System.out.println(name + " тяф-тяф!!!");
            }
            numOfBark=numOfBark-1;
        }
    }
}
