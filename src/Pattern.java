

import java.util.Scanner;

public class Pattern {
    /**
     * @author: Ece Özaydın
     * @date: 5.11.2022
     * calculateResult ; makes pattern with increasing and decreasing the entered number by 5
     *
     * */
    static void calculateResult(int number){
        System.out.print(number+ " ");
        if(number<=0){
            return ;
        }
        calculateResult(number-5);
        System.out.print(number+ " ");



    }
    public static void main(String[] args){



        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();

        calculateResult(num);


    }
}

