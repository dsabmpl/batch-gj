public class GreatestAmongThree {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 50;

        if (a > b) {
            if (a > c) {
                System.out.println("A is Greatest ");
            } else {
                System.out.println("C is Greatest");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("B is Greatest");
            } else {
                System.out.println("C is Greatest");
            }
        }

    }

}
