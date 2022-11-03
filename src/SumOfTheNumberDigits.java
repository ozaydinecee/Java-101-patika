import java.util.Scanner;

public class SumOfTheNumberDigits {
    public static void main(String[] args){
        int number,digit = 0,digitValue,result=0;

        Scanner input =new Scanner(System.in);

        System.out.println("Enter number");
        number=input.nextInt();
        int temp=number;

        while(temp!=0){
            temp/=10;
            digit++;
        }

        temp=number;

        while(temp!=0){
            digitValue=temp%10;
            result+=digitValue;

            temp/=10;

        }
        System.out.println("Sum of the digits: "+result);
    }
}
