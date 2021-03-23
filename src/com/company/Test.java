package com.company;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    public Test(){
        super("Test");

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        add(panel);

        ImageIcon image = new ImageIcon(getClass().getResource("login.png"));
        JLabel l = new JLabel(image);
        //panel.setLayout(new BorderLayout());
        panel.add(l);

    }

}
