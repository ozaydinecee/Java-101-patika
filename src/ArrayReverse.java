public class ArrayReverse {
    static int[] reverse(int[] list){
        int[] reverse=new int[list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            reverse[i]=list[j];
        }
        return reverse;
    }
    static void printArray(int[] list){
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+", ");
        }
    }

    public static void main(String[] args){
       int [] list={1,2,3,4,5,6,7,8,9};
        int[] newList=reverse(list);
        printArray(newList);
        System.out.println("");
        printArray(list);
    }
}
