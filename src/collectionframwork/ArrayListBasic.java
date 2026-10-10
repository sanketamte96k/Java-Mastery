package collectionframwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(List.of(21,22,23,24));
        System.out.println(numbers);
        numbers.add(25);
        System.out.println(numbers);
        numbers.addAll(List.of(26,27));
        System.out.println(numbers);
        numbers.remove(List.of(24));
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(23));
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.set(1,500);
        System.out.println(numbers);
        System.out.println(numbers.contains(27));
        System.out.println(numbers.indexOf(24));
    }
}
