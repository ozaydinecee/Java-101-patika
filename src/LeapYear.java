import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter year:");
        year=input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year +" is leap year.");
                }
                else{
                    System.out.println(year +" is not leap year.");
                }
            }
            else{
                System.out.println(year +" is leap year.");
            }


        }
        else{
            System.out.println(year +" is not leap year.");
        }



    }
}
