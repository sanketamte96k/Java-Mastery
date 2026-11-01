package generics;

public class Data {
    public static <T> T getData(T Data){
        return Data;
    }

    public static void main(String[] args) {
        Integer num = getData(100);
        Double num2 = getData(101.10);
        String name = getData("Sanket");

        System.out.println(num);
        System.out.println(num2);
        System.out.println(name);
    }
}

