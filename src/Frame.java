import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 * Created by _iDong on 11/3/2016.
 */
public class Frame extends JFrame {
    public static String name = "Bubble Hero \"DFY\" ";
    public static Dimension size = new Dimension(750, 600);


    public Frame() {
        setTitle(name);
        setSize(size);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        innit();

    }


    public void innit() {
        setLayout(new GridLayout(1, 1, 0, 0));
        Panel screen = new Panel();
        add(screen);
        setVisible(true);

    }
}
