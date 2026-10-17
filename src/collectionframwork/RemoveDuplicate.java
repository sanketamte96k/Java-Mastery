package collectionframwork;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,20,10,30,40,20,50));

        System.out.println("Original List --> "+num);

        ArrayList<Integer> unique = new ArrayList<>(new LinkedHashSet<>(num));

        System.out.println("Unique Element = "+unique);

    }
}
