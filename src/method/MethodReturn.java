package method;

public class MethodReturn {

    static int calculatesum() {
        return 10 + 30;
    }

    public static void main(String[] args) {
        int sum = calculatesum();

        System.out.println("Sum = " + calculatesum());
    }
}