package com.company.alexson;

import javax.swing.*;

public class MenuBuilder {
    public static void Run(){
        StartMenu();
    }
    private static void StartMenu(){
        Login login = new Login(); //creates a frame
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        login.setResizable(false); //prevent frame from being resized
        login.setSize(660, 440); //sets the x-dimension, and y-dimension of frame
        login.setVisible(true); //make frame visible
    }

}
