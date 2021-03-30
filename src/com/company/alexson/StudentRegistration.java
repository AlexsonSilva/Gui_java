package com.company.alexson;

import javax.swing.*;
import java.awt.*;

public class StudentRegistration extends JFrame{
    private final JLabel FORM_LABEL;
    private final JLabel ID_LABEL;
    private final JLabel FN_LABEL;
    private final JLabel LN_LABEL;
    private final JLabel GENDER_LABEL;
    private final JLabel BIRTH_DATE_LABEL;
    private final JLabel PHONE_LABEL;
    private final JLabel ADDRESS_LABEL;
    private final JLabel CITY_LABEL;
    private final JLabel EMAIL_LABEL;
    private final JLabel PASSWORD_LABEL;

    private final JTextField ID_TEXTFIELD;
    private final JTextField FN_TEXTFIELD;
    private final JTextField LN_TEXTFIELD;
    private final JCheckBox MALE_CHECKBOX;
    private final JCheckBox FEMALE_CHECKBOX;
    private final ButtonGroup CHECKBOX_GROUP;
    private final JTextField BIRTH_DATE_TEXTFIELD;
    private final JTextField PHONE_TEXTFIELD;
    private final JTextField ADDRESS_TEXTFIELD;
    private final JTextField CITY_TEXTFIELD;
    private final JTextField EMAIL_TEXTFIELD;
    private final JTextField PASSWORD_TEXTFIELD;

    private final JButton SUBMIT_BUTTON;
    private final JButton CLEAR_BUTTON;

    public StudentRegistration(){
        super("Student Registration");

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        setLayout(null);
        Insets insets = panel.getInsets();
        Dimension size = panel.getPreferredSize();
        panel.setBounds(0 + insets.left, 0 + insets.top,
                450, 30);


        FORM_LABEL = new JLabel("Registration Form");
        FORM_LABEL.setFont(new Font("Tahoma", Font.PLAIN, 18));
        FORM_LABEL.setForeground(Color.white);
        setLayout(null);
        insets = FORM_LABEL.getInsets();
        size = FORM_LABEL.getPreferredSize();
        FORM_LABEL.setBounds(150 + insets.left, 5 + insets.top,
                size.width, size.height);
        add(FORM_LABEL);
        add(panel);

        ID_LABEL = new JLabel("Student ID:");
        setLayout(null);
        insets = ID_LABEL.getInsets();
        size = ID_LABEL.getPreferredSize();
        ID_LABEL.setBounds(25 + insets.left, 55 + insets.top,
                size.width, size.height);
        add(ID_LABEL);

        FN_LABEL = new JLabel("First Name:");
        setLayout(null);
        insets = FN_LABEL.getInsets();
        size = FN_LABEL.getPreferredSize();
        FN_LABEL.setBounds(25 + insets.left, 85 + insets.top,
                size.width, size.height);
        add(FN_LABEL);

        LN_LABEL = new JLabel("Last Name:");
        setLayout(null);
        insets = LN_LABEL.getInsets();
        size = LN_LABEL.getPreferredSize();
        LN_LABEL.setBounds(25 + insets.left, 115 + insets.top,
                size.width, size.height);
        add(LN_LABEL);

        GENDER_LABEL = new JLabel("Gender:");
        setLayout(null);
        insets = GENDER_LABEL.getInsets();
        size = GENDER_LABEL.getPreferredSize();
        GENDER_LABEL.setBounds(25 + insets.left, 145 + insets.top,
                size.width, size.height);
        add(GENDER_LABEL);

        BIRTH_DATE_LABEL = new JLabel("Birth Date:");
        setLayout(null);
        insets = BIRTH_DATE_LABEL.getInsets();
        size = BIRTH_DATE_LABEL.getPreferredSize();
        BIRTH_DATE_LABEL.setBounds(25 + insets.left, 175 + insets.top,
                size.width, size.height);
        add(BIRTH_DATE_LABEL);

        PHONE_LABEL = new JLabel("Phone Number:");
        setLayout(null);
        insets = PHONE_LABEL.getInsets();
        size = PHONE_LABEL.getPreferredSize();
        PHONE_LABEL.setBounds(25 + insets.left, 205 + insets.top,
                size.width, size.height);
        add(PHONE_LABEL);

        ADDRESS_LABEL = new JLabel("Address:");
        setLayout(null);
        insets = ADDRESS_LABEL.getInsets();
        size = ADDRESS_LABEL.getPreferredSize();
        ADDRESS_LABEL.setBounds(25 + insets.left, 235 + insets.top,
                size.width, size.height);
        add(ADDRESS_LABEL);

        CITY_LABEL = new JLabel("City:");
        setLayout(null);
        insets = CITY_LABEL.getInsets();
        size = CITY_LABEL.getPreferredSize();
        CITY_LABEL.setBounds(25 + insets.left, 265 + insets.top,
                size.width, size.height);
        add(CITY_LABEL);

        EMAIL_LABEL = new JLabel("Email Address:");
        setLayout(null);
        insets = EMAIL_LABEL.getInsets();
        size = EMAIL_LABEL.getPreferredSize();
        EMAIL_LABEL.setBounds(25 + insets.left, 295 + insets.top,
                size.width, size.height);
        add(EMAIL_LABEL);

        PASSWORD_LABEL = new JLabel("Password:");
        setLayout(null);
        insets = PASSWORD_LABEL.getInsets();
        size = PASSWORD_LABEL.getPreferredSize();
        PASSWORD_LABEL.setBounds(25 + insets.left, 325 + insets.top,
                size.width, size.height);
        add(PASSWORD_LABEL);

        //Add TextField
        ID_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = ID_TEXTFIELD.getInsets();
        size = ID_TEXTFIELD.getPreferredSize();
        ID_TEXTFIELD.setBounds(150 + insets.left, 45 + insets.top,
                80, size.height);
        add(ID_TEXTFIELD);

        FN_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = FN_TEXTFIELD.getInsets();
        size = FN_TEXTFIELD.getPreferredSize();
        FN_TEXTFIELD.setBounds(150 + insets.left, 75 + insets.top,
                200, size.height);
        add(FN_TEXTFIELD);

        LN_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = LN_TEXTFIELD.getInsets();
        size = LN_TEXTFIELD.getPreferredSize();
        LN_TEXTFIELD.setBounds(150 + insets.left, 105 + insets.top,
                200, size.height);
        add(LN_TEXTFIELD);

        BIRTH_DATE_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = BIRTH_DATE_TEXTFIELD.getInsets();
        size = BIRTH_DATE_TEXTFIELD.getPreferredSize();
        BIRTH_DATE_TEXTFIELD.setBounds(150 + insets.left, 165 + insets.top,
                105, size.height);
        add(BIRTH_DATE_TEXTFIELD);

        PHONE_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = PHONE_TEXTFIELD.getInsets();
        size = PHONE_TEXTFIELD.getPreferredSize();
        PHONE_TEXTFIELD.setBounds(150 + insets.left, 195 + insets.top,
                105, size.height);
        add(PHONE_TEXTFIELD);

        ADDRESS_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = ADDRESS_TEXTFIELD.getInsets();
        size = ADDRESS_TEXTFIELD.getPreferredSize();
        ADDRESS_TEXTFIELD.setBounds(150 + insets.left, 225 + insets.top,
                250, size.height);
        add(ADDRESS_TEXTFIELD);

        CITY_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = CITY_TEXTFIELD.getInsets();
        size = CITY_TEXTFIELD.getPreferredSize();
        CITY_TEXTFIELD.setBounds(150 + insets.left, 255 + insets.top,
                105, size.height);
        add(CITY_TEXTFIELD);

        EMAIL_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = EMAIL_TEXTFIELD.getInsets();
        size = EMAIL_TEXTFIELD.getPreferredSize();
        EMAIL_TEXTFIELD.setBounds(150 + insets.left, 285 + insets.top,
                250, size.height);
        add(EMAIL_TEXTFIELD);

        PASSWORD_TEXTFIELD = new JTextField();
        setLayout(null);
        insets = PASSWORD_TEXTFIELD.getInsets();
        size = PASSWORD_TEXTFIELD.getPreferredSize();
        PASSWORD_TEXTFIELD.setBounds(150 + insets.left, 315 + insets.top,
                105, size.height);
        add(PASSWORD_TEXTFIELD);

        //Add Button
        SUBMIT_BUTTON = new JButton("Submit");
        setLayout(null);
        insets = SUBMIT_BUTTON.getInsets();
        size = SUBMIT_BUTTON.getPreferredSize();
        SUBMIT_BUTTON.setBounds(130 + insets.left,370 + insets.top,
                size.width, size.height);
        add(SUBMIT_BUTTON);

        CLEAR_BUTTON = new JButton("Clear");
        setLayout(null);
        insets = CLEAR_BUTTON.getInsets();
        size = CLEAR_BUTTON.getPreferredSize();
        CLEAR_BUTTON.setBounds(230 + insets.left,370 + insets.top,
                size.width, size.height);
        add(CLEAR_BUTTON);

        //Add CheckBox
        MALE_CHECKBOX = new JCheckBox("Male");
        setLayout(null);
        insets = MALE_CHECKBOX.getInsets();
        size = MALE_CHECKBOX.getPreferredSize();
        MALE_CHECKBOX.setBounds(150 + insets.left, 135 + insets.top,
                105, size.height);
        add(MALE_CHECKBOX);

        FEMALE_CHECKBOX = new JCheckBox("Female");
        setLayout(null);
        insets = FEMALE_CHECKBOX.getInsets();
        size = FEMALE_CHECKBOX.getPreferredSize();
        FEMALE_CHECKBOX.setBounds(230 + insets.left, 135 + insets.top,
                105, size.height);
        add(FEMALE_CHECKBOX);

        CHECKBOX_GROUP = new ButtonGroup();
        CHECKBOX_GROUP.add(MALE_CHECKBOX);
        CHECKBOX_GROUP.add(FEMALE_CHECKBOX);

    }

}
