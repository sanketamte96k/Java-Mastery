package arrays;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element :" );
        int[] num = new int[5];

        int sum=0;

        for (int i=0; i< num.length; i++){
            num[i]= sc.nextInt();
            sum= sum+num[i];


        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
