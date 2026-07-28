package arrays;
import java.util.Scanner;
public class SecondLargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        for (int i=0; i<num.length; i++){
            System.out.print("Enter Element "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i< num.length; i++){
            if (num[i] > largest){
                secondLargest = largest;
                largest = num[i];
            } else if (num[i]<largest && num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
        sc.close();
    }

}
