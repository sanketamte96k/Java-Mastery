package advancedjava;

public class MultipleCatchPractice {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50,60};
        System.out.println("Start Program Execution");

        try {
            int result = 10/0;
            System.out.println("Result = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Number");
        }
        finally {
            System.out.println("Program Execution Done");
        }
    }
}
