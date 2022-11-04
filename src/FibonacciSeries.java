
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        /**
         * @author: Ece Özaydın
         * @date: 4.11.2022
         * @param: bound; number of the elements
         *         num1,num2,num3; series elements
         * */
        int bound,num1=0,num2=1,num3;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        bound=input.nextInt();

        for(int i=2;i<=bound;i++){
            num3=num1+num2;
            System.out.println( num1+"+"+num2+"="+num3);
            num1=num2;
            num2=num3;
        }
    }
}
