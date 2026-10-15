package collectionframwork;
import java.util.ListIterator;
import java.util.ArrayList;

public class PracticeListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println();

        ListIterator<Integer> it =  numbers.listIterator();

        while (it.hasNext()){
            int num = it.next();
            if (num == 20){
                it.set(25);
            }
            System.out.println(num);
        }
    }
}
