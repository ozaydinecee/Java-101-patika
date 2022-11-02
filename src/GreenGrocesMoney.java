import java.util.Scanner;

public class GreenGrocesMoney {
    public static void main(String[] args) {
        double applePerKG = 2.14;
        double pearPerKG= 3.67;
        double tomatoesPerKG= 1.11;
        double eggplantPerKG = 5.00;
        double bananaPerKG= 0.95;
        int apple,banana,eggplant,tomatoes,pear;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kilos of apple?");
        apple=input.nextInt();
        System.out.println("How many kilos of pear?");
        pear=input.nextInt();
        System.out.println("How many kilos of tomatoes?");
        tomatoes=input.nextInt();
        System.out.println("How many kilos of eggplant?");
        eggplant=input.nextInt();
        System.out.println("How many kilos of banana?");
        banana=input.nextInt();

        double totalPrice=(apple*applePerKG)+(banana*bananaPerKG)+(pear*pearPerKG)+(tomatoes*tomatoesPerKG)
                +(eggplant*eggplantPerKG);
        System.out.println("Total price is "+totalPrice);


    }
}
