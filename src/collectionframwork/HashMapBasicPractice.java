package collectionframwork;
import java.util.HashMap;

public class HashMapBasicPractice {
    public static void main(String[] args){

        HashMap<Integer,String> student = new HashMap<>();

        student.put(101,"Sanket");
        student.put(102,"Rohan");
        student.put(103,"Aniket");

        System.out.println(student);
        System.out.println(student.get(102));
        System.out.println(student.put(102,"Sahil"));
        System.out.println(student);
        System.out.println(student.containsKey(103));
    }
}
