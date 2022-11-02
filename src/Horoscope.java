import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args){
        int month, day;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your birth month 1-12 interval:");
        month=input.nextInt();
        System.out.println("Enter your birth day:");
        day=input.nextInt();
        if(month==1){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Capricorn");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is aquarius");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==2){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Aquarius");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Pisces");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==3){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Pisces");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Aries");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==4){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Aries");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Taurus");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==5){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Taurus");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Gemini");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==6){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Gemini");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Cancer");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==7){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Cancer");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Leo");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==8){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Leo");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Virgo");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==9){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Virgo");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Libra");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==10){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Libra");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Scorpio");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==11){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Scorpio");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Sagittarius");

            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(month==12){
            if(day< 22 && day<=31){
                System.out.println("Your horoscope is Sagittarius");
            }
            else if(day>22 && day<=31){
                System.out.println("Your horoscope is Capricorn");

            }
            else{
                System.out.println("Invalid input");
            }
        }








    }
}
