import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args){
        int num;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        num=input.nextInt();
        int perfectNumber=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                perfectNumber+=i;
            }
        }
        if(num==perfectNumber){
            System.out.println(num+ " is a perfect number.");
        }
        else{
            System.out.println(num+ " is not a perfect number.");
        }
    }
}
