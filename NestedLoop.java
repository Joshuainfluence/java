import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol;

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns: ");
        cols = scanner.nextInt();

        System.out.println("Enter symbol: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= cols; j++) {
                System.err.print(symbol);
            }
        }
    }
}
