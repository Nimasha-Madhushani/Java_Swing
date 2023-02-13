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
        jFrame.setLayout(new BorderLayout());
        jFrame.add(new JButton("North"), BorderLayout.NORTH);
        jFrame.add(new JButton("West"), BorderLayout.WEST);
        jFrame.add(new JButton("East"), BorderLayout.EAST);
        jFrame.add(new JButton("South"), BorderLayout.SOUTH);
        jFrame.add(new JFrameOne(), BorderLayout.CENTER);

        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }
}
