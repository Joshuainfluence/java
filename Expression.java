import java.util.Scanner;
// Expression = operands and operators
// operands = vairables, values, numbers
// operators = +, -, * , / , %
public class Expression {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String me;
        String command;
        me = "I am a toxic loner, and i take you to these memories of mine";
        System.out.println(me);
        command = "Choose friends: ";
        System.out.print(command);
        int friends = scanner.nextInt();
        me = "I made " + friends + " friends in a day";
        System.out.println(me);
        command = "Choose your loss: ";
        System.out.print(command);
        int loss = scanner.nextInt();
        me = "I lost " + loss + " friends in a vehicle accident";
        System.out.println(me);
        friends = friends - loss;
        me = "Now i am left with " + friends + " friends in the school";
        System.out.println(me); 
        command = "Enter your next loss: ";
        System.out.print(command);
        loss = scanner.nextInt();
        me = "I also lost " + loss + " friends in a swimming competition at a night party.";
        System.out.println(me);
        friends = friends - loss;
        me = "Now i am left with " + friends + " friends.";
        System.out.println(me);
        double x = 10;
        x = (double)x/3;
        System.out.println(x);
    }
}