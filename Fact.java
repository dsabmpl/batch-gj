public class Fact {
    static void fact(int num, int ans) {
        // int fact = 1;
        // for (int i = 5; i > 1; i--) {
        // fact = fact * i;
        // }
        if (num == 1) {
            System.out.println("Factorial is " + ans);
            return;
        }
        ans *= num;
        fact(num - 1, ans);
    }

    static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        int ans = fact(num - 1);
        return ans * num;

    }

    public static void main(String[] args) {
        int num = 5;
        fact(num, 1);
        System.out.println(fact(num));
    }

}
