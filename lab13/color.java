import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class color extends JFrame implements ActionListener {

    JButton red, green, blue;

    color() {
        // Frame setup
        setTitle("Color Changer");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Buttons create
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        // Add buttons to frame
        add(red);
        add(green);
        add(blue);

        // Add event listeners
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            getContentPane().setBackground(Color.RED);
        } 
        else if (e.getSource() == green) {
            getContentPane().setBackground(Color.GREEN);
        } 
        else if (e.getSource() == blue) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorChange();
    }
}