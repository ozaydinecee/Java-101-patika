import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){
        double perKm=2.20;
        double startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter km for calculating price:");
        double km =input.nextDouble();

        double totalPrice=(km*perKm)+startPrice;
        if(totalPrice<20){
            System.out.println("You need to pay 20 tl");
        }
        else{
            System.out.println("You need to pay "+ totalPrice +" tl");
        }
    }
}
