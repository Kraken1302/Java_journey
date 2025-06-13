package Day5;
import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null,"hello"+ name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null,"so you are "+ age+" years old !!");
    }
    
}