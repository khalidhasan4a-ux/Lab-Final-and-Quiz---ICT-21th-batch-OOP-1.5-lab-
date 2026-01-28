class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(bookId + " " + title + " " + price);
    }
}

public class Interaction   {
    public static void main(String[] args) {

        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", 450);
        books[1] = new Book(2, "OOP", 600);
        books[2] = new Book(3, "DSA", 800);
        books[3] = new Book(4, "DBMS", 520);
        books[4] = new Book(5, "OS", 400);

        double sum = 0;

        for (Book b : books) {
            sum += b.price;
            if (b.price > 500) {
                b.display();
            }
        }

        double avg = sum / books.length;
        System.out.println(avg);
    }
}
