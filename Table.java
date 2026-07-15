import java.util.Random;
import java.util.Scanner;
public class Main {
    static void matrix(int[][] num, int size, int highlight) {
        System.out.print("  ");
        for (int col = 0; col < size; col++) {
            System.out.printf("%5s", String.format("%02d", col));}
        System.out.println();
        System.out.print("   ");
        for (int col = 0; col < size; col++) {
            System.out.print("+----");
        }
        System.out.println("+");
        for (int row = 0; row < size; row++) {
            System.out.printf("%02d ", row);
            for (int col = 0; col < size; col++) {
                if (highlight != -1 && num[row][col] == highlight) {
                    System.out.printf("|[%2d]", num[row][col]);
                } else {
                    System.out.printf("| %2d ", num[row][col]);
                }
            }
            System.out.println("|");
            System.out.print("   ");
            for (int col = 0; col < size; col++) {
                System.out.print("+----");
            }
            System.out.println("+");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter array size (for P×P array): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input!");
            return;
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input!");
            return;
        }
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (random.nextInt(8) + 1) * 2;
            }
        }
        System.out.println("\nGenerated 2D Array:");
        matrix(array, size, -1);
        System.out.print("\nEnter an even number (2-16) to highlight: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input!");
            return;
        }
        int numberToHighlight = scanner.nextInt();
        if (numberToHighlight < 2 || numberToHighlight > 16 || numberToHighlight % 2 != 0) {
            System.out.println("Invalid input!");
            return;
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] == numberToHighlight) {
                    count++;
                }
            }
        }
        System.out.println("\nArray after highlighting:");
        matrix(array, size, numberToHighlight);
        System.out.println("\nNumber " + numberToHighlight + " appeared " + count + " time(s).");
    }
}
