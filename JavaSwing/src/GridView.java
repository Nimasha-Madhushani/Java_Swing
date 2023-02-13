import javax.swing.*;
import java.awt.*;

public class GridView {
    private JFrame jFrame;
    private JPanel jPanel;

    public GridView() {
        initialize();
    }

    public void initialize() {
        jFrame = new JFrame();
        jFrame.setTitle("Border Panel");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(800, 500);
        jFrame.setLocationRelativeTo(null);

        jPanel = new JPanel(new GridLayout(0,5,10,10));
        for (int i=1;i<=20;i++){
            JButton jButton=new JButton("Button"+Integer.toString(i));
            jPanel.add(jButton);
        }
        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);

    }
}
