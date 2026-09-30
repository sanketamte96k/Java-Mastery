package oops;

public class DemoAnimal {
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new cat();
        Animal a3 = new Animal();
        a1.sound();
        a2.sound();
        a3.sound();;

    }
}
class Animal {
    void sound() {
        System.out.println("Animal make sound");
    }
}
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog bark");
        }
    }
        class cat extends Animal{
            void sound(){
                System.out.println("Cat Meows");
            }
        }