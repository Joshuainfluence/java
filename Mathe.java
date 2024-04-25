import java.util.Scanner;

public class Mathe {
    public static void main(String[] args) {
        // in this project i will try to solve pythoras theorem
        double x; // opposite
        double y; // adjacent
        double z; // hypotenus
        double ans; // the answer
        String message;
        Scanner scanner = new Scanner(System.in);
        message = "Enter the value of opposite side: ";
        System.out.print(message);
        x = scanner.nextDouble();
        message = "Enter the value of adjacent side: ";
        System.out.print(message);
        y = scanner.nextDouble();

        z = (x*x) + (y*y);
        ans = Math.sqrt(z);
        message = "The hypotenus is: " + Math.round(ans);
        System.out.println(message);
    }
}
