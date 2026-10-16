package collectionframwork;
import java.util.*;
public class Que1ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); {
            System.out.println(num);

            System.out.println(num.add(60));
            System.out.println("After Adding 60 --> "+num);
            num.add(2,25);
            System.out.println("After Adding At Index 2 --> "+num);
            num.set(0,5);
            System.out.println("After Replacing At index 0 --> "+num);
            num.remove(Integer.valueOf(40));
            System.out.println("After Removing 40 --> "+num);
            System.out.println("Size of List --> "+num.size());
        }
    }
}
