package arrays;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 element : ");
        int[] num = new int[5];


        for (int i =0; i< num.length; i++) {
            num[i] = sc.nextInt();
        }
        int largest = num[0];
        for (int i=1; i< num.length; i++){
            if (num[i]>largest){
                largest= num[i];
            }
        }
        System.out.println("Largest = "+largest);
        sc.close();
        }
    }

