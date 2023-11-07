public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Математика", "Евклид");
        Book book2 = new Book("История мира", "Геродот");
        Book book3 = new Book("Физика", "Исаак Ньютон");
        Book book4 = new Book("Экология", "Грета Тунберг");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        Reader reader = new Reader("Читатель Прилежный");
        Administrator administrator = new Administrator("Администратор библиотеки");

        reader.takeBook(book1, library);
        reader.takeBook(book2, library);
        System.out.println("----------------------------");
        library.listBooks();
        System.out.println("----------------------------");
        reader.listBooksOnHands();
        System.out.println("----------------------------");
        reader.returnBook(book2, library);
        System.out.println("----------------------------");
        library.listBooks();
    }
}