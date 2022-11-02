import java.util.Scanner;

public class SortingLargestToSmallest {
    public static void main(String[] args) {
        int numOne, numTwo, numberThree;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        numOne = input.nextInt();

        System.out.print("Enter first second: ");
        numTwo= input.nextInt();

        System.out.print("Enter first third: ");
        numberThree = input.nextInt();

        if (numOne<numTwo && numOne<numberThree) {
            if (numTwo<numberThree) {
                System.out.print(numOne+"<"+numTwo+"<"+numberThree);
            } else {
                System.out.print(numOne+"<"+numberThree+"<"+numTwo);

            }
        } else if ((numTwo<numOne)&&(numTwo<numberThree)){
            if (numOne<numberThree){
                System.out.print(numTwo+"<"+numOne+"<"+numberThree);

            }else {
                System.out.print(numTwo+"<"+numberThree+"<"+numOne);

            }
        } else if ((numberThree<numTwo)&&(numberThree<numOne)){
            if (numOne<numTwo){
                System.out.print(numberThree+"<"+numOne+"<"+numTwo);

            }else {
                System.out.print(numberThree+"<"+numTwo+"<"+numOne);

            }

        }
    }
}
