import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args){
        int math,physics,chemistry, turkish, history,music;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter math grade");
        math=input.nextInt();
        System.out.println("Enter physics grade");
        physics=input.nextInt();
        System.out.println("Enter chemistry grade");
        chemistry=input.nextInt();
        System.out.println("Enter turkish grade");
        turkish=input.nextInt();
        System.out.println("Enter history grade");
        history=input.nextInt();
        System.out.println("Enter music grade");
        music=input.nextInt();

        double average= (math+chemistry+physics+turkish+history+music)/6;
        boolean condition = average>=60;
        String result= condition? "Passed":"Failed";
        System.out.println(average);
        System.out.print(result);
    }

}
