public class ArraysFindEvenDuplicate {
    static boolean isFind(int[] array, int value){
        for(int i=0;i< array.length;i++){
            if(array[i]==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] array={1,2,3,4,4,5,6,3,6,7,7};
        int [] duplicate=new int[array.length];
        int index=0;
        for (int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                if(i!=j && array[i]==array[j] && array[i]%2==0){
                    if(!isFind(duplicate,array[i])){
                        duplicate[index++]=array[i];
                        break;
                    }
                }

            }
        }
        int[] result;
        int ind=0;
        for(int value : duplicate){
            if(value!=0){
                System.out.println(value);
        }
        }
    }
}
