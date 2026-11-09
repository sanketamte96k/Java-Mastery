package dsa;

public class Revision {
    public static void main(String[] args) {

     String name = "PROGRAMMING";
     int count =0;
     int target = 'G';

     for (int i=0; i<name.length();i++){
         if (name.charAt(i)==target){
             count++;
         }
     }
        System.out.println(target+" Occurs "+count+" times");

    }
}