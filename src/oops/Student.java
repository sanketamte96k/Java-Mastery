package oops;

public class Student {

       private String name;
        int age;
        double marks;
      // ------use Method-----
    void displayInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }
//    ------Use Constructor ----
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

        studentCount++;
    }
    static void showStudentCount() {
        System.out.println("Total Students = " + studentCount);
    }
    void showName(){
        System.out.println(this.name);
    }
    static int studentCount = 0;

}
