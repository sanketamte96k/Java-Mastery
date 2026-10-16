package collectionframwork;
import java.util.*;
public class MoveZeroEnd {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,4,0,2,0,5,7,0,9,3));

        int countzero = 0;

        System.out.println("Original List --> "+number);

        Iterator<Integer> it = number.iterator();

        while (it.hasNext()){
            int num = it.next();
            if (num == 0){
                it.remove();
                countzero++;
            }
        }
        for (int i=0; i<countzero; i++){
            number.add(0);
        }
        System.out.println("List After remove Zero --> "+number);
    }
}
