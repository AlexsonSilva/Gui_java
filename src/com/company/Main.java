package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//        Login login = new Login(); //creates a frame
//        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        login.setResizable(false); //prevent frame from being resized
//        login.setSize(950, 850); //sets the x-dimension, and y-dimension of frame
//        login.setVisible(true); //make frame visible
//        login.setLayout(new BorderLayout());
//        login.getContentPane().setBackground(Color.GRAY); //change color of background

        StudentRegistration sr = new StudentRegistration();
        sr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sr.setResizable(false);
        sr.setSize(450,450);
        sr.setVisible(true);

//        Test test = new Test();
//        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        test.setSize(300,300);
//        test.setVisible(true);


    }
}
