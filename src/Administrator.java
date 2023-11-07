public class Administrator extends User {
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book, Library library) {
        library.borrowBook(this, book);
    }

    public void lendBook(Book book, Library library) {
        library.lendBook(this, book);
    }
}