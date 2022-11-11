import java.util.Scanner;

public class Foreach {
    public static void main(String[] args){
       int[] list={1,2,3,4,5};
      /* for(int i=0;i<list.length;i++){
           System.out.println(list[i]);
       }*/
       for(int i: list){
           System.out.println(i);
       }
    }
}
