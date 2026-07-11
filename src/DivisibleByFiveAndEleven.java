import java.util.Scanner;
public class DivisibleByFiveAndEleven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();

        if ((num %5 ==0) && (num%11==0)){
            System.out.println(num+" is Divisible by both 5 and 11");
        }
        else{
            System.out.println("Not divisible by both 5 and 11");
        }
        sc.close();

    }
}
