package dsa;

public class Revision {
    public static void main(String[] args) {

     String name = "Sanket";

     int vowel = 0;
     int consonants = 0;

     for (int i=0; i< name.length(); i++){

         char ch = Character.toLowerCase(name.charAt(i));

         if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             vowel++;
         }
         else {
             consonants++;
         }
     }
        System.out.println("Vowels = "+vowel);
        System.out.println("Consonants = "+consonants);
    }
}