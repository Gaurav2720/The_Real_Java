import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Swing {
    public static void main(String[] args) {
        
        JFrame F = new JFrame("Movie Registration");
        F.setLayout(new GridLayout(5, 2));
        
        JLabel l1 = new JLabel("Movie:");
        JTextField a1 = new JTextField();
        JLabel l2 = new JLabel("Director:");
        JTextField a2 = new JTextField();
        JLabel l3 = new JLabel("Rating:"); // Changed to match prompt
        JTextField a3 = new JTextField();

        JButton But = new JButton("Submit");

        F.add(l1);
        F.add(a1);
        F.add(l2);
        F.add(a2);
        F.add(l3);
        F.add(a3);
        F.add(new JLabel("")); // Spacer to push button to the right
        F.add(But);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == But) {
                    // FIX 1: Extract the text using .getText()
                    String title = a1.getText();
                    String director = a2.getText();
                    String rating = a3.getText();

                    // FIX 2: Create a formatted string using \n for new lines
                    String result = "Title: " + title + "\n" +
                                    "Director: " + director + "\n" +
                                    "Rating: " + rating;

                    // FIX 3: Display it ON THE SCREEN using a dialog box
                    JOptionPane.showMessageDialog(F, result);
                }
            }
        };
        
        But.addActionListener(action);
        
        F.setSize(400, 300);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setVisible(true);
    }
}