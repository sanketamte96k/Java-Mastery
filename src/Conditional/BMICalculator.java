import java.util.Scanner;
public class BMICalculator {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Weight (Kg) = ");
    double weight = sc.nextDouble();
    System.out.print("Enter Height (m) = ");
    double height = sc.nextDouble();

    double bmi = weight / (height * height);

    if (bmi < 18.5){
        System.out.println("BMI = ");
        System.out.println(bmi+"Category = Underweight");
    } else if (bmi>=18.5 && bmi< 24.9) {
        System.out.println("BMI = "+bmi);
        System.out.println(bmi+"Category = Normal weight ");
    } else if (bmi>=25 && bmi<29.9) {
        System.out.println("BMI = "+bmi);
        System.out.println(bmi+"Category = Overweight ");
    }
    else {
        System.out.println("BMI = ");
        System.out.println("Category = Obese");
    }
    sc.close();
}
}
