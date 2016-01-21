package Strategy;

/**
 * Created by wei on 16/1/20.
 */
public class Context {
    private Book book;

    public Context(Book book){
        this.book = book;
    }

    public void getBookToRead(){
        book.ReadBook();
    }
}
