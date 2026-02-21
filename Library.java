import java.util.Date;
import java.util.Scanner;

class Book {
    public String title;
    public String author;
    public Date issueDay;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
        this.issueDay = new Date(); // Automatically sets current time
    }

    public void display() {
        System.out.println("Book name: " + title + ", author: " + author + " issueDay: " + issueDay);
    }
}

public class Library { 
    public static Book[] books = new Book[3]; 

    public static void main(String[] args) {
        
        // public BookIssue
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter Book Name: ");
            String bookName = scanner.nextLine();

            System.out.println("Enter Author Name: ");
            String author = scanner.nextLine();

            books[i] = new Book(("bookName"+1), ("author"+1));
            books[i] = new Book(bookName, author);
        }

        
        int nowIndex = 0;
        for (int i = 1; i < books.length; i++) {
            
            if (books[i].issueDay.before(books[nowIndex].issueDay)) {
                nowIndex = i;
            }
        }

        System.out.println("\nMost recently issued book:");
        books[nowIndex].display();

        scanner.close(); 
    }
}
