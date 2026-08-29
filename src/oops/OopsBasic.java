package oops;

public class OopsBasic {
    public static void main(String[] args){
        Student s1 = new Student("Sanket",21,95.5);
        Student s2 = new Student("Rahul",20,90.9);
        Student s3 = new Student("Ram",19,91.90);

        Student.showStudentCount();
        s1.name = "Sayli";

        s1.displayInfo();
        s2.displayInfo();
        s1.showName();
        s2.showName();
    }
}
