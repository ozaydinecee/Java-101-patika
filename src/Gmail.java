import java.util.Arrays;
import java.util.Scanner;

public class Gmail {
    public static void main(String[] args){
        String[] mail={"ozaydinecee@gmail.com","kimberley@yahoo.com","john_3@gmx.net"};
        System.out.println(Arrays.toString(myFunc(mail)));

    }
    public static String[] myFunc(String[] mails){
        String [] gmailArray = new String[1];
        for(int i =0;i<mails.length;i++){
            if(mails[i].contains("gmail.com")){
                gmailArray[i]=mails[i];
            }
        }

        return gmailArray;
    }
}
