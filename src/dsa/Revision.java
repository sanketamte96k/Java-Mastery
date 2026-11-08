package dsa;

public class Revision {
    public static void main(String[] args) {

     String name = "MADAM";
     boolean isPalindrame = false;

     String rev = "";

     for (int i=name.length()-1; i>=0; i--) {
         rev = rev + name.charAt(i);

         if (rev.equals(name)) {
             isPalindrame = true;
         }
     }
         if (isPalindrame) {
             System.out.println(name+" is Palindrome");
         }
         else {
             System.out.println(name+" is not a Palindrome");
         }
    }
}