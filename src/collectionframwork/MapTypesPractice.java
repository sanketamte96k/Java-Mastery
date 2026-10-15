package collectionframwork;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTypesPractice {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> student = new LinkedHashMap<>();

        student.put(103,"Rahul");
        student.put(101,"Sanket");
        student.put(102,"Sahil");

        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.values());
        System.out.println(student.entrySet());
        System.out.println();

        System.out.println("TreeMap Starting");

        TreeMap<Integer, String> sortedStudent = new TreeMap<>();

        sortedStudent.put(103, "Rahul");
        sortedStudent.put(101, "Sanket");
        sortedStudent.put(102, "Sahil");

        System.out.println(sortedStudent);

    }
}
