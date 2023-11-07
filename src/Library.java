import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(User user, Book book) {
        try {
            if (books.contains(book)) {
                books.remove(book);
                System.out.println(user.getName() + " взял книгу: " + book.getTitle());
            } else {
                throw new BookNotFoundException("Книга не найдена в библиотеке: " + book.getTitle());
            }
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void lendBook(Administrator administrator, Book book) {
        System.out.println(administrator.getName() + " выдал книгу: " + book.getTitle());
        books.add(book);
    }

    public void returnBook(User user, Book book) {
        System.out.println(user.getName() + " вернул книгу: " + book.getTitle());
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Список доступных книг в библиотеке:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " (Автор: " + book.getAuthor() + ")");
        }
    }
}