import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Filename: calculator.java
public class calculator extends JFrame implements ActionListener {

    JTextField tf;
    double num1, num2, result;
    char operator;

    public calculator() {
        setTitle("Calculator - gb_590012457");
        setSize(250, 250);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); 

        // 1. Text Field for input/output
        tf = new JTextField();
        add(tf, BorderLayout.NORTH);

        // 2. Panel for a simple 3x2 grid of buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // 3. Create and add buttons
        String[] ops = {"+", "-", "*", "/", "C", "="};
        for (int i = 0; i < ops.length; i++) {
            JButton btn = new JButton(ops[i]);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("C")) {
            tf.setText(""); // Clear the text field
        } else if (cmd.equals("=")) {
            if (!tf.getText().isEmpty()) {
                num2 = Double.parseDouble(tf.getText());
                
                // Perform the calculation
                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': result = num1 / num2; break;
                }
                tf.setText(String.valueOf(result));
            }
        } else {
            // An operator was clicked
            if (!tf.getText().isEmpty()) {
                num1 = Double.parseDouble(tf.getText()); // Store first number
                operator = cmd.charAt(0);                // Store the operator (+, -, *, /)
                tf.setText("");                          // Clear screen for the next number
            }
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}