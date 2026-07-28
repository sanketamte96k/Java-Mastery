package arrays;
import java.util.Scanner;
public class CheckSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        for (int i=0; i< num.length; i++){
            System.out.print("Enter Element "+(i + 1)+" =");
            num[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i=0; i<num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                sorted = false;
                break;
            }
        }
            if (sorted){
                System.out.println("The given array is sorted.");
            }
            else {
                System.out.println("The given array is not sorted.");
            }
            sc.close();
        }
    }
