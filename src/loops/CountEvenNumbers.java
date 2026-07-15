package loops;
import java.util.Scanner;
public class CountEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sc.nextInt();

        int count = 0;

        for (int i=2;i<=num;i+=2){
            count = count + 1;
        }
        System.out.println("Total Number of Even Number = "+count);
        sc.close();

    }
}
