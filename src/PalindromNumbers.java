public class PalindromNumbers {
    static boolean isPalindrom(int number){
        int reverse=0;
        int temp=number;
        while(temp!=0) {
            int lastDigit = temp % 10;
            reverse =(reverse*10)+lastDigit;
            temp /= 10;
        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println(isPalindrom(454));
    }
}
