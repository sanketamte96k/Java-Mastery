package arrays;
import java.util.Scanner;
public class MoveZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element No "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }

        int j=0;

        for (int i=0; i< num.length; i++){
            if (num[i] != 0){
                num[j] = num[i];
                j++;
            }
        }
        while (j < num.length){
            num[j] = 0;
            j++;
        }

        System.out.print("Array = ");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
