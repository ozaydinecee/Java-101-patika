public class PrimeNumber {
    public static void main(String[] args){
        /**
         * @author: Ece Özaydın
         * @date: 4.11.2022
         * @param: start; holds starting number
         *         end; holds ending number
         *         prime; returns boolean value for prime and non prime numbers
         * */
        int start = 2, end = 100;

        while (start < end) {
            boolean prime = true;

            for(int i = 2; i <= start/2; i++) {

                if(start % i == 0) {//not prime
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(start + " ");

            start++;
        }


    }
}
