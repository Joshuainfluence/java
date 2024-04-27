import javax.swing.JOptionPane;
public class WhileLoopGUI {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Enter your name: ");

        while (name.isBlank()) {
            name = JOptionPane.showInputDialog("Enter your name: ");
        }

        JOptionPane.showMessageDialog(null, "Your name is " + name);
    }
}
