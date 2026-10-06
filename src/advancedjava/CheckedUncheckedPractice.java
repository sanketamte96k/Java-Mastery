package advancedjava;

public class CheckedUncheckedPractice {
    public static void main(String[] args){
        int a =10;
        int b = 0;

        System.out.println("Program Start Running");
        try{
            int result = a / b;
            System.out.println("Result = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divided by zero");
        }
        finally {
            System.out.println("Program Execution Done");
        }
    }
}
