package library_classes;


public class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {

        return isAvailable;
    }
    // borrow book
    public void borrowBook(){
        if (isAvailable){
            isAvailable=false;
            System.out.println("You have borrowed the book: " + title);
        }else {
            System.out.println("Sorry the book is not available.");
        }
    }
    // return book
    public void returnBook(){
        isAvailable = true;
        System.out.println("You have returned the book: "+ title);
    }
}
