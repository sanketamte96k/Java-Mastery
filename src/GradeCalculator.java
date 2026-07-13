import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks(0-100) = ");
        double marks = sc.nextDouble();
        if (marks<0 || marks>100){
            System.out.println("Invalid Marks.");
        }
        else if (marks >=91){
            System.out.println("Congratulation! You got A Grade.");
        } else if (marks>=75) {
            System.out.println("Congratulation! You got B Grade.");
        } else if (marks >=50) {
            System.out.println("Congratulation! You got C Grade.");
        } else if (marks>=35) {
            System.out.println("Congratulation! You got D Grade.");
        }
        else {
            System.out.println("Sorry! you are Failed");
        }
        sc.close();
    }
}
