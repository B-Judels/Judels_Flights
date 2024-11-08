package Screens;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class LoginScreen {

    private JFrame frame;
    private JPanel panel;
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private JLabel label;

    public LoginScreen(){
        frame = new JFrame("Login Screen");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        label = new JLabel("Welcome to Judels Flights!");
        label.setBounds(100, 10, 300, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(label);

        label = new JLabel("Login");
        label.setBounds(210, 50, 50, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        panel.add(label);

        // username input
        label = new JLabel("Username:");
        label.setBounds(150, 82, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        username = new JTextField();
        username.setBounds(150, 100, 200, 30);
        panel.add(username);

        //password input
        label = new JLabel("Password:");
        label.setBounds(150, 132, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        password = new JPasswordField();
        password.setBounds(150, 150, 200, 30);
        panel.add(password);

        login = new JButton("Login");
        login.setBounds(200, 200, 100, 30);
        panel.add(login);
    }
    public void show(){
        frame.setVisible(true);
    }
}
