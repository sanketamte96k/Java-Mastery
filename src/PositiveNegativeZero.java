import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num = ");
        int num = sc.nextInt();

        if (num>0){
            System.out.println(num+" is a Positive no.");
        } else if (num<0) {
            System.out.println(num+" is a Negative no.");
        }else {
            System.out.println(num+" The Entered no is Zero");
        }
        sc.close();

    }
}
