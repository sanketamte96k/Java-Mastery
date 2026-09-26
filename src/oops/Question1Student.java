package oops;

public class Question1Student {
    public static void main(String[] args){
        DemoStudent d1 = new DemoStudent("Sanket",21,92);
        DemoStudent d2 = new DemoStudent("Rohan",25,91);
        d1.displayInfo();
        d2.displayInfo();
        d1.setMarks(98);
        d1.setRollNo(1005);
        d1.setName("Sahil");
        System.out.println(d1.getName());
        System.out.println(d1.getMarks());
        System.out.println(d1.getRollNo());
    }
}
class DemoStudent{
    private String name;
    private int rollNo;
    private int marks;

    DemoStudent(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        }
        void displayInfo(){
            System.out.println("Name = "+name);
            System.out.println("Roll No = "+rollNo);
            System.out.println("Marks = "+marks);
        }
        public String getName(){
        return name;
        }
        public int getRollNo() {
                return rollNo;

        }
        public int getMarks(){
            return marks;
        }
        void setMarks(int marks){
        if (marks>=0 && marks<=100){
            this.marks = marks;
        }
        else {
            System.out.println("Please enter valid mark");
        }
        }
        void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
        }
        void setRollNo(int rollNo){
        if (rollNo>=1 && rollNo<=100){
            this.rollNo = rollNo;
        }
        else {
            System.out.println("Please enter valid roll no");
        }
        }
    }

