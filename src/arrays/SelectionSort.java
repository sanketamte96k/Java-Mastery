package arrays;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element = "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }

        for (int i=0; i< num.length-1; i++){
            int minIndex= i;
            for (int j=i+1; j< num.length; j++){
                if (num[j]< num[minIndex]){
                    minIndex=j;
                }
            }
            int temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;
        }
        System.out.print("Sorted Element = ");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        sc.close();

    }
}
