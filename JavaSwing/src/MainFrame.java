import javax.swing.*;
import java.awt.*;

public class MainFrame {
    JFrame jFrame;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        jFrame.setTitle("Border Panel");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(800, 500);
        BorderLayout borderLayout=new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        jFrame.setLayout(borderLayout);

        jFrame.setLayout(new BorderLayout(5,5));
        jFrame.add(new JButton("North"), BorderLayout.NORTH);
        jFrame.add(new JButton("West"), BorderLayout.WEST);
        jFrame.add(new JButton("East"), BorderLayout.EAST);
        jFrame.add(new JButton("South"), BorderLayout.SOUTH);
        jFrame.add(new JButton("Center"), BorderLayout.CENTER);

        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }
}
