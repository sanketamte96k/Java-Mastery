package collectionframwork;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTypesPractice {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> student = new LinkedHashMap<>();

        student.put(103,"Rahul");
        student.put(101,"Sanket");
        student.put(102,"Sahil");
        student.put(105,"Sunil");

        System.out.println(student.size());
        System.out.println(student.remove(103));
        System.out.println(student.size());
        student.clear();
        System.out.println(student.isEmpty());

        System.out.println("TreeMap Starting");

        TreeMap<Integer, String> sortedStudent = new TreeMap<>();

        sortedStudent.put(103, "Rahul");
        sortedStudent.put(101, "Sanket");
        sortedStudent.put(102, "Sahil");

        System.out.println(sortedStudent);

    }
}
