package Main;


import Screens.LoginScreen;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginScreen main = new LoginScreen();
                main.show();
            }
        });

    }
}