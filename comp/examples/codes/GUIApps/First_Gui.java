package comp.examples.codes.GUIApps;

import javax.swing.*;

public class First_Gui extends JFrame {
    public First_Gui(){
        setTitle("First_Gui");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080,720);
        setLocation(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        First_Gui firstGui = new First_Gui();
    }
}
