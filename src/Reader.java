public class Reader extends User {
    public Reader(String firstName, ReaderTicket ticket) {
        super(firstName, ticket);
    }

    @Override
    public void takeBook(Book book, Library library) {
        library.takeBook(this, book);
    }
}