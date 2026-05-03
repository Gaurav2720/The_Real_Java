import java.awt.*;

public class button {
    button(){
Frame f = new Frame();

        Button b1 = new Button("cancel");
        b1.setBounds(100, 100, 50,50);
        f.add(b1);

        Button b2 = new Button("ok");
        b2.setBounds(100, 150, 50,50);
        f.add(b2);


        Button b3 = new Button("submit");
        b3.setBounds(100, 200, 100, 150);
        f.add(b3);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
       
    }
    public static void main(String[] args) {
        new button();

        
    }
}
