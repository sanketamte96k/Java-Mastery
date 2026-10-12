package collectionframwork;
import java.util.Iterator;
import java.util.ArrayList;
public class IteratorBasic {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        numbers.add(10);
        System.out.println("Using  Normal Method ");
        System.out.println(numbers);
        System.out.println();

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()){
            int num = it.next();

            if (num >20){
                it.remove();
            }
        }
        System.out.println("Using Iterator");
        System.out.println(numbers);
    }
}
