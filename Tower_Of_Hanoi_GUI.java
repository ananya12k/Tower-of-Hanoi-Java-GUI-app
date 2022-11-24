import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Tower_Of_Hanoi_GUI extends Frame implements ActionListener, MouseMotionListener {
    Tower_Of_Hanoi_GUI() {
        setVisible(true);
        setSize(600, 600);
        setResizable(true);
        setBackground(Color.BLACK);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                setVisible(false);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public void mouseDragged(MouseEvent me) {

    }

    public void mouseMoved(MouseEvent me) {
    }

    public static void main(String[] args) {
        Tower_Of_Hanoi_GUI app = new Tower_Of_Hanoi_GUI();
    }
}