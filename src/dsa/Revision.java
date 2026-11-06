package dsa;
import java.util.Scanner;
public class Revision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i=1; i<arr.length;i++){

            if (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(min);
        sc.close();

    }
}