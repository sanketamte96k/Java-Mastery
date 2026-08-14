package method;

public class MethodReturn {

    static int getAge() {
        return 21;
    }

    public static void main(String[] args) {
        int Age = getAge();

        System.out.println("Age = " + Age);
    }
}