package com.company.alexson;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        MenuBuilder.Run();



//        StudentRegistration sr = new StudentRegistration();
//        sr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        sr.setResizable(false);
//        sr.setSize(450,450);
//        sr.setVisible(true);

//        AssignmentPage_Student assignmentPage_student = new AssignmentPage_Student(); //creates a frame
//        assignmentPage_student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        assignmentPage_student.setResizable(false); //prevent frame from being resized
//        assignmentPage_student.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
//        assignmentPage_student.setVisible(true); //make frame visible



        AdminPage adminPage = new AdminPage(); //creates a frame
        adminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        adminPage.setResizable(false); //prevent frame from being resized
        adminPage.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
        adminPage.setVisible(true); //make frame visible


//        AdminStudent adminStudent = new AdminStudent(); //creates a frame
//        adminStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        adminStudent.setResizable(false); //prevent frame from being resized
//        adminStudent.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
//        adminStudent.setVisible(true); //make frame visible

//        Login test = new Login();
//        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        test.setSize(660,440);
//        test.setVisible(true);


//        StudentInformation studentInformation = new StudentInformation();
//        studentInformation.setVisible(true);
//
//        Person alexson = new Person("Alexson", "Silva", "alexsonsilva@gmail.com", "21643", "1234");
//        Person val = new Person("Valeria", "Paz", "val@gmail.com", "1234", "1234");
//        Person marcus = new Person("Marcus", "Moura", "marcus@gmail.com", "5678", "1234");
//
//        studentInformation.addPerson(alexson);
//        studentInformation.addPerson(val);
//        studentInformation.addPerson(marcus);

//        CoursesRegistration coursesRegistration = new CoursesRegistration();
//        Courses Java = new Courses("Branch I", "Java", "John");
//        Courses Maths = new Courses("Branch II", "Maths", "Anette");
//        Courses Data = new Courses("Branch III", "Data Storage", "Wenhao");
//
//        coursesRegistration.addCourse(Java);
//        coursesRegistration.addCourse(Maths);
//        coursesRegistration.addCourse(Data);


//        LecturerRegistration lecturerRegistration = new LecturerRegistration();
//        lecturerRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        lecturerRegistration.setResizable(false); //prevent frame from being resized
//        lecturerRegistration.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
//        lecturerRegistration.setVisible(true); //make frame visible

//        StudentRegistration studentRegistration = new StudentRegistration();
//        studentRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        studentRegistration.setResizable(false); //prevent frame from being resized
//        studentRegistration.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
//        studentRegistration.setVisible(true); //make frame visible


    }
}
