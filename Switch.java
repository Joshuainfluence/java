import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        String day;
        String message;
        String command;
        command = "Enter a day of the week";
        day = JOptionPane.showInputDialog(command);
        switch (day) {
            case "Monday":
                message = "I don't care if Monday's blue";

                break;

            case "Tuesday":
                message = "Tuesday's grey";

                break;
            case "Wednessday":
                message = "Wednessday too";

                break;
            case "Thursday":
                message = "Thursday I don't care about you";

                break;
            case "Friday":
                message = "It's friday, I'm in love!";

                break;
            case "Saturday":
                message = "Saturday wait!";

                break;
            case "Sunday":
                message = "Sunday always comes too late";

                break;

            default:
                message = "It's Friday, i'm in love";
                break;
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
