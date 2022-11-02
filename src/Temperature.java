import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temperature =input.nextDouble();
        if (temperature<=5){
            System.out.println("Do skiing.");
        } else if (temperature>5 && temperature<=15) {
            System.out.println("Go to the movies.");

        } else if (temperature>15 && temperature<25) {
            System.out.println("Picnic.");

        } else if (temperature>=25) {
            System.out.println("Go swimming.");

        }

    }
}
