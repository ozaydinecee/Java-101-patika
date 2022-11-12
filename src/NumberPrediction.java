import java.util.Random;
import java.util.Scanner;

public class NumberPrediction {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);

        int prediction;
        int right=5;
        while(right>=5){
            System.out.println("Please enter your prediction:");
            prediction=input.nextInt();

            if(prediction<0 || prediction>100){
                System.out.println("Invalid number.");

            }
            else if(prediction==number){
                System.out.println("Congratulations! Your prediction is true.");
                break;
            }
            else{
                System.out.println("You couldn't find it!");
                if(prediction>number){
                    System.out.println(prediction + " is bigger than number.");

                }
                else{
                    System.out.println(prediction + " is smaller than number.");

                }
            }
        }

    }
}
