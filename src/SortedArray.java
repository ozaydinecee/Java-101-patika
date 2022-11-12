import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    /**
     * @author Ece Özaydın
     * @date 12.11.2022
     * @param temp=holds bigger value
     * @return  sorted array
     * */
    static int[] sortedArray(int[] array){
        for(int i=0;i< array.length;i++){
            for(int j=i+1; j<array.length;j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }

            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //takes array length from user
        System.out.println("Please enter the array length:");
        int arrayLength=input.nextInt();

        int[] array = new int[arrayLength];

        //takes array elements from user and adds on the array
        System.out.println("Please enter the array element:");
        int index = 1;
        for(int i=0;i<arrayLength;i++){
            System.out.println("number "+index +":");
            array[i]=input.nextInt();
            index++;
        }
        //sorts array elements
        sortedArray(array);
    }
}
