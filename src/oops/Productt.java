package oops;

public class Productt {
    public static void main(String[] args){
        Items[] products = {
                new Electronics("Laptop",50000,2),
                new Cloths("T-Shirt",400,"L")
        };
        for (Items i : products){
            if (i instanceof Cloths) {
                i.displayInfo();
                System.out.println("Discount = " + i.calculateDiscount());
            }
        }
    }
}
class Items{
   protected String name;
   protected double price;
    Items(String name,double price){
        this.name = name;
        this.price = price;
    }

    void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Price = "+price);
    }
    double calculateDiscount(){
        return price * 0.05;
    }
}
class Electronics extends Items{
   protected int warrantyYear;
    Electronics(String name, double price, int warrantyYear){
        super(name,price);
        this.warrantyYear = warrantyYear;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Warranty = "+warrantyYear+" Years");
    }
    double calculateDiscount(){
        return price * 0.10;
    }
}
class Cloths extends Items{
    protected String size;
    Cloths(String name, double price,String size){
        super(name,price);
        this.size = size;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Size = "+size);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}