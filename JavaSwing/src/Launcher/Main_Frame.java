package Launcher;


import javax.swing.*;
import java.awt.*;

public class Main_Frame {
    private JFrame jFrame;
    private JPanel jPanel;

    private JButton jButton;

    public Main_Frame() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        jFrame.setTitle("JButton Demo");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(800, 500);
        jFrame.setLocationRelativeTo(null);

        jPanel = new JPanel();
        jButton = createButton();
        jPanel.add(jButton);
        jFrame.add(jPanel, BorderLayout.CENTER);


    }

    private JButton createButton() {
        JButton jButton1 = new JButton("Print");
        jButton1.setFocusable(false);
        //add graphic to a button
        ImageIcon imageIcon=new ImageIcon("print.png");
        jButton1.setIcon(imageIcon);
        return jButton1;
    }

    public void show() {
        this.jFrame.setVisible(true);
    }
}
