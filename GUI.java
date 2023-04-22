import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
    
    public GUI() {
        super("LAHacks Project"); // set the title of the JFrame
        setSize(1200, 900); // set the size of the JFrame
        setLocationRelativeTo(null); // center the JFrame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        
        JLabel label = new JLabel("Hello, World!"); // create a new JLabel
        add(label); // add the JLabel to the JFrame
        
        setVisible(true); // make the JFrame visible
    }
    
    public static void main(String[] args) {
        new GUI(); // create a new instance of the JFrame
    }
}
