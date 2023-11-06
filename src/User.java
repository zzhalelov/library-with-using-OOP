abstract class User {
    private String firstName;
    private ReaderTicket ticket;

    public User(String firstName, ReaderTicket ticket) {
        this.firstName = firstName;
        this.ticket = ticket;
    }

    public String getFirstName() {
        return firstName;
    }

    public ReaderTicket getTicket() {
        return ticket;
    }

    public void setTicket(ReaderTicket ticket) {
        this.ticket = ticket;
    }

    public abstract void takeBook(Book book, Library library);
}