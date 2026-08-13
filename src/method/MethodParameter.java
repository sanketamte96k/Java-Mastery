package method;

public class MethodParameter {
    static void PrintNumber(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args){
        PrintNumber(2);
    }
}
