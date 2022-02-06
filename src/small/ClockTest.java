package small;

public class ClockTest {
   public void CLTD(){
        Clock c = new Clock();
        c.setTime("9 march 21:02");
        String tod = c.getTime();
        System.out.println("Время = " + tod);
    }
}
