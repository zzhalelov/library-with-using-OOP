public class Book {
    private String title;
    private String author;
    private Subject subject;

    public Book(String title, String author, Subject subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Subject getSubject() {
        return subject;
    }
}