public class RecursionDemo {
    static void printName(int num) {
        if (num == 0)
            return;
        System.out.println("Brain ");
        printName(num - 1);
        printName(num - 1);
        System.out.println("Mentors");
    }

    public static void main(String[] args) {
        // int n = 10;
        printName(5);

    }
}
