package method;

public class twoParameterMethod {

    static void studentmark(int math, int java, int DBMS){
        System.out.println("Math ="+math);
        System.out.println("Java ="+java);
        System.out.println("DBMS ="+DBMS);
        System.out.println("Total ="+(math+java+DBMS));
    }
    public static void main(String[] args){
        studentmark(95,90,93);
    }
}
