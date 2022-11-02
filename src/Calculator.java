import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int numberOne,numberTwo;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        numberOne= input.nextInt();
        System.out.println("Enter second number");
        numberTwo= input.nextInt();

        System.out.println("Select your operation type");
        System.out.print(" Summation->1\n Extraction->2\n Multiplication->3\n Division->4\n Type number:");
        int operation=input.nextInt();
        int result=0;
        switch(operation) {
            case 1:
                result=numberOne+numberTwo;
                break;
            case 2:
                result=numberOne-numberTwo;
                break;
            case 3:
                result=numberOne*numberTwo;
                break;
            case 4:
                result=numberOne/numberTwo;
                break;
            default:
                // code block
        }
        System.out.println("Result is "+result);
    }
}
