import java.util.Scanner;
public class ProfitLoss {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Selling Price = $");
       double sp = sc.nextDouble();

       System.out.print("Enter Cost Price = $");
       double cp = sc.nextDouble();

       double amount =0;

       if (sp==cp){
           System.out.println("NO Profit, No Loss");
       }
       else if(sp>cp){
           amount = sp - cp;
           System.out.println("Profit = $"+amount);
       } else {
           amount = cp - sp;
           System.out.println("Loss = $" + amount);
       }
       sc.close();
   }

}
