package method;

public class MethodReturn {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int square = square(7);

        System.out.println("Square = "+square);
    }
}