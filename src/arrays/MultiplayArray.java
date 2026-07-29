package arrays;
import java.util.Scanner;
public class MultiplayArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];


        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element No "+(i +1)+" = ");
            num[i] = sc.nextInt();
        }
        for (int i=0; i< num.length; i++){
            int newelement = num[i] * 10;
            System.out.println(newelement);

        }
        sc.close();
    }
}
