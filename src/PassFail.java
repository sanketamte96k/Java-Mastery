import java.util.Scanner;
public class PassFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks(0-100) = ");
        int marks = sc.nextInt();

        if (marks<0 || marks>100 ){
            System.out.println("Please enter valid marks(0-100)");
        } else if (marks==100) {
            System.out.println(marks+" Congratulation! you got Full Marks");

        } else if (marks>=35) {
            System.out.println("Congratulation! You passed.");
        }
        else {
            System.out.println("Sorry! you failed.");
        }
        sc.close();
    }
}
