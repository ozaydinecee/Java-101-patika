import java.util.Arrays;
import java.util.Scanner;

public class SortMinandMaxValueAccordingToInput {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        Arrays.toString(list);
        Arrays.sort(list);
        int num=input.nextInt();
        int min = list[0];
        int max = list[6];

        for (int i : list) {
            if ( i > min && i < num) {
                min = i;
            }
            if (i < max && i>num) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
