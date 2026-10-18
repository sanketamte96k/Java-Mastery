package collectionframwork;
import java.util.*;
public class CommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30,40,50,60,70));

        System.out.println("List 1 --> "+list1);
        System.out.println("List 2 --> "+list2);
        System.out.println();

        HashSet<Integer> set = new HashSet<>(list1);

        ArrayList<Integer> commom = new ArrayList<>();

        for (int num : list2) {
            if (set.contains(num)) {
                commom.add(num);
            }
        }
        System.out.println("Common Element = "+commom);
    }
}
