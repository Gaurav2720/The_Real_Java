import javax.swing.*;
import java.awt.*;


public class Student{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame( "Student login ");
        frame.setLayout(new GridLayout(5 ,2, 5, 5));
        JButton button = new JButton("submit");
        

        JTextField namefield = new JTextField();
        JTextField agefield = new JTextField();
        JTextField sapfield = new JTextField();
        JTextField batchfield = new JTextField();
        

        frame.add(new JLabel("Name:"));
        frame.add(namefield);
        frame.add(new JLabel("Age:"));
        frame.add(agefield);
        frame.add(new JLabel("SAP:"));
        frame.add(sapfield);
        frame.add(new JLabel("Batch:"));
        frame.add(batchfield);
        frame.add(button);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}