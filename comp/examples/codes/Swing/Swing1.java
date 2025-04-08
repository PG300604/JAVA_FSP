package comp.examples.codes.Swing;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Swing1 {
    private JPanel panel1;
    private JLabel Data;

    public Swing1() {
        JFrame frame = new JFrame("Clock");
        panel1 = new JPanel();
        Data = new JLabel();
        Data.setFont(new Font("Arial", Font.BOLD, 30));
        panel1.add(Data);
        frame.setContentPane(panel1);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                updateclock();
            }
        }, 0, 1000);
    }

    private void updateclock() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String time = sdf.format(new Date());
        Data.setText(time);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing1();
            }
        });
    }
}
