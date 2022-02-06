package animals;

public class GooDogTest {
    public void GDT(){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog tree = new GoodDog();
        tree.setSize(22);
        System.out.println("Первая собака: "+one.getSize());
        System.out.println("Вторая собака: "+two.getSize());
        System.out.println("Третья собака: "+tree.getSize());
        one.bark();
        two.bark();
        tree.bark();
    }
}
