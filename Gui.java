import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));


        JOptionPane.showMessageDialog(null, "Hello " + name + "\n now");

        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        JOptionPane.showMessageDialog(null, "You are " + height + "m tall");
    }
}
