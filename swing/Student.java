import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Student{

    public static void main(String[] args) {
        
        
        JFrame F = new JFrame("Student record");
        F.setLayout(new GridLayout(6, 2));
        JButton B = new JButton("submit");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Course:");
        JLabel l3 = new JLabel("SapID:");
        JLabel l4 = new JLabel("Age:");
        JLabel l5 = new JLabel("Phone no.:");


        JTextField namefield = new JTextField();
        JTextField agefield = new JTextField();
        JTextField sapfield = new JTextField();
        JTextField coursefield = new JTextField();
        JTextField phoneno = new JTextField();

        F.add(l1);
        F.add(namefield);
        F.add(l2);
        F.add(coursefield);
        F.add(l3);
        F.add(sapfield);
        F.add(l4);
        F.add(agefield);
        F.add(l5);
        F.add(phoneno);
        F.add(new JLabel(" ") );
        F.add(B);



        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == B){

                    String name = namefield.getText();
                    String course = coursefield.getText();
                    String sap = sapfield.getText();
                    String age = agefield.getText();
                    String pho = phoneno.getText();

                    String Result = "Name:" + name + "\n" +"Course:" + course + "\n" + "Sapid" + sap +"\n"+ "age" + age + "\n" + "phone no. "+ pho  ;
                    JOptionPane.showMessageDialog(F, Result);



                                    
                    
                }
            }

        };
        B.addActionListener(action);

        F.setSize(400, 300);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setVisible(true);

    }
}