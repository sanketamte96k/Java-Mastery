import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vowel or Consonant = ");
        char letter = sc.next().charAt(0);

        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') {
            System.out.println(letter+" is Vowels");
        }
          else{
            System.out.println(letter+" is consonant");
        }
          sc.close();
    }
}
