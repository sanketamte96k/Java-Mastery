package collectionframwork;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,20,30,40,20,10,50));
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        System.out.println("List --> "+num);
        Collections.sort(num);
        System.out.println("Sorting list --> "+num);

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            int number = it.next();
            if (number > largest){
                Secondlargest = largest;
                largest = number;
            } else if (number< largest && number >Secondlargest) {
                Secondlargest = number;
            } else if (largest == Secondlargest) {
                System.out.println("Largest and Second Largest Both have Same Element");
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+Secondlargest);
        }
    }

