import javax.swing.*;
import java.awt.*;

public class JFrameTwo {
    private JFrame jFrame;

    public JFrameTwo() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        this.jFrame.setTitle("JFrameTwo");
        this.jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.jFrame.setSize(500, 400);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setResizable(false);
        this.jFrame.setVisible(true);






        JLabel l1, l2;
        JTextField tf1, tf2;
        l1 = new JLabel("First Label.");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Second Label.");
        l2.setBounds(50, 100, 100, 30);
        jFrame.add(l1);
        tf1 = new JTextField();
        tf1.setBounds(150, 55, 150, 20);
        jFrame.add(tf1);
        jFrame.add(l2);
        tf2 = new JTextField();
        tf2.setBounds(150, 105, 150, 20);
        jFrame.add(tf2);
        jFrame.setSize(600, 800);
        jFrame.setLayout(null);


// creating 9 buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        jFrame.add(btn1);
        jFrame.add(btn2);
        jFrame.add(btn3);
        jFrame.add(btn4);
        jFrame.add(btn5);
        jFrame.add(btn6);
        jFrame.add(btn7);
        jFrame.add(btn8);
        jFrame.add(btn9);
        jFrame.setLayout(new GridLayout(0,2,20, 25));


        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }


}