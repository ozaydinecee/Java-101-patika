import java.util.Scanner;

public class ChineeseZodiac {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter birth year");
        int birthYear=inputs.nextInt();
        int remainder =birthYear%12;
        //System.out.println(remainder);


        switch (remainder%12) {
            case 0:
                System.out.println("Your Chinese Zodiac Horoscope is Maymun");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Horoscope is Horoz");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Horoscope is Köpek");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Horoscope is Domuz");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Horoscope is Fare");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Horoscope is Öküz");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Horoscope is Kaplan");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Horoscope is Tavşan");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Horoscope is Ejderha");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Horoscope is Yılan");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Horoscope is At");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Horoscope is Koyun");
                break;
        }


    }
}
