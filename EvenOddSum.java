public class EvenOddSum {
    static void evenOddSum(int num) {
        int pos = 1, evenSum = 0, oddSum = 0;
        while (num > 0) {
            int last = num % 10;
            if (pos % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            num /= 10;
            pos++;
        }

        System.out.println("Odd Sum is " + oddSum);
        System.out.println("Even Sum is " + evenSum);
    }

    public static void main(String[] args) {
        int num = 8765;
        evenOddSum(num);
    }

}
