import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                MainWindow mainWindow = new MainWindow();
//                mainWindow.show();
//                JFrameOne jFrameOne = new JFrameOne();
//                JFrameTwo jFrameTwo = new JFrameTwo();
//                Jpannel jpannel=new Jpannel();
                MainFrame mainFrame = new MainFrame();
                Flow_Layout flow_layout = new Flow_Layout();
                GridView gridView = new GridView();
            }
        });
        System.out.println("Hello world!");
    }
}