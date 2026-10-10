package collectionframwork;
import java.util.LinkedList;
public class LinkedListBasic {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.addFirst(5);
        System.out.println(numbers);
        numbers.addLast(50);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println(numbers.getLast());
        System.out.println(numbers.get(2));
        numbers.set(1,100);
        System.out.println(numbers);
    }
}
