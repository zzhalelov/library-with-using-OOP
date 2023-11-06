public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Математика");
        Subject history = new Subject("История");

        Book book1 = new Book("Математика 101", "Автор 1", math);
        Book book2 = new Book("История мира", "Автор 2", history);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        ReaderTicket mathTicket = new ReaderTicket(123);
        ReaderTicket historyTicket = new ReaderTicket(456);

        Reader reader = new Reader("Читатель 1", mathTicket);
        Administrator administrator = new Administrator("Администратор 1", historyTicket);

        reader.takeBook(book1, library);
        administrator.takeBook(book2, library);
        administrator.giveBook(book1, library);

        library.listBooks();
    }
}