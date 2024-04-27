import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String message;
        while (name.isBlank()) {
            message = "Enter your name: ";
            System.out.print(message);
            name = scanner.nextLine();
        }
        message = "Hello, your name is " + name;
        System.out.println(message);
    }
}
