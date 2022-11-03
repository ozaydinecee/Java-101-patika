import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args){
        int number,digit = 0,digitValue,digitPower,result=0;
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
            digitPower=1;//we cannot initialize out of the loop because in every loop digitPower value changes
            for(int i=1;i<=digit;i++){
                digitPower*=digitValue;
            }
            result+=digitPower;
            temp/=10;

        }
        if(result==number){
            System.out.println(result+ " is Armstrong number");
        }
        else{
            System.out.println(number+" is not Armstrong number.");
        }
    }
}
