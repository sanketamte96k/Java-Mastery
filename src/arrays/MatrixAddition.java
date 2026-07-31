package arrays;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                System.out.print("Enter element for matrix 1 = ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <matrix2.length ; i++) {
            for (int j=0; j< matrix2[i].length; j++){
                System.out.print("Enter Element for matrix 2 = ");
                matrix2[i][j] = sc.nextInt();
            }

        }
        int[][] result = new int[3][3];

        for (int i=0; i< result.length; i++){
            for (int j=0; j<result[i].length; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
