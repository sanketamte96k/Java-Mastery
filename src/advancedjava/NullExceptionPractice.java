package advancedjava;

public class NullExceptionPractice {
    public static void main(String[] args){
        String name = null;

        System.out.println("Program Execution Started ");
        try {
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Can not Acces null Object");
        }
        System.out.println("Program Execution done");
    }
}
