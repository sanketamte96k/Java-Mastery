package collectionframwork;
import java.util.*;
public class RemoveEvenElement {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,15,20,25,30,35,40));
        System.out.println("Original list --> "+num);

        Iterator<Integer> it = num.iterator();

        while(it.hasNext()){
            int numbers = it.next();
            if (numbers % 2 ==0){
                it.remove();
            }
        }
        System.out.println("Final List --> "+num);
    }
}
