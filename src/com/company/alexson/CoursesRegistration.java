package com.company.alexson;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CoursesRegistration extends JFrame{
    private JPanel panelCourse;
    private JTextField textCourseName;
    private JTextField textTutor;
    private JList listCourse;
    private JButton buttonSave;
    private JButton buttonAdd;
    private JTextField textBranch;
    //    private JComboBox<String> branchCombobox;
    public static ArrayList<Courses> courses;
    private DefaultListModel listCourseModel;

//    private String[] branchOption = {"Branch I", "Branch II", "Branch III"};


    public CoursesRegistration(){
        super("Courses");
        this.setContentPane(this.panelCourse);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);

        courses = new ArrayList<Courses>();
        listCourseModel = new DefaultListModel();
        listCourse.setModel(listCourseModel);

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSaveClick(e);
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void buttonSaveClick(ActionEvent e){
//            Courses c = new Courses((String) comboBoxBranch.getSelectedItem(), textCourseName.getText(), textTutor.getText());
        Courses c = new Courses(textBranch.getText(), textCourseName.getText(), textTutor.getText());
        courses.add(c);
        refreshCourseList();

    }

    public void refreshCourseList(){
        listCourseModel.removeAllElements();
        System.out.println("Removing all course from list");
        for (Courses c : courses){
            System.out.println("Adding course to list: " + c.getCourseName());
            listCourseModel.addElement(c.getBranch() + " " + c.getCourseName() + " - " + c.getTutor());
        }
    }

    public void listCourseSelection(ListSelectionEvent e){
        int courseNumber =  listCourse.getSelectedIndex();
        if (courseNumber >= 0){
            Courses c = courses.get(courseNumber);
            textBranch.setText(c.getBranch());
            textCourseName.setText(c.getCourseName());
            textTutor.setText(c.getTutor());
//            buttonUpdate.setEnabled(true);
        }else {
//            buttonUpdate.setEnabled(false);
        }
    }

    public void addCourse(Courses course){
        courses.add(course);
        refreshCourseList();
    }
}
