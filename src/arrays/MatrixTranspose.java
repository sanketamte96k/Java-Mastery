package arrays;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int col = 3;
        int[][] matrix = new int[rows][col];

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
               System.out.print("Enter Element = ");
               matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = new int[rows][col];
        for (int i=0; i< matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
                System.out.print(transpose[j][i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
