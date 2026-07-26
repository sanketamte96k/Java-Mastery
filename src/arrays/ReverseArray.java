package arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i =0; i<num.length; i++){
            System.out.print("Enter Element No. "+(i + 1)+" = ");
            num[i]= sc.nextInt();
        }

        int start = 0;
        int end = num.length - 1;

        while(start < end) {

                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;

                start++;
                end--;
            }
        System.out.print("Reverse array = ");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
