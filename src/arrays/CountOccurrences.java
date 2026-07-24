package arrays;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i =0; i< num.length; i++){
            System.out.print("Enter Element "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter Target Value = ");
        int target = sc.nextInt();

        int count=0;

        for (int i=0; i< num.length; i++){
            if (num[i]==target){
                count = count +1;
            }
        }
        System.out.println(target+" found "+count+" times");
        sc.nextInt();
    }
}