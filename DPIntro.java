public class DPIntro {
    // Memoization
    static int fib(int num, int[] dp) {
        if (num < 2)
            return num;
        if (dp[num] != 0)
            return dp[num];
        dp[num] = fib(num - 1, dp) + fib(num - 2, dp);
        return dp[num]; 

    }

    // tabulation
    static int tabulationFib(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

    // Space Optimisation

    static int spaceOptimisedFib(int num) {
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i <= num; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        int dp[] = new int[num + 1];
        System.out.println(fib(num, dp));
        System.out.println(tabulationFib(num));
        System.out.println(spaceOptimisedFib(num));
    }

}
