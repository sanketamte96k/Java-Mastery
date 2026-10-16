package collectionframwork;
import java.util.*;
public class Que3CommonElement {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        List<Integer> common = new ArrayList<>();

        for (Integer num : list1){
            if (list2.contains(num)){
                common.add(num);
            }
        }
        System.out.println("Common Element --> "+common);
    }
}
