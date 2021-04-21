package com.company.alexson;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentInformation extends JFrame{
    private JPanel panelMain;
    private JList listTimetable;
    private JButton buttonAddCourse;
    private JPanel panelTimetable;
    private JTextField textId;
    private JTextField textFirstName;
    private JTextField textLastName;
    private JTextField textEmail;
    private JTextField textPassword;
    private JList listPeople;
    private JButton buttonAddTimetable;
    private JTextField textBranch;
    private JTextField textCourse;
    private JButton buttonSaveNew;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JList listLectures;
    private JList listExams;
    private JLabel labelId;
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JLabel labelTimetable;
    private JLabel labelCourseListening;
    private JLabel labelBranch;
    private JLabel labelCourse;
    private JLabel labelLectures;
    private JLabel labelExams;
    private ArrayList<Person> people;
    private DefaultListModel listPeopleModel;

    public StudentInformation(){
        super("Student Information");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);

        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);

        buttonUpdate.setEnabled(false);

        buttonSaveNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNewClick(e);
            }
        });

        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSavedClick(e);
            }
        });
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listPeopleSelection(e);
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClearClick(e);
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDeleteClick(e);
            }
        });
        buttonAddCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    CoursesRegistration coursesRegistration = new CoursesRegistration(); //creates a frame
                    coursesRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    coursesRegistration.setResizable(false); //prevent frame from being resized
                    coursesRegistration.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    coursesRegistration.setVisible(true); //make frame visible

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    public void buttonNewClick(ActionEvent e){
        Person p = new Person(textFirstName.getText(), textLastName.getText(),
                textEmail.getText(), textId.getText(), textPassword.getText());
        people.add(p);
        refreshPeopleList();

    }


    public void buttonDeleteClick(ActionEvent e){
        int personNumber = listPeople.getSelectedIndex();
//        listPeopleModel.remove(personNumber);

        listPeopleModel.removeElement(listPeople.getSelectedValue());
        listPeopleModel.removeElement(personNumber);
//        listPeopleModel.removeElementAt(personNumber);
        textFirstName.setText("");
        textLastName.setText("");
        textEmail.setText("");
        textId.setText("");
        textPassword.setText("");

//        refreshPeopleList();

    }

    public void buttonSavedClick(ActionEvent e){
        int personNumber = listPeople.getSelectedIndex();
        if (personNumber >=0){
            Person p = people.get(personNumber);
            p.setFirstName(textFirstName.getText());
            p.setLastName(textLastName.getText());
            p.setEmail(textEmail.getText());
            p.setId(textId.getText());
            p.setPassword(textPassword.getText());
            refreshPeopleList();
        }
    }

    public void buttonClearClick(ActionEvent e){
        textFirstName.setText("");
        textLastName.setText("");
        textEmail.setText("");
        textId.setText("");
        textPassword.setText("");
    }

    public void listPeopleSelection(ListSelectionEvent e){
        int personNumber =  listPeople.getSelectedIndex();
        if (personNumber >= 0){
            Person p = people.get(personNumber);
            textFirstName.setText(p.getFirstName());
            textLastName.setText(p.getLastName());
            textEmail.setText(p.getEmail());
            textId.setText(p.getId());
            textPassword.setText(p.getPassword());
            buttonUpdate.setEnabled(true);
        }else {
            buttonUpdate.setEnabled(false);
        }

    }

    public void refreshPeopleList(){
        listPeopleModel.removeAllElements();
        System.out.println("Removing all people from list");
        for (Person p : people){
            System.out.println("Adding person to list: " + p.getFirstName());
            listPeopleModel.addElement(p.getFirstName() + " " + p.getLastName() + " - " + p.getEmail() + " - " + p.getId());
        }

    }

    public void addPerson(Person person){
        people.add(person);
        refreshPeopleList();
    }

}
