import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 1. Interfaces & Listener Interfaces: We implement ActionListener and MouseListener
public class SwingComprehensiveDemo extends JFrame implements ActionListener, MouseListener {

    // 2. Components and Containers & Swing Controls
    private JPanel mainPanel;     // Container
    private JButton submitButton; // Component / Control
    private JTextField nameField; // Component / Control
    private JLabel resultLabel;   // Component / Control

    public SwingComprehensiveDemo() {
        // 3. Swing: Setting up the primary top-level container (JFrame)
        setTitle("Swing Concepts Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. Layout Managers: Using BorderLayout for the Frame
        setLayout(new BorderLayout());

        // Using FlowLayout for the Panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        // Initializing Swing Controls
        JLabel namePrompt = new JLabel("Enter your name:");
        nameField = new JTextField(15);
        submitButton = new JButton("Greet Me!");
        resultLabel = new JLabel("Welcome! Type a name and click the button.", SwingConstants.CENTER);
        resultLabel.setPreferredSize(new Dimension(400, 50));

        // 5. Swing Event Handling & Event Listeners: Registering components to listen for events
        submitButton.addActionListener(this); 
        resultLabel.addMouseListener(this);   

        // Adding Components to Containers
        mainPanel.add(namePrompt);
        mainPanel.add(nameField);
        mainPanel.add(submitButton);

        // Adding the mainPanel (Container) and resultLabel (Component) to the JFrame (Container)
        add(mainPanel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    // 6. Event Classes: ActionEvent is the class representing the button click
    public void actionPerformed(ActionEvent e) {
        // Checking which control triggered the event
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            if (!name.trim().isEmpty()) {
                resultLabel.setText("Hello, " + name + "! Have a great day.");
            } else {
                resultLabel.setText("Please enter a valid name.");
            }
        }
    }

    // Implementing MouseListener interface methods to show more "Event Classes" (MouseEvent)
    public void mouseClicked(MouseEvent e) {
        resultLabel.setText("Ouch! You clicked the label area.");
    }

    public void mouseEntered(MouseEvent e) {
        // Visual feedback when mouse hovers over the label
        resultLabel.setForeground(Color.BLUE);
    }

    public void mouseExited(MouseEvent e) {
        // Revert visual feedback
        resultLabel.setForeground(Color.BLACK);
    }

    // Unused methods required by the Interface contract
    public void mousePressed(MouseEvent e) {}
    
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        // Best practice: Run Swing applications on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            SwingComprehensiveDemo app = new SwingComprehensiveDemo();
            app.setVisible(true);
        });
    }
}