import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month to find days in Month = ");
        int month = sc.nextInt();

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Month "+month+" has 31 Days.");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Month "+month+" has 30 Days");
                break;
            case 2 : System.out.println("February has 28 or 29 Days");
            break;
            default:System.out.println("Please Enter Valid Month.");

        }
        sc.close();
    }
}
