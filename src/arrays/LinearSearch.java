package arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];


        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element "+(i +1)+" = ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter target Value = ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i=0; i< num.length; i++){
            if (num[i]==target){
                found = true;
                System.out.println(target+" is found at index "+i);
                break;
            }
            }
        if (!found){
            System.out.println(target+" is not found at any index.");
            sc.nextInt();
        }



    }
}
