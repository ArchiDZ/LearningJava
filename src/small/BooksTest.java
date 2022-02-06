package small;

public class BooksTest {
    public void BT(){
        Books [] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks [0].title = "Плоды Джава";
        myBooks [1].title = "Джа Гетсби";
        myBooks [2].title = "Сборник рецептов по Джава";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Дилинджер";

        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" , автор ");
            System.out.println(myBooks[x].author);
            x=x+1;
        }
    }
}
