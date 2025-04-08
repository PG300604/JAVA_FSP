package comp.examples.codes.Swing;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    private JButton back;
    private JPanel panel1;

    private JFrame frame;

    public Dashboard() {
        back.addActionListener(e -> {
            frame.dispose(); // Close dashboard
            new Form().showForm(); // Reopen form
        });
    }

    public void showDashboard() {
        frame = new JFrame("Dashboard");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
