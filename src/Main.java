public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("");
        Subject history = new Subject("История");

        Book book1 = new Book("Высшая математика", "Автор 1", math);
        Book book2 = new Book("История мира", "Автор 2", history);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        Reader reader = new Reader("Читатель 1");
        Administrator administrator = new Administrator("Администратор 1");

        reader.takeBook(book1, library);
        administrator.takeBook(book2, library);
        administrator.giveBook(book1, library);

        library.listBooks();
    }
}