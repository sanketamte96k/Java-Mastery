package arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element "+(i+1)+" = ");
            num[i] = sc.nextInt();
        }

        for (int i=0; i< num.length -1; i++){
            for (int j=0; j<num.length-1-i; j++){

                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Element =");

        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
