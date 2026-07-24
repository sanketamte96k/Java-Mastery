package arrays;
import java.util.Scanner;
public class LastOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num =new int[10];

        for (int i =0; i< num.length; i++){
            System.out.print("Enter Element "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter Target Value = ");
        int target = sc.nextInt();

        int lastIndex= -1;
        for (int i =0; i< num.length; i++){
            if (num[i]==target){
                lastIndex = i;
            }
        }
        if (lastIndex==-1){
            System.out.println(target+" is not found at any index");
        }
        else {
            System.out.println(target+" has last Occurance at index "+lastIndex);
        }
        sc.close();
    }
}
