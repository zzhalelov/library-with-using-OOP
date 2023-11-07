import java.util.ArrayList;
import java.util.List;

public class Reader extends User {
    private List<Book> booksOnHand = new ArrayList<>();

    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book, Library library) {
        library.borrowBook(this, book);
        booksOnHand.add(book);
    }

    public void returnBook(Book book, Library library) {
        library.returnBook(this, book);
        booksOnHand.remove(book);
    }

    public List<Book> getBooksOnHand() {
        return booksOnHand;
    }

    public void listBooksOnHands() {
        System.out.println("Список книг у читателя на руках: ");
        for (Book book : booksOnHand) {
            System.out.println(book.getTitle() + " (Автор: " + book.getAuthor() + ")");
        }
    }
}