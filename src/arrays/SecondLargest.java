package arrays;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element No. "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }

        int largest =num[0];
        int secondlargest= num[0];

        for (int i=0; i< num.length; i++){
            if (num[i]>largest){
            secondlargest = largest;
            largest = num[i];
            }
            else if (num[i]<largest && num[i]> secondlargest){
                secondlargest = num[i];
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondlargest);
        sc.close();
    }
}
