Глава 12 Вариант A задание 2
Выполнил: Торяшиев Жаргал

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Книга 1", true));
        library.addBook(new Book("Книга 2", false));
        library.addBook(new Book("Книга 3", true));
        Reader reader1 = new Reader("Маша");
        Reader reader2 = new Reader("Пётр");
        library.displayBooks();
        library.borrowBook(reader1, "Книга 1");
        library.borrowBook(reader2, "Книга 2");
        library.displayBooks();
        library.returnBook(reader1, "Книга 1");
        library.displayBooks();
    }
}
