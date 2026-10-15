package collectionframwork;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableBasic {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 75));
        students.add(new Student("Amit", 90));
        students.add(new Student("Sanket", 60));

        Collections.sort(students);

        System.out.println(students);
    }
}
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}