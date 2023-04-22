import java.util.ArrayList;

import javax.swing.*;

public class GUI extends JFrame {
    
    public GUI() {
        super("LAHacks Project"); // set the title of the JFrame
        setSize(1200, 900); // set the size of the JFrame
        setLocationRelativeTo(null); // center the JFrame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        
        // JLabel label = new JLabel("Hello, World!"); // create a new JLabel
        // add(label); // add the JLabel to the JFrame
        
        setVisible(true); // make the JFrame visible
    }
    
    public static void main(String[] args) {
        ArrayList<Person> friendList;

        Person you = new Person();
        Person friend1 = new Person();
        Person friend2 = new Person();
        Person friend3 = new Person();
        Person friend4 = new Person();

        friendList.add(friend1);
        friendList.add(friend2);
        friendList.add(friend3);
        friendList.add(friend4);

        Course cse12 = new Course("CSE 12", "A01", 900, 950, "10101");
        Course cse15l = new Course("CSE 15L", "A01", 900, 950, "10101");
        Course cse20 = new Course("CSE 20", "A01", 900, 950, "10101");
        Course mmw12 = new Course("MMW 12", "A01", 900, 950, "10101");
        Course cogs100 = new Course("COGS 100", "A01", 900, 950, "10101");
        Course vis84 = new Course("VIS 84", "A01", 900, 950, "10101");
        Course vis41 = new Course("VIS 41", "A01", 900, 950, "10101");
        Course cogs108 = new Course("COGS 108", "A01", 900, 950, "10101");
        Course dsgn100 = new Course("DSGN 100", "A01", 900, 950, "10101");
        Course mus81 = new Course("MUS 81", "A01", 900, 950, "10101");
        Course math187 = new Course("MATH 187", "A01", 900, 950, "10101");
        Course math183 = new Course("MATH 183", "A01", 900, 950, "10101");
        Course math143 = new Course("MATH 143", "A01", 900, 950, "10101");
        Course math154 = new Course("MATH 154", "A01", 900, 950, "10101");
        Course lign117 = new Course("LIGN 117", "A01", 900, 950, "10101");
        Course cat1 = new Course("CAT 1", "A01", 900, 950, "10101");

        you.addCourse(cse12);
        //you.printPerson();

        friend1.addCourse(cat1);
        friend1.addCourse(math187);
        friend1.addCourse(lign117);
        friend1.addCourse(math183);
        
        friend2.addCourse(cat1);
        friend2.addCourse(cse12);
        friend2.addCourse(cse20);
        friend2.addCourse(vis41);

        friend3.addCourse(math143);
        friend3.addCourse(math154);
        friend3.addCourse(math183);
        friend3.addCourse(math187);

        friend4.addCourse(cogs108);
        friend4.addCourse(cogs100);
        friend4.addCourse(dsgn100);

        new GUI(); // create a new instance of the JFrame

        for (int i = 0; i < friendList.size(); i++) {
            FriendButton.FriendButton(friendList.get(i).getName());
        }
    }
}
