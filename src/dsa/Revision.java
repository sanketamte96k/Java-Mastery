package dsa;

public class Revision {
    public static void main(String[] args) {

    String name = "Hello My self Sanket Amte";

    String result = "";

    for (int i=0; i<name.length();i++){
        if (name.charAt(i)!=' '){
            result = result + name.charAt(i);
        }
    }
        System.out.println(result);
    }
}