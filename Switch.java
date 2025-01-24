import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopChoice = true;
        do {
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 for modulus");
            System.out.println("Press 6 to Exit");
            int choice = sc.nextInt();
            if (choice == 6) {
                break;
            }
            System.out.println("Enter The Value of First Number: ");
            int a = sc.nextInt();
            System.out.println("Enter the Value of Second Number: ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println(a % b);
                    break;
                case 6:
                    loopChoice = false;
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Choose The Correct Option ");
                    break;
            }
        } while (loopChoice);
    }

}
