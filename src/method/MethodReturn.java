package method;

public class MethodReturn {

    static int calculatesum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = calculatesum(10, 20);

        System.out.println(sum);
    }
}