package Launcher;

import java.awt.*;

public class Launcher{
    public static void main(String[] args) {
        Main_Frame mainFrame=new Main_Frame();

        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){

            }


        });
        mainFrame.show();
    }

}
