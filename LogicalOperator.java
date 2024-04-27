import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expression
        // && = (AND) both conditions must be true
        // || = (OR) either of the condition must be true
        // ! = (NOT) reverses bolean value of the condition
        Scanner scanner = new Scanner(System.in);
        String message;
        String response;
        message = "You are playing an adventrure game, press q or Q to quit";
        System.out.println(message);
        response = scanner.next();
        // if (response.equals("q") || response.equals("Q")) {
        //     message = "You quit the game!";
        // } else {
        //     message = "You're still on the game!";
        // }
        if (!response.equals("q") || !response.equals("Q")) {
            message = "You're still on the game!";
        } else {
            message = "You quit the game!";
        }
        System.out.println(message);

    }
}