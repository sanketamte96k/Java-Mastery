import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Operator(+,-,*,/,%) =");
        char operator = sc.next().charAt(0);
        System.out.print("Enter Second Number = ");
        int num2 = sc.nextInt();

        switch (operator){
            case '+' : System.out.println("Answer = "+(num1+num2));
            break;
            case '-' : System.out.println("Result = "+(num1 - num2));
            break;
            case '*' : System.out.println("Answer = "+(num1*num2));
            break;
            case '/' : if (num2==0){
                System.out.println("Can not divided by Zero");
            }
            else {
                System.out.println("Answer = "+(num1/num2));
            }
            break;
            case '%' : System.out.println("Result = "+(num1 % num2));
            break;
            default: System.out.println("Invalid Operator");
        }
        sc.close();
    }

}
