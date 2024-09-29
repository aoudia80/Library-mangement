package library_classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // create a method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // display all books in the library
    public void displayBook() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + "by" + book.getAuthor() + " - "
                        + (book.isAvailable() ? "Available" : "Borrowed"));
            }
        }
    }

    // Borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}
