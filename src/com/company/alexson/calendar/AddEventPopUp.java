package com.company.alexson.calendar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEventPopUp extends JFrame {
    private DataModel model;
    private JButton save;
    private JTextField course;
    private JTextField hour;
    private JTextField minutes;
    private JTextArea specification;
    private JLabel date;

    private final JLabel COURSE_LABEL;
    private final JLabel SPECIFICATION_LABEL;
    private final JLabel HOUR_MINUTES_LABEL;

    //private JPanel panel;

    /**
     * creates a constructor object for the class
     *
     * @param d dataModel
     */
    public AddEventPopUp(DataModel d) {
        model = d;
//            setLayout(new BorderLayout());
//            setSize(300, 300);

        JLabel background = new JLabel();
        add(background);

        SpringLayout layout = new SpringLayout();
        setSize(300, 320);
        background.setLayout(layout);

        date = new JLabel(model.getCurrentDate());
//            date.setPreferredSize(new Dimension(100, 25));
        layout.putConstraint(SpringLayout.WEST, date, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(date);
        labelCons.setX(Spring.constant(10));
        labelCons.setY(Spring.constant(5));
        background.add(date);

        COURSE_LABEL = new JLabel("Course");
        layout.putConstraint(SpringLayout.WEST, COURSE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSE_LABEL);
        labelCons.setX(Spring.constant(10));
        labelCons.setY(Spring.constant(25));
        background.add(COURSE_LABEL);

        course = new JTextField("", 20);
        layout.putConstraint(SpringLayout.WEST, course, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(course);
        labelCons.setX(Spring.constant(10));
        labelCons.setY(Spring.constant(45));
        background.add(course);

        SPECIFICATION_LABEL = new JLabel("Specification");
        layout.putConstraint(SpringLayout.WEST, SPECIFICATION_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATION_LABEL);
        labelCons.setX(Spring.constant(10));
        labelCons.setY(Spring.constant(80));
        background.add(SPECIFICATION_LABEL);

        specification = new JTextArea();
        layout.putConstraint(SpringLayout.WEST, specification, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(specification);
        labelCons.setX(Spring.constant(12));
        labelCons.setY(Spring.constant(100));
        labelCons.setWidth(Spring.constant(250));
        labelCons.setHeight(Spring.constant(105));
        background.add(specification);

        HOUR_MINUTES_LABEL = new JLabel("Hour/Minutes");
        layout.putConstraint(SpringLayout.WEST, HOUR_MINUTES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(HOUR_MINUTES_LABEL);
        labelCons.setX(Spring.constant(12));
        labelCons.setY(Spring.constant(210));
        background.add(HOUR_MINUTES_LABEL);

        hour = new JTextField("00", 2);
        layout.putConstraint(SpringLayout.WEST, hour, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(hour);
        labelCons.setX(Spring.constant(12));
        labelCons.setY(Spring.constant(225));
        background.add(hour);

        minutes = new JTextField("00", 2);
        layout.putConstraint(SpringLayout.WEST, minutes, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(minutes);
        labelCons.setX(Spring.constant(45));
        labelCons.setY(Spring.constant(225));
        background.add(minutes);

        save = new JButton("Save");
        layout.putConstraint(SpringLayout.WEST, save, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(save);
        labelCons.setX(Spring.constant(10));
        labelCons.setY(Spring.constant(260));
        background.add(save);

//            specification = new JTextField();
//            specification.setPreferredSize(new Dimension(200, 50));
//
//            hour = new JTextField();
//            hour.setPreferredSize(new Dimension(50, 25));
//
//            minutes = new JTextField();
//            minutes.setPreferredSize(new Dimension(50, 25));



//            background.setLayout(new FlowLayout());
//            background.add(specification);
//            background.add(date);
//            background.add(hour);
//            background.add(minutes);
//            background.add(save);


        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) { // &&
                // date.getText().isEmpty()
                Event et = null;
                boolean flag = true;
                if (!(course.getText().isEmpty() && hour.getText().isEmpty() && minutes.getText().isEmpty() && specification.getText().isEmpty())) {

                    et = new Event(course.getText(),  date.getText(), hour.getText(), minutes.getText(), specification.getText());

                    for (Event s : model.getData()) {
                        if (et.equals(s)) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    model.update(et);
                    dispose();
                } else {
                    JFrame f = new JFrame("Error");
                    f.setSize(300, 100);
                    JLabel lbl = new JLabel("Please enter another event without Time Conflict");
                    f.add(lbl);
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setResizable(false);
                    f.setVisible(true);
                }
            }
        });

//            add(course, BorderLayout.NORTH);
//            add(background, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}

