

import java.util.Scanner;

public class MatrisTranspose {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter row number:");
        int row=input.nextInt();
        System.out.println("Enter column number:");
        int col=input.nextInt();
        //holds transpose and original matrix
        int matris[][]=new int[row][col];
        int transpose[][]=new int[col][row];

        //takes input from user for matrix
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print("Enter "+ i +". row " + j +". col element:");
                matris[i][j] = input.nextInt();
            }
        }
        //prints the original matris with given values
        System.out.println("Matris:");
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        //assigns matris value to it s transpose
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                transpose[j][i] = matris[i][j];
            }
        }
        System.out.println("Transposed matris: ");
        //prints transpose of the matrix
        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
