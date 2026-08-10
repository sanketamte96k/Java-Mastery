package arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0; i< arr.length; i++) {
            System.out.print("Enter Element No " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }
            System.out.print("Enter Target Element = ");
            int target = sc.nextInt();

        boolean found = false;

        for (int i=0; i< arr.length; i++){
            if (arr[i] == target){
                found = true;
                System.out.print(target+" is found at index "+i);
                break;
            }
        }
        if (!found){
            System.out.print(target+" is not found at any index");
        }
        sc.close();
    }
}