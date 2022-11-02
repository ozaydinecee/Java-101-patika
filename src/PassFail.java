import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        int math,physics,chemistry, turkish, history,music,lessonNumber = 0,lessons = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter math grade");
        math=input.nextInt();
        if(math<0 || math>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=math;
        }
        System.out.println("Enter physics grade");
        physics=input.nextInt();
        if(physics<0 || physics>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=physics;
        }
        System.out.println("Enter chemistry grade");
        chemistry=input.nextInt();
        if(chemistry<0 || chemistry>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=chemistry;
        }
        System.out.println("Enter turkish grade");
        turkish=input.nextInt();
        if(turkish<0 || turkish>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=turkish;
        }
        System.out.println("Enter history grade");
        history=input.nextInt();
        if(history<0 || history>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=history;
        }
        System.out.println("Enter music grade");
        music=input.nextInt();
        if(music<0 || music>100){
            System.out.println("Invalid grade");
        }
        else{
            lessonNumber++;
            lessons+=music;
        }


        double average= lessons/lessonNumber;
        boolean condition = average>=55;
        String result= condition? "Passed":"Failed";
        System.out.println(average);
        System.out.print(result);
    }
}
