package Cinema;

public class MovieTest {
    public void TestDrive(){
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title="Потерянный в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie tree = new Movie();
        tree.title = "Байт клуб";
        tree.genre = "Трагедия, но в целом веселая";
        tree.rating = 127;
    }
}
