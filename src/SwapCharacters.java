
import java.util.Arrays;
import java.util.Scanner;

public class SwapCharacters {
    public static void main(String[] args){
        String str;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter string :");
        str=input.next();
        System.out.println(swapChar(str));

    }
    public static String swapChar(String str){
            
            char[] array = str.toCharArray();
            char temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            String result = String.valueOf(array);


        return result;
    }
}
