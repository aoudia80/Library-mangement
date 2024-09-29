package library_classes;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Library library= new Library();
        boolean exit= false;
        while (!exit){
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter the book title");
                    String title = scanner.nextLine();
                System.out.print("Enter the book author: ");
                String author = scanner.nextLine();
                Book book = new Book(title, author);
                library.addBook(book);
                break;
                case 2:
                    library.displayBook();
                    break;
                case 3:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }
}