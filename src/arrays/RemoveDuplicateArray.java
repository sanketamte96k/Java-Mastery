package arrays;
import java.util.Scanner;
public class RemoveDuplicateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter element No "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }
        int j=1;

        for (int i=1; i < num.length; i++){
            if (num[i] != num[i - 1]){
                num[j] = num[i];
                j++;
            }
        }
        System.out.print("Array become = ");
        for (int i=0; i<j; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.print("Number of unique element = "+ j);
        sc.close();
    }

}
