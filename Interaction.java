class Book {
    private int bookId;
    private String title;
    private double price;
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    void display() {
        System.out.println(bookId + " " + title + " " + price);
    }
}
public class Interaction {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "Java", 450);
        books[1] = new Book(2, "OOP", 600);
        books[2] = new Book(3, "DSA", 800);
        books[3] = new Book(4, "C", 520);
        books[4] = new Book(5, "Python", 400);
        double sum = 0;
        System.out.println("Books with price greater than 500:");
        for (Book b : books) {
            sum += b.getPrice();
            if (b.getPrice() > 500) {
                b.display();
            }
        }
        double avg = sum / books.length;
        System.out.println("Average Price: " + avg);
    }
}
