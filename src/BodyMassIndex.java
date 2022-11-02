import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height,weight,bodyMass;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your height as a cm:");
        height=input.nextInt();
        System.out.println("Enter your weight as a kg:");
        weight=input.nextInt();

        bodyMass=weight/(height*height);
        System.out.println("Your body mass index is "+ bodyMass);



    }
}
