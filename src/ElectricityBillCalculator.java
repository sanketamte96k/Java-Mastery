import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Unit = ");
        int unit = sc.nextInt();

        double bill;


        if (unit<0){
            System.out.println("Invalid unit.");
        } else if (unit<=100) {
            bill = unit*1.50;
            System.out.println("Electricity bill = $"+bill);
        } else if (unit<=200) {
            bill = unit*2.50;
            System.out.println("Electricity bill = $"+bill);

        } else if (unit<=300) {
            bill = unit*4.0;
            System.out.println("Electricity bill = $"+bill);
        }else {
            bill = unit*6;
            System.out.println("Electricity bill = $"+bill);
        }
        sc.close();
    }
}
