import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String[] args) {

        /**
         * @author: Ece Özaydın
         * @date: 4.11.2022
         * @param: num1,num2; numbers for calculating ebob and ekok
         *         smallest; holds smallest number for while loop
         * ->If it s divisible with two numbers it can be ebob.Thus, we used while loop to find ebob.
         * */

        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = input.nextInt();

        System.out.println("Enter number 2:");
        num2 = input.nextInt();
        int smallest=num1;
        if(smallest>num2){
            smallest=num2;
        }
        int i=1;
        int ebob=0;
        while( i<=smallest){
            if(num1%i==0 && num2%i==0){
                 ebob=i;
            }
            i++;

        }
        System.out.println("EBOB: "+ ebob);
        System.out.println("EKOK: "+ (num1*num2)/ebob);


    }
}
