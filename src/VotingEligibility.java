import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        if (age<=0){
            System.out.println("Please enter valid age!");
        } else if (age>=18) {
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not eligible for vote");
        }


        sc.close();
    }
}
