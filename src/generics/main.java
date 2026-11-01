package generics;

public class main {
    public static void main(String[] args) {
        box<Integer> num = new box<>();
        num.setValue(100);
        System.out.println(num.getValue());

        box<Double> num2 = new box<>();
        num2.setValue(12.18);
        System.out.println(num2.getValue());

        box<String> name = new box<>();
        name.setValue("Sanket");
        System.out.println(name.getValue());
    }
}
class box<T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}