package generics;

public class StudentInfo {
    public static void main(String[] args) {
        student<Integer,String> s1 = new student<>();
        s1.setMark(85);
        s1.setName("Sanket");
        System.out.println(s1.getMark());
        System.out.println(s1.getName());
        student<Integer,String> s2 = new student<>();
        s2.setName("Sahil");
        s2.setMark(82);
        System.out.println(s2.getName());
        System.out.println(s2.getMark());

    }
}
class student<T,U>{
    T mark;
    U name;

    void setMark(T mark){
        this.mark=mark;
    }
    void setName(U name){
        this.name= name;
    }
    T getMark(){
        return mark;
    }
    U getName(){
        return name;
    }
}
