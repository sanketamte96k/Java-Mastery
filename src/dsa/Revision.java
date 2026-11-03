package dsa;
import java.util.Scanner;
public class Revision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Element = ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Element = ");
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
