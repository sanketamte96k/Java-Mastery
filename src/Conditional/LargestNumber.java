import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number =" );
        int num2 =sc.nextInt();
        System.out.print("Enter Third Number = ");
        int num3 = sc.nextInt();

        if (num1==num2&&num2==num3){
            System.out.println("All the three numbers are same");
        } else if (num1>=num2 && num1>=num3) {
            System.out.println(num1+" is the Largest Number");
        }
        else if (num2>=num1&&num2>=num3){
            System.out.println(num2+" is the largest number.");
        }
        else {
            System.out.println(num3+" is the largest number");
        }
        sc.close();
    }

}