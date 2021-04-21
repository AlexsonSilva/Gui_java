package com.company.alexson;

import javax.swing.*;

public class Courses {
    private String branch;
    private String courseName;
    private String tutor;

    public Courses(String branch, String courseName, String tutor) {
        this.branch = branch;
        this.courseName = courseName;
        this.tutor = tutor;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
}
