public class Administrator extends User {
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book, Library library) {
        library.takeBook(this, book);
    }

    public void giveBook(Book book, Library library) {
        library.giveBook(this, book);
    }
}