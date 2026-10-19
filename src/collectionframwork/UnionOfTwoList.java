package collectionframwork;
import java.util.*;
public class UnionOfTwoList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30,40,50,60,70));

        System.out.println("List 1 = "+list1);
        System.out.println("List 2 = "+list2);

        LinkedHashSet<Integer> union = new LinkedHashSet<>();

        union.addAll(list1);
        union.addAll(list2);

        System.out.println("Union --> "+union);
    }
}
