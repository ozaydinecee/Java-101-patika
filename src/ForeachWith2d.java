import java.util.Scanner;

public class ForeachWith2d {
    public static void main(String[] args){
        int[][] matris={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        for(int[]col: matris){
            for(int row: col){
                System.out.print(row+ " ");
            }
            System.out.println();
        }
    }
}
