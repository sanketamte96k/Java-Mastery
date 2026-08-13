package method;

public class MethodParameter {
    static void PrintNumber(int n){
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        PrintNumber(10);
    }
}
