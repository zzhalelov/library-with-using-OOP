import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void takeBook(User user, Book book) {
        try {
            if (books.contains(book)) {
                if (user.getTicket() != null && user.getTicket().getTicketNumber() == book.getSubject().getTicketNumber()) {
                    books.remove(book);
                    System.out.println(user.getFirstName() + " взял книгу: " + book.getTitle());
                } else {
                    throw new ReaderTicketMismatchException("Читательский билет не совпадает с номером предмета: " + book.getSubject().getTicketNumber());
                }
            } else {
                throw new BookNotFoundException("Книга не найдена в библиотеке: " + book.getTitle());
            }
        } catch (ReaderTicketMismatchException e) {
            System.err.println(e.getMessage());
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void giveBook(Administrator administrator, Book book) {
        System.out.println(administrator.getFirstName() + " выдал книгу " + book.getTitle());
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Список книг в библиотеке:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " (Автор: " + book.getAuthor() + ", Предмет: " + book.getSubject().getName() + ")");
        }
    }
}