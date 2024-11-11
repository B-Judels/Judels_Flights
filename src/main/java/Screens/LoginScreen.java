package Screens;

import Classes.Admin;
import Classes.Customer;
import Classes.User;
import Constants.GUI_Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class LoginScreen {

    private JFrame frame;
    private JPanel panel;
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private JLabel label;
    private ArrayList<User> users;
    private User user, user2;

    public static ArrayList<User> currentUser;

    public LoginScreen(){

        user = new Admin("BJudels", "Babyface", "0402165035088", "Bernard", "Judels", 20, "judelsbernard2@gmail.com", "Admin");
        user2 = new Customer("Zozol", "CaliOrange", "0309010163082", "Zoe", "Arndt", 21, "zoearndt2003@gmail.com", "Customer");
        users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        ArrayList<String> usernames = new ArrayList<>();
        usernames.add(user.getUsername());
        usernames.add(user2.getUsername());

        frame = new JFrame("Login Screen");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("src/Images/Flight.png").getImage());


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        //Image label
        ImageIcon icon = new ImageIcon("src/Images/flight.png");
        Image image = icon.getImage();
        Image scaled = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaled);

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(10, 10, 100, 100);
        panel.add(label);

        // Welcome Text
        label = new JLabel("Welcome to Judels Flights!");
        label.setBounds(120, 40, 350, 35);
        label.setFont(new Font("Tahoma", Font.BOLD, 26));
        panel.add(label);

        label = new JLabel("Login");
        label.setBounds(210, 90, 100, 40);
        label.setForeground(GUI_Constants.blue);
        label.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel.add(label);

        // username input
        label = new JLabel("Username:");
        label.setBounds(150, 182, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        username = new JTextField();
        username.setBounds(150, 200, 200, 30);
        GUI_Constants.Input(username);
        panel.add(username);

        //password input
        label = new JLabel("Password:");
        label.setBounds(150, 232, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        password = new JPasswordField();
        password.setBounds(150, 250, 200, 30);
        GUI_Constants.Input(password);
        password.setEchoChar('*');
        panel.add(password);

        login = new JButton("Login");
        login.setBounds(200, 300, 100, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    String name = username.getText();
                    String pass = password.getText().toString();

                    //condition to see if the username exists
                    if (usernames.contains(name)){
                        int i = usernames.indexOf(name);

                        String currentUsername = users.get(i).getUsername();
                        String currentPassword = users.get(i).getPassword();
                        String currentID = users.get(i).getId();
                        String currentName = users.get(i).getName();
                        String currentSurname = users.get(i).getSurname();
                        int currentAge = users.get(i).getAge();
                        String currentEmail = users.get(i).getEmail();
                        String currentRole = users.get(i).getRole();

                        //Condition to see if the password is correct
                        if(pass.equals(currentPassword)){
                            currentUser = new ArrayList<>();
                            currentUser.add(new User(currentUsername, currentPassword, currentID, currentName, currentSurname, currentAge, currentEmail, currentRole));

                            //last condition to check user's roles to send them to the correct page.
                            if(currentRole.equals("Admin")){

                                frame.setVisible(false);
                                AdminScreen adminScreen = new AdminScreen();
                                adminScreen.show();

                            } else if (currentRole.equals("Customer")) {

                                frame.setVisible(false);
                                FlightSearchScreen flightSearchScreen = new FlightSearchScreen();
                                flightSearchScreen.show();

                            }else{
                                JOptionPane.showMessageDialog(frame, "Something went wrong, unknown role");
                            }


                        }else{
                            JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                        }

                    }else{
                        JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Something went wrong");
                }
            }
        });
        GUI_Constants.Button(login);
        panel.add(login);


    }
    public void show(){
        frame.setVisible(true);
    }
}
