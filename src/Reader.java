public class Reader extends User {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book, Library library) {
        library.takeBook(this, book);
    }
}