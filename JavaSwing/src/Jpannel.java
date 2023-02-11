import javax.swing.*;
import java.awt.*;

public class Jpannel {
    private JFrame jFrame;

    public Jpannel() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout(10, 5));
        jFrame.setTitle("Jpanel");
        jFrame.setSize(800, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        jPanel.setBackground(Color.RED);
        Button button1=new Button("Button1");
        jPanel.add(button1);
        Button button2=new Button("Button2");
        jPanel.add(button2);
        Button button3=new Button("Button3");
        jPanel.add(button3);
        jFrame.add(jPanel, BorderLayout.NORTH);
        jFrame.setVisible(true);
    }
    //container

}
