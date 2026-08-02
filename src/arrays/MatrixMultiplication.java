package arrays;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int columes = 3;
        int[][] matrix1 = new int[rows][columes];
        int[][] matrix2 = new int[rows][columes];

        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length;j++){
            System.out.print("Enter Element for Matrix 1 = ");
            matrix1[i][j] = sc.nextInt();
        }
        }
        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2[i].length;j++){
                System.out.print("Enter Element for Matrix 2 = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[rows][columes];

        for (int i=0; i< result.length; i++){
            for (int j=0; j<result[i].length; j++){
                for (int k=0; k<matrix1[0].length;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();


    }

}
