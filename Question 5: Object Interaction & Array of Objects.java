class Book {
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(101, "Java Basics", 450);
        books[1] = new Book(102, "OOP Concepts", 650);
        books[2] = new Book(103, "Data Structures", 800);
        books[3] = new Book(104, "Database Systems", 500);
        books[4] = new Book(105, "Operating System", 700);

        double sum = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i].price > 500) {
                System.out.println(books[i].bookId);
                System.out.println(books[i].title);
                System.out.println(books[i].price);
            }
            sum = sum + books[i].price;
        }

        double average = sum / books.length;
        System.out.println("Average Price: " + average);
    }
}
