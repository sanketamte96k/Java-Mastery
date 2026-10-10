package collectionframwork;
import java.util.LinkedHashSet;
public class HashSetBasicPractice {
    public static void main(String[] args){
        LinkedHashSet<Integer> marks = new LinkedHashSet<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(20);
        marks.add(50);
        marks.add(10);
        System.out.println(marks);
        System.out.println(marks.size());
        marks.remove(30);
        System.out.println(marks);
        System.out.println(marks.contains(50));
    }
}
