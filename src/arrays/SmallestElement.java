package arrays;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 element = ");
        int[] num = new int[5];


        for (int i= 0 ; i<num.length; i++){
             num[i] = sc.nextInt();
        }
        int smallest = num[0];

        for (int i=1; i< num.length; i++){
            if (num[i]<smallest){
                smallest = num[i];
            }
        }
        System.out.println("Smallest = "+smallest);
        sc.close();
    }
}
