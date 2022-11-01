import java.util.Scanner;

public class CalculatorForKDV {
    public static void main(String[] args){
         double cost,KDV,costWithKDV;

         Scanner input=new Scanner(System.in);
         System.out.println("Enter the cost:");
         cost=input.nextInt();

         if(cost>0 && cost<1000) {
             //calculations for KDV and cost with KDV
             KDV = (cost * 18) / 100;
         }
         else{
             KDV= (cost * 8) / 100;
         }
         costWithKDV =   KDV+cost;

        System.out.println("You entered this cost "+cost);
        System.out.println("KDV value "+KDV);
        System.out.println("Cost with KDV is "+costWithKDV);


    }
}
