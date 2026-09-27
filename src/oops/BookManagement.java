package oops;

public class BookManagement {
    public static void main(String[] args){
        Book b1 = new Book("Veer Shivaji","Sanket Amte",599);
        Book b2 = new Book("Java Basics", "James", 799);
        b1.displayInfo();
        b1.borrowBook();
        b1.borrowBook();
        b2.borrowBook();
        b1.returnBook();
        b1.returnBook();
        System.out.println(b1.getPrice());
    }
}
class Book{
    private String title;
    private String author;
    private int price;
    private boolean available;


    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    void displayInfo(){
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
        System.out.println("Price = "+price);
    }
    void borrowBook(){
        if (available == true){
            this.available = false;
            System.out.println("Book Borrow Successfully done");
        }else {
            System.out.println("Book Already Borrow");
        }
    }
    void returnBook(){
        if (available == false){
            this.available = true;
            System.out.println("Book Return Done");
        }
        else {
            System.out.println("Book Already Available");
        }
    }
    int getPrice(){
        return price;
    }
}