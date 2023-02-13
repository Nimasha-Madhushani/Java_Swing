import javax.swing.*;
import java.awt.*;

public class Flow_Layout {
    private JFrame jFrame;
    private JPanel jPanel;

    public Flow_Layout() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        jFrame.setTitle("Flow Layout");
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        BorderLayout borderLayout = new BorderLayout();
jPanel.setBackground(Color.pink);
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(800, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(jPanel, BorderLayout.CENTER);

        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }
}