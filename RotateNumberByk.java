public class RotateNumberByk {
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    static int rotate(int num, int k) {
        int digits = countDigits(num);
        k = k % digits;
        int rightPart = num % (int) Math.pow(10, k);
        num /= (int) Math.pow(10, k);
        int answer = rightPart * (int) Math.pow(10, digits - k);
        return answer + num;
    }

    public static void main(String[] args) {
        int num = 12345;
        int k = 2;
        System.out.println(rotate(num, k));
    }

}
