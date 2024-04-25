import javax.swing.JOptionPane;

public class IfStatement {
    public static void main(String[] args) {
        int age;
        String message;
        String command;
        command = "Enter your current age";
        age = Integer.parseInt(JOptionPane.showInputDialog(command));
        if (age >= 18 && age < 75) {
            message = "You are an adult!";

        } else if (age >= 75) {
            message = "Wow! You have lived a good life, Elder!";
        } else {
            message = "You are a kid!";
        }

        JOptionPane.showMessageDialog(null, message);
    }

}
