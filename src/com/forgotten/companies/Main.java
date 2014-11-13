package com.forgotten.companies;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Noobton Comander");


        Screen screen = new Screen();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setContentPane(screen);
        window.setResizable(false);
        window.setVisible(true);
        window.setAlwaysOnTop(true);
        window.pack();

    }
}
