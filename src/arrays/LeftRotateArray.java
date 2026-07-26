package arrays;

import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        // Input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter Element No. " + (i + 1) + " = ");
            num[i] = sc.nextInt();
        }

        // Save the first element
        int temp = num[0];

        // Shift elements to the left
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = num[i + 1];
        }

        // Put the saved element at the end
        num[num.length - 1] = temp;

        // Print the rotated array
        System.out.print("Left Rotated Array = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        sc.close();
    }
}