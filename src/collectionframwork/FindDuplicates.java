package collectionframwork;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,20,30,10,40,20,50));

        System.out.println("List --> "+num);

        HashSet<Integer> seen = new HashSet<>();

        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();

        for (int n : num){
            if (!seen.add(n)){
                duplicates.add(n);
            }
        }
        System.out.println("Duplicate Elements = "+duplicates);


    }
}
