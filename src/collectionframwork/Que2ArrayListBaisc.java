package collectionframwork;
import java.util.*;
import java.util.Iterator;
public class Que2ArrayListBaisc {
    public static void main(String[] args) {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();
        num.add(10);
        num.add(20);
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(40);
        num.add(50);

        System.out.println(num);

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            int number = it.next();

            System.out.println(number);
        }
    }
}
