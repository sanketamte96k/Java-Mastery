package advancedjava;

public class FinallyPractice {
    public static void main(String[] args){
        System.out.println("Program Start Execution");
        try{
            int result = 10 / 2;
            System.out.println("Result = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divided by zero");
        }
        finally {
            System.out.println("Program Execution Completed");
        }
    }
}
