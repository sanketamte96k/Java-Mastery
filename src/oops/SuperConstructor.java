package oops;

public class SuperConstructor {
    public static void main(String args []){
        Son s1 = new Son();
    }
}
class Father{
    Father(){
        System.out.println("Owner of house");
    }
}
class Son extends Father{
    Son(){
        super();
        System.out.println("Belong to father class");
    }
}
