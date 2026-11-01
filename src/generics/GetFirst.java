package generics;

public class GetFirst {
    public static <T> T getFirst(T[] getFirst){
        return getFirst[0];
    }

    public static void main(String[] args) {
        Integer[] num = {10,20,30};
        String[] name = {"Sanket","Sahil","OM"};

        System.out.println(getFirst(name));
        System.out.println(getFirst(num));
    }
}
