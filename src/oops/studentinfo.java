package oops;

public class studentinfo {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();

        s1. name = "Sanket";
        s1. age = 21;
        s1. course = "b.tech";
        s1.rollNo = 2104;

        s2.name = "Rohan";
        s2.age = 22;
        s2.course = "B.tech";
        s2.rollNo = 2105;

        s1.markAttendence();
        s1.displayInfo();

    }
}
class student{
    String name;
    int age;
    String course;
    int rollNo;

    void markAttendence(){
        System.out.println("Attendence marked by "+name);
    }

    void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Course = "+course);
        System.out.println("RollNO"+rollNo);

    }
}