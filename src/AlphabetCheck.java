import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Charector = ");
        char letter = sc.next().charAt(0);

        if (letter >='A' && letter<='Z' || letter>='a' && letter<='z'){
            System.out.println(letter+" is an Alphabet.");
        }
        else {
            System.out.println(letter+" is not an Alphabet.");
        }
        sc.close();
    }
}
