public class NestedLoops {
    public static void main(String[] args) {
        int n = 5;
        outerLoop: for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 2)
                    break outerLoop;
                System.out.println(j);
            }
        }
    }

}
