package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class HW7window extends JFrame {

    private int winWidth = 700;
    private int winHeight = 510;
    private int winPosX = 180;
    private int winPosY = 122;

    private Panel panel1;
    private JPanel fromPanel1;

    private JButton btnStart;
    private JButton btnFinish;

    HW7window() {
        initWindow();

        newButton();
        panel();

        add(btnStart, BorderLayout.WEST);
        add(btnFinish, BorderLayout.EAST);
        add(panel1);
        panel1.add(fromPanel1);



        setVisible(true);
    }

    private void newButton() {
        btnStart = new JButton("=Start=");
        btnFinish = new JButton("=Finish=");
    }

    private void panel() {
        panel1 = new Panel();
        panel1.setLayout(new GridLayout(2, 1));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        fromPanel();
    }

    private void fromPanel() {
        fromPanel1 = new JPanel();
        fromPanel1.setLayout(new GridLayout(4, 3));
        fromPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private void initWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("Game is game!");
        setResizable(false);
    }
}
