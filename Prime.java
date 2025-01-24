public class Prime {
    static boolean isPrime(int num) {
        // 7 % 2 == 0 false
        // 7 % 3 == 0 false
        // 7 % 4 == 0 false
        // 7 % 5 == 0 false
        // 7 % 6 == 0 false
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n) ? "Number is Prime" : "Number is Not Prime");
    }

}
