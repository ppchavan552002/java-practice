
class starpattern {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Pattern 1:");
        printPattern1(rows);

        System.out.println("\nPattern 2:");
        printPattern2(rows);

        System.out.println("\nPattern 3:");
        printPattern3(rows);
    }

    // Pattern 1: Right Triangle Star Pattern
    public static void printPattern1(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2: Inverted Right Triangle Star Pattern
    public static void printPattern2(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3: Pyramid Star Pattern
    public static void printPattern3(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
