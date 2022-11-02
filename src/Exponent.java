import java.util.Scanner;

public class Exponent {
    public static void main(String[] args){
    /*
    * Takes number and its exponential from user as a input.
    * Calculates result as a "sum" and prints
    * */
    int sum=1;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        System.out.println("Enter the exponential of the number:");
        int power=input.nextInt();

        for(int i=1; i<=power;i++){
            sum*=num;
        }

        System.out.println("Result:  "+sum);





    }
}
