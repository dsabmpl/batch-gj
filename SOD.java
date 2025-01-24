public class SOD {
    public static int sumOfDigits(int num) {
        // Step 1 : Initialize sum variable with 0.
        // Step 2 : Take Last Digit of the Number by modulus by 10 and add to sum.
        // Step 3 : Break the number or Remove Last digit by dividing by `10.
        // Step 4 : Repeat Step 2 and 3 until num become 0.

        int sum = 0;

        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10; // num = num /10;
        }

        return sum;

    }

    public static void main(String[] args) {
        int n = 123;
        // 1 + 2 + 3 + 4 + 5 = 15
        // 5 + 4 + 3 + 2 + 1 = 15
        System.out.println(sumOfDigits(n));
    }

}
