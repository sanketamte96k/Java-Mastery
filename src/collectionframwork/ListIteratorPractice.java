package collectionframwork;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println();

        ListIterator<Integer> it = numbers.listIterator();
        System.out.println("Forward Traversal");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("BackWord Traversal");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
