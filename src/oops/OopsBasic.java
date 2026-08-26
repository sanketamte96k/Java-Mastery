package oops;

public class OopsBasic {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name= "Sanket";
        s1.age = 21;
        s1.marks = 95.50;

        s2.name = "Rahul";
        s2.age = 20;
        s2.marks = 90.90;

        s1.displayInfo();
        s2.displayInfo();
    }
}
