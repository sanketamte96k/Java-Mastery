package arrays;

import java.util.Scanner;

public class AlterneteArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];


        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element No "+(i + 1)+" = ");
            num[i] = sc.nextInt();
        }
        int i=0;
        int j= num.length -1;

        while (i <= j) {
            if (i == j) {
                System.out.print("Array = " + num[i]);
            } else {
                System.out.print(num[i]);
                System.out.print(num[j]);
                i++;
                j--;
            }
        }

    }
}
