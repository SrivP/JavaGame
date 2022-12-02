import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.events.*;
import java.util.EventListener;


public class Fight_1 extends JFrame implements EventListener {
    private Container c;
}

class menu extends JPanel {
    ImageIcon imageIcon = new ImageIcon("/workspaces/JavaGame/cq52pcj3ga491.gif");

    public menu() {
        
    }


    public void paintComponent(Graphics g) {
        super.printComponent(g);
        g.drawImage(imageIcon.getImage(), 0, 0, 300, 300, null);
    }





}