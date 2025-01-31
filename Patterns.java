public class Patterns {
    static void printRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printReverseRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReverseRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars < row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= num - row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printRihtTriangleWithSpace(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printSquare(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        // printSquare(num);
        // printRightTriangle(num);
        // printReverseRightTriangle(num);
        // printRihtTriangleWithSpace(num);
        // printReverseRightTriangleWithSpaces(num);
        printTriangle(num);

    }

}
