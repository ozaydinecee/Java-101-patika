import java.util.Scanner;

public class MinAndMaxNum {
    public static void main(String[] args) {

        /**
         * @author: Ece Özaydın
         * @date: 4.11.2022
         * @param: biggest; holds biggest number
         *         smallest; holds smallest number
         * */

        int num,biggest=0,smallest=9999;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter year:");
            num = input.nextInt();
            if(num>biggest){
                biggest=num;
            }
            if(num<smallest){
                smallest=num;
            }
         }
        System.out.println("biggest:"+biggest);
        System.out.println("smallest:"+smallest);

    }
}
