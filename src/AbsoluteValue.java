import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sc.nextInt();

        int AbsolateValue;

        if (num<0){
            AbsolateValue= num *-1;
        }
        else {
            AbsolateValue=num;
        }
        System.out.println("Result ="+AbsolateValue);
    }
}
