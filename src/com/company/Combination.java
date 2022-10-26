package  com.company;

import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n =input.nextInt();
        System.out.println("Enter r value:");
        int r =input.nextInt();
        int difference=n-r;
        /*calculate n!*/
        int nfac = 1;
        for(int i=1;i<=n;i++){
            nfac*=i;
        }

        int rfac=1;
        for(int k=1;k<=r;k++){
            rfac*=k;
        }
        int differenceFac=1;
        for(int l=1;l<=difference;l++){
            differenceFac*=l;
        }
    System.out.println("Combination:"+((nfac)/(rfac*differenceFac)));

    }
}
