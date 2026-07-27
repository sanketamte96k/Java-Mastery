package arrays;
import java.util.Scanner;
public class RightRotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        for (int i=0; i<num.length; i++){
            System.out.print("Enter Element No "+(i + 1)+"= ");
            num[i] = sc.nextInt();
        }

        int temp = num[num.length - 1];

        for (int i = num.length - 1;i> 0; i--){
            num[i] = num[ i -1];
        }

        num[0] = temp;

        System.out.println("Right Rotated array = ");

        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
