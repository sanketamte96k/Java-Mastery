package oops;

public class Student {

        String name;
        int age;
        double marks;
      // ------use Method-----
    void displayInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }
//    ------Use Constructor ----
    Student() {
        System.out.println("Student object created");
    }

}
