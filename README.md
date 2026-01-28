# Title: Lab Final and Quiz - ICT 21th batch (OOP 1.5 lab)

## Name: Md. Khalid Hasan
## ID: IT24013


## Question 1: Encapsulation & Validation
Design a class Student with private attributes id, name, and cgpa.

Use appropriate getters and setters.

Ensure cgpa is always between 0.0 and 4.0 using validation.

Write a main method to demonstrate object creation and validation.

## Answer:

```
class Student {
    private int id;
    private String name;
    private double cgpa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Md. Khalid Hasan");
        s.setCgpa(3.76);
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
        s.setCgpa(4.88);   
    }
}

```


## Question 2: Inheritance & Method Overriding

Create a superclass Employee with method calculateSalary().
Derive two subclasses:

FullTimeEmployee

PartTimeEmployee

Override calculateSalary() in both subclasses with different logic.
Demonstrate runtime polymorphism using a superclass reference.

## Answer:
```
class Employee {
    double calculateSalary() {
        return 0;
    }
}
class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 45000;
    }
}
class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 63000;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
```


## Question 3: Abstract Class vs Interface
a) Create an abstract class Shape with an abstract method area().
b) Implement two subclasses Circle and Rectangle.
c) Also create an interface Drawable with method draw() and implement it in both classes.
Explain briefly why both abstraction mechanisms are used here.

## Answer:

```
abstract class Shape {
    abstract double area();
}
interface Drawable {
    void draw();
}
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape implements Drawable {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(4);
        Shape s2 = new Rectangle(6, 8);
        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
        Drawable d1 = new Circle(2);
        Drawable d2 = new Rectangle(3, 5);
        d1.draw();
        d2.draw();
    }
}   
```


## Question 4: Exception Handling
Write a Java program that:

Takes two integers from the user

Performs division

Handles ArithmeticException and InputMismatchException properly

Uses a finally block to print "Program Execution Completed"

## Answer:

```
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred");
        } finally {
            System.out.println("Program Execution Completed");
        }
    }
}


```


## Question 5: Object Interaction & Array of Objects
Create a class Book with attributes bookId, title, and price.

Store at least 5 Book objects in an array

Display details of books with price greater than 500

Calculate and display the average price of all books

## Answer:

```
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

```
