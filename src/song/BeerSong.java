package song;

public class BeerSong {
    public void Bs(){
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while(beerNum>0){
           if(beerNum == 1){
               word = "бутылка";
           }
           System.out.println(beerNum+" "+word+" пива на борту");
           System.out.println(beerNum+ " " +word+ " пива");
           System.out.println("Одну возьми");
           System.out.println("По кругу пусти");
           beerNum=beerNum-1;
           if(beerNum>0){
               System.out.println(beerNum+" "+word+" пива на борту");
           }else {
               System.out.println("Нет бутылок пива на борту");
           }
        }
    }
}
