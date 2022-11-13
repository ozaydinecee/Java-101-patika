

import java.util.Arrays;

public class FrequencyOfTheArrayElements {
    /**
     * @authot Ece Özaydın
     * @date 13.11.2022
     * @param array visitedArray=holds frequencies of the array values
     * @param visited = signs the visited array elements as -1 .
     *
     * */
    static void frequencies(int[] array) {
        int[] visitedArray = new int[array.length];
        int visited = -1;//out of the array bound
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visitedArray[j] = visited;

                }
            }
            //assigns count=1, if value has one frequency
            if (visitedArray[i] != visited) {
                visitedArray[i] = count;
            }
        }
        //prints frequencies
        System.out.println("Element  |    Frequency");
        for (int i = 0; i < visitedArray.length; i++) {
            if (visitedArray[i] != visited)
                System.out.println("    " + array[i] + "    |    " + visitedArray[i]);

        }
    }
    public static void main(String[] args) {
        int[] array={1,2,2,2,3,3,3,3,3,3,3,4,5,6,7,8,8};
        frequencies(array);
    }
}
