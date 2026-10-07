package exceptionhandling;

public class ThrowsPractice {

    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age is invalid");
        }

        System.out.println("You are eligible");
    }
    public static void divide(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("Can not Divided by Zero");
        }else {
            int result = a / b;
            System.out.println("Result = "+result);
        }

    }

    public static void main(String[] args) {

        try {
            divide(10,0);
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }


    }
}