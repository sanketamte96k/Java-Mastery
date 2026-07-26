package arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element No. "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter Target Element = ");
        int target = sc.nextInt();

        int start = 0;
        int end = num.length -1;
        boolean found = false;

        while (start <= end){
            int mid = (start + end) /2;

            if (target == num[mid]){
                found= true;
                System.out.println(target+" is found at index "+mid);
                break;
            } else if (target > num[mid] ) {
                start = mid + 1;

            }else {
                end = mid - 1;
            }
        }
        if (!found){
            System.out.println(target+" is not found at any index.");
        }
        sc.close();
    }
}
