public class NumberToString {
    static String[] arr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    static void convert(int num) {
        if (num == 0)
            return;
        convert(num / 10);
        int last = num % 10;
        System.out.print(arr[last] + " ");

    }

    public static void main(String[] args) {
        int num = 456;
        convert(num);
    }
}