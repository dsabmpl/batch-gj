public class SODRecursive {
    // Tail recursion
    static void sod(int num, int sum) {
        if (num == 0) {
            System.out.println("Sum is " + sum);
            return;
        }
        sod(num / 10, sum + num % 10);

    }

    // Head Recursion

    static int sod(int num) {
        if (num == 0)
            return 0;
        int sum = sod(num / 10);
        int last = num % 10;
        return sum + last;
    }

    public static void main(String[] args) {
        int num = 12345;
        // sod(num, 0);
        System.out.println(sod(num));
    }

}
