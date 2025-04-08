package comp.examples.codes.Swing;

import javax.swing.*;
import java.awt.*;

public class Form {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JComboBox<String> comboBox1;
    private JButton nextButton;
    private JButton resetButton;
    private JButton registerButton;

    private JFrame frame;

    public Form() {

        comboBox1.addItem("Select");
        comboBox1.addItem("C++");
        comboBox1.addItem("JAVA");
        comboBox1.addItem("KOTLIN");
        comboBox1.addItem("HTML");
        comboBox1.addItem("CSS");
        comboBox1.addItem("PYTHON");
        comboBox1.addItem("C#");


        resetButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainPanel, "Button is Clicked: Reset");
            textField1.setText("");
            textField2.setText("");
            passwordField1.setText("");
            comboBox1.setSelectedIndex(0);
        });

        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainPanel, "Button is Clicked: Register");
        });

        nextButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainPanel, "Button is Clicked: Next");
            frame.dispose();  // Close Form
            Dashboard dashboard = new Dashboard();
            dashboard.showDashboard();
        });
    }

    public void showForm() {
        frame = new JFrame("Form");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Form().showForm();
    }

    {
        mainPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        textField1 = new JTextField();
        textField2 = new JTextField();
        passwordField1 = new JPasswordField();
        comboBox1 = new JComboBox<>();

        nextButton = new JButton("Next");
        resetButton = new JButton("Reset");
        registerButton = new JButton("Register");

        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        mainPanel.add(new JLabel("First Name:"));
        mainPanel.add(textField1);

        mainPanel.add(new JLabel("Last Name:"));
        mainPanel.add(textField2);

        mainPanel.add(new JLabel("Password:"));
        mainPanel.add(passwordField1);

        mainPanel.add(new JLabel("Courses:"));
        mainPanel.add(comboBox1);

        mainPanel.add(registerButton);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(resetButton);
        buttonPanel.add(nextButton);
        mainPanel.add(buttonPanel);
    }
}
