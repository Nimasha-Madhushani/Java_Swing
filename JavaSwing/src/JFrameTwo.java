import javax.swing.*;

public class JFrameTwo  {
    private JFrame jFrame;
    public JFrameTwo(){
        initialize();
    }
    public void initialize(){
        jFrame =new JFrame();
        this.jFrame.setTitle("JFrameTwo");
        this.jFrame. setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.jFrame. setSize(500,400);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setResizable(false);
        this.jFrame.setVisible(true);
    }
}
