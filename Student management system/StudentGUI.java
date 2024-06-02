package CourseWork;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class StudentGUI {

    private JFrame studentFrame, regularFrame, dropoutFrame;
    private JPanel studentPanel, regularPanel, dropoutPanel ;
    private JTextField studentNameTextfield, enrollmentIDTextfield, courseNameTextField, courseDurationTextField,
            tuitionFeeTextField, numOfModulesTextField, monthAttendedTextfield, creditHoursTextField,
            remainingModulesTextField, daysPresentTextField, regularEIDTextField, regularDPTextField,
            removeEIDTextField, GCCNTextField, billsEIDTextField;
    private JComboBox yearComboBox,MonthComboBox,dayComboBox, yearEnrollComboBox, monthEnrollComboBox,
            dayEnrollComboBox,GCYearEnrollComboBox, dayEnrollGCCmoboBox, mothGCComboBox,  dayDropoutComboBox,
            yearDropoutComboBox, monthDropoutComboBox;
           
           
    JButton regularButton, addRegularButton,  presentpercentageButton,  grantcertificateButton, studentClearButton,regularDisplayButton,   backButton ,dropoutButton, dropoutDisplayButton,addDropoutStudentButton, dropoutClearButton, removeStdButton, BackButton, regularClearButton,
           removeStudentButton, billsPayableButton, calculateGCButton ;
    JLabel regularLabel;
    static final int INVALID = -1;
    ArrayList<Student> al = new ArrayList<Student>();

    public void show() {
        // JFrame for Student class
        studentFrame = new JFrame("Student class");
        studentFrame.setSize(700, 700);
        studentFrame.setResizable(false);
        studentFrame.setLocationRelativeTo(null);
        studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentFrame.getContentPane().setBackground(Color.lightGray);

        // JPanel inside studentFrame
        studentPanel = new JPanel();
        studentPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        studentPanel.setSize(600, 600);
        studentPanel.setLocation(42, 27);
        studentPanel.setLayout(null);
        studentPanel.setBackground(Color.GRAY);
        studentFrame.add(studentPanel);

        // JLabel for Student
        regularLabel = new JLabel();
        regularLabel.setText("Student");
        regularLabel.setBounds(220, 10, 200, 40);
        regularLabel.setFont(new Font("Arial", Font.BOLD, 20));
        regularLabel.setForeground(Color.WHITE);
        studentPanel.add(regularLabel);

        // JLabel for studentName
        JLabel studentNameLabel = new JLabel("studentName");
        studentNameLabel.setFont(new Font("Arial", Font.BOLD, 16)); // to set a font
        studentNameLabel.setBounds(50, 70, 200, 30);
        studentNameLabel.setForeground(Color.WHITE); // color of JLabel
        studentPanel.add(studentNameLabel);

        studentNameTextfield = new JTextField();
        studentNameTextfield.setBounds(200, 70, 200, 30);
        studentPanel.add(studentNameTextfield);

        // JLabel for enrollmentID
        JLabel enrollmentIDLabel = new JLabel("enrollmentID");
        enrollmentIDLabel.setFont(new Font("Arial", Font.BOLD, 16)); // to set a font
        enrollmentIDLabel.setBounds(50, 120, 200, 30);
        enrollmentIDLabel.setForeground(Color.WHITE);
        studentPanel.add(enrollmentIDLabel);

        enrollmentIDTextfield = new JTextField();
        enrollmentIDTextfield.setBounds(200, 120, 200, 30);
        studentPanel.add(enrollmentIDTextfield);

        // JLabel for dateOfBirth
        JLabel dateOFBithLabel = new JLabel("dateOfBirth");
        dateOFBithLabel.setFont(new Font("Arial", Font.BOLD, 16));
        dateOFBithLabel.setBounds(50, 170, 200, 30);
        dateOFBithLabel.setForeground(Color.WHITE);
        studentPanel.add(dateOFBithLabel);

        // create the arrayList to hold the year
        ArrayList<String> birthYear = new ArrayList<String>(); // Arraylist
        birthYear.add("Year");// add year in the variable years as the frist item
        for (int i = 1950; i <= 2050; i++) {
            birthYear.add(String.valueOf(i)); // element of int to String i.e 1950 to "1950" and add into
                                              // years variable
        }
        yearComboBox = new JComboBox<>(birthYear.toArray(new String[0])); // JComboBox for year
        yearComboBox.setBounds(200, 170, 60, 30);
        studentPanel.add(yearComboBox);

        // create an arrayList to store a month
        String[] arrayBirthMonth = { "Month", "January", "February", "March", "April", "May", "June", "July", "August","October", "November", "December" };

        MonthComboBox = new JComboBox(arrayBirthMonth);
        MonthComboBox.setBounds(270, 170, 60, 30);
        studentPanel.add(MonthComboBox);

        // Create the ArrayList to hold the day
        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("Day");
        for (int j = 1; j < 32; j++) {
            birthDay.add(String.valueOf(j));
        }
        dayComboBox = new JComboBox<>(birthDay.toArray(new String[0])); // JComboBox for day
        dayComboBox.setBounds(340, 170, 60, 30);
        studentPanel.add(dayComboBox);

        // Jlabel for courseName
        JLabel courseNameLabel = new JLabel(
                "courseName");
        courseNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        courseNameLabel.setForeground(Color.white);
        courseNameLabel.setBounds(50, 220, 200, 30);
        studentPanel.add(courseNameLabel);

        courseNameTextField = new JTextField();
        courseNameTextField.setBounds(200, 220, 200, 30);
        studentPanel.add(courseNameTextField);

        // JLabel for dateOfEnrollment
        JLabel dateOfEnrollmentLabel = new JLabel(
                "dateOfEnrollment");
        dateOfEnrollmentLabel.setFont(new Font("Arial", Font.BOLD, 16));
        dateOfEnrollmentLabel.setForeground(Color.white);
        dateOfEnrollmentLabel.setBounds(50, 270, 200, 30);
        studentPanel.add(dateOfEnrollmentLabel);

        // ArrayList for yearEnroll
        ArrayList<String> yearEnroll = new ArrayList<>();
        yearEnroll.add("Year");
        for (int i = 1950; i <= 2050; i++) {
            yearEnroll.add(String.valueOf(i));
        }
        yearEnrollComboBox = new JComboBox(yearEnroll.toArray()); // year
        yearEnrollComboBox.setBounds(200, 270, 60, 30);
        studentPanel.add(yearEnrollComboBox);

        // array for monthEnroll
        String[] arrayMonthEnroll = { "Month", "January", "February", "March", "April", "May", "June", "July",
                "August",
                "October", "November", "December" };

        monthEnrollComboBox = new JComboBox(arrayMonthEnroll);
        monthEnrollComboBox.setBounds(270, 270, 60, 30);
        studentPanel.add(monthEnrollComboBox);

        // ArrayList for day
        ArrayList<String> dayEnroll = new ArrayList<>();
        dayEnroll.add("Day");
        for (int i = 1; i <= 32; i++) {
            dayEnroll.add(String.valueOf(i));
        }

        dayEnrollComboBox = new JComboBox(dayEnroll.toArray());
        dayEnrollComboBox.setBounds(340, 270, 60, 30);
        studentPanel.add(dayEnrollComboBox);

        // Jlabel for courseDuration
        JLabel courseDurationLabel = new JLabel(
                "courseDuration");
        courseDurationLabel.setFont(new Font("Arial", Font.BOLD, 16));
        courseDurationLabel.setForeground(Color.white);
        courseDurationLabel.setBounds(50, 320, 200, 30);
        studentPanel.add(courseDurationLabel);

        courseDurationTextField = new JTextField();
        courseDurationTextField.setBounds(200, 320, 200, 30);
        studentPanel.add(courseDurationTextField);

        // JLabel for tuitionFee
        JLabel tuitionFeeLabel = new JLabel(
                "tuitionFee");
        tuitionFeeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        tuitionFeeLabel.setForeground(Color.white);
        tuitionFeeLabel.setBounds(50, 370, 200, 30);
        studentPanel.add(tuitionFeeLabel);

        tuitionFeeTextField = new JTextField();
        tuitionFeeTextField.setBounds(200, 370, 200, 30);
        studentPanel.add(tuitionFeeTextField);

        // Clear button to clear all the details of Student class
        studentClearButton = new JButton("Clear");
        studentClearButton.setBounds(250, 450, 100, 30);
        studentPanel.add(studentClearButton);
        // Anonymous for studentClearButton
        studentClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentNameTextfield.setText("");
                enrollmentIDTextfield.setText("");
                yearComboBox.setSelectedIndex(0);
                MonthComboBox.setSelectedIndex(0);
                dayComboBox.setSelectedIndex(0);
                courseNameTextField.setText("");
                yearEnrollComboBox.setSelectedIndex(0);
                monthEnrollComboBox.setSelectedIndex(0);
                dayEnrollComboBox.setSelectedIndex(0);
                courseDurationTextField.setText("");
                tuitionFeeTextField.setText("");
            }
        });

        Color borderDisplay = Color.WHITE;
        LineBorder DisplayBorders = new LineBorder(borderDisplay, 5);
        studentClearButton.setBorder(DisplayBorders);

        // JButton for Regular class
         regularButton = new JButton("Regular");
        regularButton.setBounds(20, 530, 200, 50);
        regularButton.setFont(new Font("Arial", Font.BOLD, 22));
        studentPanel.add(regularButton);

        Color borderColor = Color.WHITE;
        LineBorder lineBorder = new LineBorder(borderColor, 5);
        regularButton.setBorder(lineBorder);

        // Anonymous class for Regular button
        regularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (fieldStudentDetails() == false) {
                    JOptionPane.showMessageDialog(studentPanel,
                            "Please fill all the details in the Student class first.", "Missing Details",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                studentFrame.dispose(); // to close a studentFrame
                regularFrame = new JFrame("Regular class");
                regularFrame.setSize(650, 650);
                regularFrame.setResizable(false);
                regularFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                regularFrame.getContentPane().setBackground(Color.lightGray);

                // JPanel1 for Regular class
                regularPanel = new JPanel();
                regularPanel.setSize(600, 600);
                regularPanel.setLocation(20, 5);
                regularPanel.setLayout(null);
                regularPanel.setBackground(Color.GRAY);
                regularPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); // border
                regularFrame.add(regularPanel);

                JLabel regularLabel = new JLabel();
                regularLabel.setText("Regular Student");
                regularLabel.setBounds(220, 10, 200, 40);
                regularLabel.setFont(new Font("Arial", Font.BOLD, 22));
                regularLabel.setForeground(Color.WHITE);
                regularPanel.add(regularLabel);

                // JLabels for numOfModules
                JLabel numOfModulesLabel = new JLabel(
                        "numOfModules");
                numOfModulesLabel.setFont(new Font("Arial", Font.BOLD, 16));
                numOfModulesLabel.setForeground(Color.white);
                numOfModulesLabel.setBounds(50, 80, 200, 30);
                regularPanel.add(numOfModulesLabel);

                numOfModulesTextField = new JTextField();
                numOfModulesTextField.setBounds(210, 80, 210, 30);
                regularPanel.add(numOfModulesTextField);

                // Jlabel for numOfCreditHours
                JLabel creditHoursLabel = new JLabel(
                        "numOfCreditHours");
                creditHoursLabel.setFont(new Font("Arial", Font.BOLD, 16));
                creditHoursLabel.setForeground(Color.white);
                creditHoursLabel.setBounds(50, 130, 200, 30);
                regularPanel.add(creditHoursLabel);

                creditHoursTextField = new JTextField();
                creditHoursTextField.setBounds(210, 130, 210, 30);
                regularPanel.add(creditHoursTextField);

                // Jlabel for daysPresent
                JLabel daysPresentLabel = new JLabel(
                        "daysPresent");
                daysPresentLabel.setFont(new Font("Arial", Font.BOLD, 16));
                daysPresentLabel.setForeground(Color.white);
                daysPresentLabel.setBounds(50, 180, 200, 30);
                regularPanel.add(daysPresentLabel);

                daysPresentTextField = new JTextField();
                daysPresentTextField.setBounds(210, 180, 210, 30);
                regularPanel.add(daysPresentTextField);

                // add regular student button
                addRegularButton = new JButton("Add Regular Student");
                addRegularButton.setFont(new Font("Arial", Font.BOLD, 12));
                addRegularButton.setBounds(230, 340, 150, 45);
                regularPanel.add(addRegularButton);

                // anonymous class of addRegularButton
                addRegularButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String StudentName = getStudentName(); // call getter method of studentNam
                        if (StudentName.equals("")) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Student name cannot be empty",
                                    "Missing studentName",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // enrollmentID
                        int enrollmentID = getEnrollmentID();
                        if (enrollmentID == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Enrollment ID cannot be negative and empty",
                                    "Missing enrollmentID",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        //// dateOfBirth
                        String dateOfBirth = getDateOfBirth();
                        if (dateOfBirth == null) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Date Of birth cannot be selected",
                                    "Missing dateOfBirth",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // CourseName
                        String CourseName = getCourseName();
                        if (CourseName.equals("")) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Course Name cannot be empty",
                                    "Missing courseName",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // // dateOfEnrollment
                        String dateOfEnrollment = getDateOfEnrollment();
                        if (dateOfEnrollment == null) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Date Of Enrollment cannot be selected",
                                    "Missing dateOfEnrollment",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // courseDuration
                        int courseDuration = getCourseDuration();
                        if (courseDuration == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Course duration cannot be empty",
                                    "Missing courseDuration ",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // tuitionFee
                        int tuitionFee = getTuitionFee();
                        if (tuitionFee == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Tuition Fee cannot be empty",
                                    "Missing tuitionFee",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // numOfModules
                        int numOfModules = getNumOfModules();
                        if (numOfModules == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Num Of Modules cannot be empty",
                                    "Missing noOfModules",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // numOfCreditHours
                        int numOfCreditHours = getNumOfCreditHours();
                        if (numOfCreditHours == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Num Of CreditHours cannot be empty",
                                    "Missing numOfCreditHours",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // daysPresent
                        double daysPresent = getDaysPresent();
                        if (daysPresent == INVALID) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Days Present cannot be empty",
                                    "Missing daysPresent",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        // to enble the display button of regualar class
                        regularDisplayButton.setEnabled(true);

                        /// check uiqueness

                        boolean found = checkUniqueEnrollmentID(enrollmentID);
                        if (found == true) {
                            JOptionPane.showMessageDialog(regularPanel,
                                    "enrollmentID is already used",
                                    "Enter Unique enrollmentID",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        } else {
                            al.add(new Regular(enrollmentID, dateOfBirth, CourseName,StudentName,dateOfEnrollment, courseDuration,tuitionFee, numOfModules, numOfCreditHours,daysPresent));
                            JOptionPane.showMessageDialog(regularPanel,
                                    "Reglar class added successfully",
                                    "Added Successfully",
                                    JOptionPane.ERROR_MESSAGE);

                            return;
                        }
                    }
                });

                // calculate presentPercentage
                 presentpercentageButton = new JButton("presentPercentage");
                presentpercentageButton.setFont(new Font("Arial", Font.BOLD, 12));
                presentpercentageButton.setBounds(20, 320, 150, 40);
                regularPanel.add(presentpercentageButton);
                presentpercentageButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        regularFrame.dispose();
                        JFrame presentPercentageFrame = new JFrame("Present Percentage");
                        presentPercentageFrame.setSize(500, 500);
                        presentPercentageFrame.setResizable(false);
                        presentPercentageFrame.setLocation(50, 50);
                        presentPercentageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        presentPercentageFrame.getContentPane().setBackground(Color.lightGray);

                        JPanel panel4 = new JPanel();
                        panel4.setSize(450, 440);
                        panel4.setLocation(17, 10);
                        panel4.setLayout(null);
                        panel4.setBackground(Color.GRAY);
                        panel4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
                        presentPercentageFrame.add(panel4);

                        // enrollmentID to calculate the presentPercentage
                        JLabel regularEIDLabel = new JLabel("enrollmentID");
                        regularEIDLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        regularEIDLabel.setForeground(Color.white);
                        regularEIDLabel.setBounds(50, 50, 200, 30);
                        panel4.add(regularEIDLabel);

                        regularEIDTextField = new JTextField();
                        regularEIDTextField.setBounds(210, 50, 210, 30);
                        panel4.add(regularEIDTextField);

                        JLabel regularDPLabel = new JLabel(
                                "daysPresent");
                        regularDPLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        regularDPLabel.setForeground(Color.white);
                        regularDPLabel.setBounds(50, 110, 200, 30);
                        panel4.add(regularDPLabel);

                        regularDPTextField = new JTextField();
                        regularDPTextField.setBounds(210, 110, 210, 30);
                        panel4.add(regularDPTextField);

                        // clear
                        JButton PPClearButton = new JButton("Clear");
                        PPClearButton.setBounds(10, 250, 120, 40);
                        panel4.add(PPClearButton);

                        // back button
                        JButton backButton = new JButton("Back");
                        backButton.setBounds(290, 390, 150, 40);
                        backButton.setFont(new Font("Arial", Font.BOLD, 20));
                        panel4.add(backButton);

                        JButton PPCalculateButton = new JButton("calculatePresentPercentage");
                        PPCalculateButton.setFont(new Font("Arial", Font.BOLD, 12));
                        PPCalculateButton.setBounds(220, 250, 200, 40);
                        panel4.add(PPCalculateButton);
                        PPCalculateButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                int regularEID = getRegularEID();
                                if (regularEID == INVALID) {
                                    JOptionPane.showMessageDialog(panel4,
                                            "Please provide a valid enrollmentID",
                                            "enrollmentID filled error",
                                            JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                                double RegularDaysPresent = getRegularDaysPresent();
                                if (RegularDaysPresent == INVALID) {
                                    JOptionPane.showMessageDialog(panel4,
                                            "Please provide a valid daysPresent",
                                            "daysPresent filled error",
                                            JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                                boolean found = false;
                                for (Student obj : al) {
                                    if (obj instanceof Regular) {
                                        // downcasting
                                        Regular robj = (Regular) obj;
                                        if (regularEID == robj.getEnrollmentID()) {
                                            String grade = robj.presentPercentage( (int) RegularDaysPresent);
                                            found = true;
                                            JOptionPane.showMessageDialog(panel4,
                                                    "Your grade is : " + grade, "Grade Box",

                                                    JOptionPane.ERROR_MESSAGE);
                                            break;

                                        } else {
                                            found = false;
                                        }
                                    }
                                }

                                if (found == false) {
                                    JOptionPane.showMessageDialog(panel4,
                                            "This enrollmentID object is not made", "Create an object",

                                            JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                        // to make the regularFrame visible
                        presentPercentageFrame.setLayout(null);
                        presentPercentageFrame.setVisible(true);
                    }
                });

                // calculate grant certificate
                grantcertificateButton = new JButton("grantCertificate");
                presentpercentageButton.setFont(new Font("Arial", Font.BOLD, 12));
                grantcertificateButton.setBounds(20, 380, 150, 40);
                regularPanel.add(grantcertificateButton);
                grantcertificateButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // regularFrame.dispose();
                        JFrame regularGCFrame = new JFrame("Grant Certificate");
                        regularGCFrame.setSize(500, 500);
                        regularGCFrame.setResizable(false);
                        regularGCFrame.setLocation(50, 50);
                        regularGCFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        regularGCFrame.getContentPane().setBackground(Color.lightGray);

                        // studentPanel for grantCertificate
                        JPanel panel5 = new JPanel();
                        panel5.setSize(450, 440);
                        panel5.setLocation(17, 10);
                        panel5.setLayout(null);
                        panel5.setBackground(Color.GRAY);
                        panel5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
                        regularGCFrame.add(panel5);

                       JLabel  regularEIDLabel = new JLabel("enrollmentID");
                        regularEIDLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        regularEIDLabel.setForeground(Color.white);
                        regularEIDLabel.setBounds(50, 50, 200, 30);
                        panel5.add(regularEIDLabel);

                        regularEIDTextField = new JTextField();
                        regularEIDTextField.setBounds(210, 50, 210, 30);
                        panel5.add(regularEIDTextField);


                        // courseName for grant certificate
                        JLabel GCCNLabel = new JLabel("courseName");
                        GCCNLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        GCCNLabel.setForeground(Color.white);
                        GCCNLabel.setBounds(50, 110, 200, 30);
                        panel5.add(GCCNLabel);

                        GCCNTextField = new JTextField();
                        GCCNTextField.setBounds(210, 110, 210, 30);
                        panel5.add(GCCNTextField);

                        // dateofenrollment for grant certificate

                        JLabel DOELabel = new JLabel(
                                "dateOfEnrollment");
                        DOELabel.setFont(new Font("Arial", Font.BOLD, 16));
                        DOELabel.setForeground(Color.white);
                        DOELabel.setBounds(50, 170, 200, 30);
                        panel5.add(DOELabel);

                        // ArrayList for yearEnrollGC
                        ArrayList<String> yearEnrollGC = new ArrayList<>();
                        yearEnrollGC.add("Year");
                        for (int i = 1950; i <= 2050; i++) {
                            yearEnrollGC.add(String.valueOf(i));
                        }
                        GCYearEnrollComboBox = new JComboBox(yearEnrollGC.toArray()); // year
                        GCYearEnrollComboBox.setBounds(210, 170, 60, 30);
                        panel5.add(GCYearEnrollComboBox);

                        String[] monthEnrollGC = { "Month", "January", "February", "March", "April", "May", "June",
                                "July",
                                "August",
                                "October", "November", "December" };

                        mothGCComboBox = new JComboBox(monthEnrollGC);
                        mothGCComboBox.setBounds(285, 170, 60, 30);
                        panel5.add(mothGCComboBox);

                        // ArrayList for day
                        ArrayList<String> dayEnrollGC = new ArrayList<>();
                        dayEnrollGC.add("Day");
                        for (int i = 1; i <= 32; i++) {
                            dayEnrollGC.add(String.valueOf(i));
                        }
                        // JComboBox for dayOfEnrollment
                        dayEnrollGCCmoboBox = new JComboBox(dayEnrollGC.toArray());
                        dayEnrollGCCmoboBox.setBounds(360, 170, 60, 30);
                        panel5.add(dayEnrollGCCmoboBox);

                        calculateGCButton = new JButton("CalculateGrantCertificate");
                        calculateGCButton.setBounds(150, 250, 200, 40);
                        panel5.add(calculateGCButton);

                        calculateGCButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {

                                int enrollmentID2 = getRegularEID();
                                if (enrollmentID2 == INVALID) {
                                    JOptionPane.showMessageDialog(panel5,
                                            "Please provide a valid enrollmentID",
                                            "enrollmentID filled error",
                                            JOptionPane.ERROR_MESSAGE);
                                    return;

                                }

                                String courseName2 = getGCCourseName();
                                if (courseName2.equals("")) {
                                    JOptionPane.showMessageDialog(panel5,
                                            "Course Name cannot be empty",
                                            "Missing CourseName",
                                            JOptionPane.ERROR_MESSAGE);
                                    return;

                                }
                                String dateOfEnrollment2 = getGCDateOfEnrollment();
                                if (dateOfEnrollment2 == null) {
                                    JOptionPane.showMessageDialog(panel5,
                                            "Date Of Enrollment cannot be selected",
                                            "Missing dateOfEnrollment",
                                            JOptionPane.ERROR_MESSAGE);
                                    return;
                                }

                                boolean founds = false;
                               
                                for (Student obj1 : al) {
                                    if (obj1 instanceof Regular) {
                                        Regular robj1 = (Regular) obj1;
                                        if (enrollmentID2 == robj1.getEnrollmentID() && courseName2.equals(robj1.getCourseName()) && dateOfEnrollment2.equals(robj1.getDateOfEnrollment())) {
                                            robj1.grantCertificate(courseName2,enrollmentID2,dateOfEnrollment2);
                                            JOptionPane.showMessageDialog(panel5,
                                            "See result for terminal",
                                            "Missing dateOfEnrollment",
                                            JOptionPane.ERROR_MESSAGE);
                                            break;

                                        } else {
                                            founds = false;

                                        }
                                    }
                                }
                                if (founds == false) {
                                    JOptionPane.showMessageDialog(panel5,
                                            "This enrollmentID object is not made ", "Create an object",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });

                        regularGCFrame.setLayout(null);
                        regularGCFrame.setVisible(true);
                    }
                });

                // display button
                regularDisplayButton = new JButton("Display");
                regularDisplayButton.setBounds(450, 320, 130, 40);
                regularPanel.add(regularDisplayButton);
                regularDisplayButton.setEnabled(false);
                regularDisplayButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String studentName = studentNameTextfield.getText();
                        String enrollmentID = enrollmentIDTextfield.getText();
                        String birthYear = (String) yearComboBox.getSelectedItem().toString();
                        String birthMonth = (String) MonthComboBox.getSelectedItem().toString();
                        String birthDay = (String) dayComboBox.getSelectedItem().toString();
                        String courseName = courseNameTextField.getText();
                        String yearEnroll = (String) yearEnrollComboBox.getSelectedItem().toString();
                        String monthEnroll = (String) monthEnrollComboBox.getSelectedItem().toString();
                        String dayEnroll = (String) dayEnrollComboBox.getSelectedItem();
                        String courseDuration = courseDurationTextField.getText();
                        String tuitionFee = tuitionFeeTextField.getText();
                        String numOfModules = numOfModulesTextField.getText();
                        String numOfCreditHours = creditHoursTextField.getText();
                        String numOfDaysPresent = daysPresentTextField.getText();

                        JOptionPane.showMessageDialog(regularPanel, "studentName : " + studentName +
                                "\nenrollmentID : " + enrollmentID + "\ndateOfBirth :  " +
                                birthYear + "/ " + birthMonth + "/ " + birthDay + "\ncourseName : "
                                + courseName + "\ndateOfEnrollment :  " + yearEnroll + "/ " +
                                monthEnroll + "/ " + dayEnroll + "\ncourseDuration : " + courseDuration
                                + "\ntutitionFee : " + tuitionFee +
                                "\nnumOfModules : " + numOfModules + "numOfCreditHours : " + numOfCreditHours
                                + "\nnumOfDaysPresent : " + numOfDaysPresent, "Display the Regular details",
                                JOptionPane.INFORMATION_MESSAGE);
                        // displays the details of regular class in terminal
                        for (Student obj : al) {
                            obj.display();
                        }
                    }
                });

                // clear all the details of regular class
                regularClearButton = new JButton("Clear");
                regularClearButton.setBounds(450, 380, 130, 40);
                regularPanel.add(regularClearButton);
                regularClearButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        numOfModulesTextField.setText("");
                        creditHoursTextField.setText("");
                        daysPresentTextField.setText("");
                    }
                });

                // back button
               backButton = new JButton("Back to Student");
                backButton.setBounds(390, 540, 200, 50);
                backButton.setFont(new Font("Arial", Font.BOLD, 20));
                regularPanel.add(backButton);

                Color borderColor = Color.WHITE; // border of regularButton
                LineBorder lineBorder = new LineBorder(borderColor, 5);
                backButton.setBorder(lineBorder);

                // Anonymous class for back to Student button
                backButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ec) {
                        regularFrame.setVisible(false); // Hide the current regularFrame
                        studentFrame.setVisible(true); // Show the studentFrame
                    }
                });

                regularFrame.setLayout(null);
                regularFrame.setVisible(true);
            }
        });

        // JButton for DropOut Class
         dropoutButton = new JButton("Dropout");
        dropoutButton.setBounds(380, 530, 200, 50);
        dropoutButton.setFont(new Font("Arial", Font.BOLD, 22));
        studentPanel.add(dropoutButton);

        Color BorderColor = Color.WHITE;
        LineBorder LineBorder = new LineBorder(borderColor, 5);
        dropoutButton.setBorder(LineBorder);

        // Anonymous class for Dropout class
        dropoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentFrame.dispose(); // to close a studentFrame
                dropoutFrame = new JFrame("Dropout class");
                dropoutFrame.setSize(650, 650);
                dropoutFrame.setResizable(false); // hide maximize button
                dropoutFrame.setLocation(680, 10);
                dropoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dropoutFrame.getContentPane().setBackground(Color.gray); // set a background color to
                                                                         // studentFrame

                dropoutPanel = new JPanel();
                dropoutPanel.setSize(600, 600);
                dropoutPanel.setLocation(20, 5);
                dropoutPanel.setLayout(null);
                dropoutPanel.setBackground(Color.GRAY);// backgroundColor of regularPanel
                dropoutPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); // border
                dropoutFrame.add(dropoutPanel);

                // JLabel
                JLabel dropoutLabel = new JLabel();
                dropoutLabel.setText("Dropout Student");
                dropoutLabel.setBounds(220, 10, 200, 40);
                dropoutLabel.setFont(new Font("Arial", Font.BOLD, 20));
                dropoutLabel.setForeground(Color.WHITE);
                dropoutPanel.add(dropoutLabel);

                // numOfRemainingModules
                JLabel noOfModulesLabel = new JLabel("numOfRemainingModules");
                noOfModulesLabel.setFont(new Font("Arial", Font.BOLD, 16));
                noOfModulesLabel.setForeground(Color.white);
                noOfModulesLabel.setBounds(50, 80, 200, 30);
                dropoutPanel.add(noOfModulesLabel);

                remainingModulesTextField = new JTextField();
                remainingModulesTextField.setBounds(250, 80, 230, 30);
                dropoutPanel.add(remainingModulesTextField);

                // numOfMonthsAttended
                JLabel numOfMonthAttendLabel = new JLabel("numOfMonthsAttended");
                numOfMonthAttendLabel.setFont(new Font("Arial", Font.BOLD, 16));
                numOfMonthAttendLabel.setForeground(Color.white);
                numOfMonthAttendLabel.setBounds(50, 130, 200, 40);
                dropoutPanel.add(numOfMonthAttendLabel);

                monthAttendedTextfield = new JTextField();
                monthAttendedTextfield.setBounds(250, 130, 230, 30);
                dropoutPanel.add(monthAttendedTextfield);

                // dateOfDropout
                JLabel dateOfDropoutLabel = new JLabel(
                        "dateOfDropout");
                dateOfDropoutLabel.setFont(new Font("Arial", Font.BOLD, 16));
                dateOfDropoutLabel.setForeground(Color.white);
                dateOfDropoutLabel.setBounds(50, 180, 200, 30);
                dropoutPanel.add(dateOfDropoutLabel);

                // ArrayList for yearDropout
                ArrayList<String> yearDropout = new ArrayList<>();
                yearDropout.add("Year");
                for (int i = 1950; i <= 2050; i++) {
                    yearDropout.add(String.valueOf(i));
                }
                yearDropoutComboBox = new JComboBox(yearDropout.toArray()); // year
                yearDropoutComboBox.setBounds(250, 180, 70, 30);
                dropoutPanel.add(yearDropoutComboBox);

                String[] arrayMonthDropout = { "Month", "January", "February", "March", "April", "May",
                        "June", "July",
                        "August",
                        "October", "November", "December" };
                monthDropoutComboBox = new JComboBox(arrayMonthDropout);
                monthDropoutComboBox.setBounds(330, 180, 70, 30);
                dropoutPanel.add(monthDropoutComboBox);

                // ArrayList for dayDropout
                ArrayList<String> dayDropout = new ArrayList<>();
                dayDropout.add("Day");
                for (int i = 1; i <= 32; i++) {
                    dayDropout.add(String.valueOf(i));
                }
                dayDropoutComboBox = new JComboBox(dayDropout.toArray());
                dayDropoutComboBox.setBounds(410, 180, 70, 30);
                dropoutPanel.add(dayDropoutComboBox);

                // AddDropoutStudent
                 addDropoutStudentButton = new JButton("Add Dropout Student");
                addDropoutStudentButton.setBounds(220, 340, 170, 45);
                dropoutPanel.add(addDropoutStudentButton);

                addDropoutStudentButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String StudentName = getStudentName(); // call getter method
                        System.out.println(StudentName);
                        if (StudentName.equals("")) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Student name cannot be empty",
                                    "Missing studentName",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        // // enrollmentID
                        int enrollmentID = getEnrollmentID();
                        if (enrollmentID == INVALID) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Enrollment ID cannot be negative and empty",
                                    "Missing enrollmentID",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        //// dateOfBirth
                        String dateOfBirth = getDateOfBirth();
                        if (dateOfBirth == null) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Date Of birth cannot be selected",
                                    "Missing dateOfBirth",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // CourseName
                        String CourseName = getCourseName();
                        if (CourseName.equals("")) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Course Name cannot be empty",
                                    "Missing courseName",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // // dateOfEnrollment
                        String dateOfEnrollment = getDateOfEnrollment();
                        if (dateOfEnrollment == null) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Date Of Enrollment cannot be selected",
                                    "Missing dateOfEnrollment",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // courseDuration
                        int courseDuration = getCourseDuration();
                        if (courseDuration == INVALID) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Course Duration cannot be empty",
                                    "Missing courseDuration",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // tuitionFee
                        int tuitionFee = getTuitionFee();
                        if (tuitionFee == INVALID) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Tuition Fee cannot be empty",
                                    " Missing tuitionFee",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // // numOfRemainingModules
                        int numOfRemainingModules = getNumOfRemainingModules();
                        if (numOfRemainingModules == INVALID) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Num Of Remaining Modules cannot be empty",
                                    "Missing numOfRemainingModules",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // numOfMonthsAttended
                        int numOfMonthsAttended = getNumOfMonthsAttended();
                        if (numOfMonthsAttended == INVALID) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Num Of Months Attended cannot be empty",
                                    "Missing numOfMonthsAttended",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // dateOfDropout
                        String dateOfDropout = getDateOfDropout();
                        if (dateOfDropout == null) {
                            JOptionPane.showMessageDialog(dropoutPanel,
                                    "Date Of Dropout cannot be selected",
                                    "Missing dateOfDropout",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // enable dropoutDisplayButton
                        dropoutDisplayButton.setEnabled(true);

                                           }
                });

                // billsPayableButton
                billsPayableButton = new JButton("Bills Payable");
                billsPayableButton.setBounds(20, 320, 150, 40);
                dropoutPanel.add(billsPayableButton);
                billsPayableButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dropoutFrame.dispose();
                        JFrame billsPayFrame = new JFrame("Remove Student");
                        billsPayFrame.setSize(500, 400);
                        billsPayFrame.setResizable(false);
                        billsPayFrame.setLocation(50, 50);
                        billsPayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        billsPayFrame.getContentPane().setBackground(Color.lightGray);

                        JPanel panel7 = new JPanel();
                        panel7.setSize(450, 340);
                        panel7.setLocation(17, 10);
                        panel7.setLayout(null);
                        panel7.setBackground(Color.GRAY);
                        panel7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
                        billsPayFrame.add(panel7);

                        JLabel billsPayLabel = new JLabel("billsPayable");
                        billsPayLabel.setFont(new Font("Arial", Font.BOLD, 20));
                        billsPayLabel.setForeground(Color.white);
                        billsPayLabel.setBounds(150, 20, 150, 30);
                        panel7.add(billsPayLabel);

                        // enrollmentID for removeStudent
                        JLabel billsEIDLabel = new JLabel("enrollmentID");
                        billsEIDLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        billsEIDLabel.setForeground(Color.white);
                        billsEIDLabel.setBounds(50, 80, 200, 30);
                        panel7.add(billsEIDLabel);

                        billsEIDTextField = new JTextField();
                        billsEIDTextField.setBounds(210, 80, 210, 30);
                        panel7.add(billsEIDTextField);

                        // billsPayableButton
                        billsPayableButton = new JButton("billsPayable");
                        billsPayableButton.setFont(new Font("Arial", Font.BOLD, 12));
                        billsPayableButton.setBounds(170, 200, 150, 40);
                        panel7.add(billsPayableButton);

                        billsPayFrame.setLayout(null);
                        billsPayFrame.setVisible(true);
                    }
                });

                // removeStudentButton
                removeStdButton = new JButton("remove student");
                removeStdButton.setBounds(20, 380, 150, 40);
                dropoutPanel.add(removeStdButton);
                removeStdButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dropoutFrame.dispose();
                        JFrame removeStudentFrame = new JFrame("Remove Student");
                        removeStudentFrame.setSize(500, 400);
                        removeStudentFrame.setResizable(false);
                        removeStudentFrame.setLocation(50, 50);
                        removeStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        removeStudentFrame.getContentPane().setBackground(Color.lightGray);

                        JPanel panel6 = new JPanel();
                        panel6.setSize(450, 340);
                        panel6.setLocation(17, 10);
                        panel6.setLayout(null);
                        panel6.setBackground(Color.GRAY);
                        panel6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
                        removeStudentFrame.add(panel6);

                        JLabel removeStdLabel = new JLabel("removeStudent");
                        removeStdLabel.setFont(new Font("Arial", Font.BOLD, 20));
                        removeStdLabel.setForeground(Color.white);
                        removeStdLabel.setBounds(150, 20, 150, 30);
                        panel6.add(removeStdLabel);

                        // enrollmentID for removeStudent
                        JLabel removeEIDLabel = new JLabel("enrollmentID");
                        removeEIDLabel.setFont(new Font("Arial", Font.BOLD, 16));
                        removeEIDLabel.setForeground(Color.white);
                        removeEIDLabel.setBounds(50, 80, 200, 30);
                        panel6.add(removeEIDLabel);

                        removeEIDTextField = new JTextField();
                        removeEIDTextField.setBounds(210, 80, 210, 30);
                        panel6.add(removeEIDTextField);

                        // removeStudentButton
                        removeStudentButton = new JButton("removeStudent");
                        removeStudentButton.setFont(new Font("Arial", Font.BOLD, 12));
                        removeStudentButton.setBounds(170, 200, 150, 40);
                        panel6.add(removeStudentButton);

                        removeStudentFrame.setLayout(null);
                        removeStudentFrame.setVisible(true);
                    }
                });

                // display all the details of the student class
                dropoutDisplayButton = new JButton("Display");
                dropoutDisplayButton.setBounds(450, 320, 130, 40);
                dropoutPanel.add(dropoutDisplayButton);
                dropoutDisplayButton.setEnabled(false);
                dropoutDisplayButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String studentName = studentNameTextfield.getText();
                        String enrollmentID = enrollmentIDTextfield.getText();
                        String birthYear = (String) yearComboBox.getSelectedItem().toString();
                        String birthMonth = (String) MonthComboBox.getSelectedItem().toString();
                        String birthDay = (String) dayComboBox.getSelectedItem().toString();
                        String courseName = courseNameTextField.getText();
                        String yearEnroll = (String) yearEnrollComboBox.getSelectedItem().toString();
                        String monthEnroll = (String) monthEnrollComboBox.getSelectedItem().toString();
                        String dayEnroll = (String) dayEnrollComboBox.getSelectedItem();
                        String courseDuration = courseDurationTextField.getText();
                        String tuitionFee = tuitionFeeTextField.getText();
                        String numOfRemainingModules = remainingModulesTextField.getText();
                        String numOfMonthAttend = monthAttendedTextfield.getText();
                        String yearDropout = yearDropoutComboBox.getSelectedItem().toString();
                        String monthDropout = monthDropoutComboBox.getSelectedItem().toString();
                        String dayDropout = dayDropoutComboBox.getSelectedItem().toString();
                        JOptionPane.showMessageDialog(dropoutPanel, "studentName : " + studentName +
                                "\nenrollmentID : " + enrollmentID + "\ndateOfBirth :  " +
                                birthYear + "/ " + birthMonth + "/ " + birthDay + "\ncourseName : "
                                + courseName + "\ndateOfEnrollment :  " + yearEnroll + "/ " +
                                monthEnroll + "/ " + dayEnroll + "\ncourseDuration : " + courseDuration
                                + "\ntutitionFee : " + tuitionFee +
                                "\nnumOfRemainingModules  : " + numOfRemainingModules + "\nnumOfMonthAttended: "
                                + numOfMonthAttend
                                + "\ndateOfDropout : " + yearDropout + "/ " + monthDropout + "/ " + dayDropout,
                                "Display the Regular details",
                                JOptionPane.INFORMATION_MESSAGE);
                        // print the details of dropout class in terminal
                        for (Student obj1 : al) {
                            obj1.display();
                        }
                    }
                });

                // clear the details of Dropout class class
                dropoutClearButton = new JButton("Clear");
                dropoutClearButton.setBounds(450, 380, 130, 40);
                dropoutPanel.add(dropoutClearButton);
                dropoutClearButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        remainingModulesTextField.setText("");
                        monthAttendedTextfield.setText("");
                        yearDropoutComboBox.setSelectedIndex(0);
                        monthDropoutComboBox.setSelectedIndex(0);
                        dayDropoutComboBox.setSelectedIndex(0);
                    }
                });

                // Back to Student button
                BackButton = new JButton("Back to Student");
                BackButton.setBounds(10, 540, 150, 50);
                BackButton.setFont(new Font("Arial", Font.BOLD, 16));
                dropoutPanel.add(BackButton);

                Color borderColors = Color.WHITE; // border
                LineBorder lineBorders = new LineBorder(borderColors, 5);
                BackButton.setBorder(lineBorders);

                BackButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent c) {
                        dropoutFrame.setVisible(false); // Hide the current regularFrame
                        studentFrame.setVisible(true); // Show the studentFrame
                    }
                });

                // At last Always
                dropoutFrame.setLayout(null);
                dropoutFrame.setVisible(true);
            }
        });
        studentFrame.setLayout(null);
        studentFrame.setVisible(true);
    }

    // accessor method for studentName
    public String getStudentName() {
        String studentName = studentNameTextfield.getText().trim();
        return studentName;
    }

    // // method to check the enrollmentID is unique
    public boolean checkUniqueEnrollmentID(int EnrollmentID) {
        boolean isUnique = false;
        for (Student obj : al) {
            if (obj instanceof Regular) {
                // downcasting garxa
                Regular robj = (Regular) obj;
                if (EnrollmentID == robj.getEnrollmentID()) {
                    isUnique = true;
                    break;
                }
            }
            if (obj instanceof Dropout) {
                Dropout dobj = (Dropout) obj;
                if (dobj.getEnrollmentID() == EnrollmentID) {
                    isUnique = true;
                    break;
                }
            }
        }
        return isUnique;
    }

    // accessor method for enrollmentID
    public int getEnrollmentID() {
        int EnrollmentID = INVALID;
        String stringEnrollmentID = enrollmentIDTextfield.getText().trim();
        try {
            EnrollmentID = Integer.parseInt(stringEnrollmentID);
            if (EnrollmentID <= 0) {
                EnrollmentID = INVALID;
            }
        } catch (NumberFormatException a) {
            //
        }
        return EnrollmentID;
    }

    // accessor method for dateOfBirth
    public String getDateOfBirth() {
        String birthYear = yearComboBox.getSelectedItem().toString();
        String birthMonth = MonthComboBox.getSelectedItem().toString();
        String birthDay = dayComboBox.getSelectedItem().toString();
        String DateOfBirth = null;
        if (birthYear.equals("Year") || birthMonth.equals("Month") ||
                birthDay.equals("Day")) {
            DateOfBirth = null;
        } else {
            DateOfBirth = (birthYear + "/" + birthMonth + "/" + birthDay);
        }
        return DateOfBirth;
    }

    // // accessor method for courseName
    public String getCourseName() {
        String courseName = courseNameTextField.getText().trim();
        return courseName;
    }

    // gretter method for grant ceritificate of courseName
    public String getGCCourseName() {
    String courseNameGC = GCCNTextField.getText().trim();
    return courseNameGC;
    }

    // accessor method for dateOfEnrollment
    public String getDateOfEnrollment() {
        String yearEnroll = yearEnrollComboBox.getSelectedItem().toString();
        String monthEnroll = monthEnrollComboBox.getSelectedItem().toString();
        String dayEnroll = dayEnrollComboBox.getSelectedItem().toString();
        String DateOfEnrollment = null;
        if (yearEnroll.equals("Year") || monthEnroll.equals("Month") ||
                dayEnroll.equals("Day")) {
            DateOfEnrollment = null;
        } else {
            DateOfEnrollment = (yearEnroll + "/" + monthEnroll + "/" + dayEnroll);
        }
        return DateOfEnrollment;
    }

    // getter method to calculate GC
    public String getGCDateOfEnrollment() {
    String yearEnrollGC = yearEnrollComboBox.getSelectedItem().toString();
    String monthEnrollGC = monthEnrollComboBox.getSelectedItem().toString();
    String dayEnrollGC = dayEnrollComboBox.getSelectedItem().toString();
    String GCDateOfEnrollment = null;
    if (yearEnrollGC.equals("Year") || monthEnrollGC.equals("Month") ||
    dayEnrollGC.equals("Day")) {
    GCDateOfEnrollment = null;
    } else {
    GCDateOfEnrollment = (yearEnrollGC + "/" + monthEnrollGC + "/" +
    dayEnrollGC);
    }
    return GCDateOfEnrollment;
    }

    // accessor method for courseDuration
    public int getCourseDuration() {
        int courseDuration = INVALID;
        String stringCourseDuration = courseDurationTextField.getText().trim();
        try {
            courseDuration = Integer.parseInt(stringCourseDuration);
            if (courseDuration <= 0) {
                courseDuration = INVALID;
            }
        } catch (NumberFormatException a) {
            //
        }
        return courseDuration;
    }

    // getter method for tuitionFee
    public int getTuitionFee() {
        int tuitionFee = INVALID;
        String stringTuitionFee = tuitionFeeTextField.getText().trim();
        try {
            tuitionFee = Integer.parseInt(stringTuitionFee);
        } catch (NumberFormatException a) {
            //
        }
        return tuitionFee;
    }

    // accessor method of numOfModules
    public int getNumOfModules() {
        int numOfModules = INVALID;
        String stringNumOfModules = numOfModulesTextField.getText().trim();
        try {
            numOfModules = Integer.parseInt(stringNumOfModules);
        } catch (NumberFormatException a) {
            //
        }
        return numOfModules;
    }

    // // accessor method of numOfCreditHours
    public int getNumOfCreditHours() {
        int numOfCreditHours = INVALID;
        String stringNumOfCreditHours = creditHoursTextField.getText().trim();
        try {
            numOfCreditHours = Integer.parseInt(stringNumOfCreditHours);

        } catch (NumberFormatException a) {
            //
        }
        return numOfCreditHours;
    }

    // // accessor method of daysPresent
    public double getDaysPresent() {
        double daysPresent = INVALID;
        String stringDaysPresent = daysPresentTextField.getText().trim();
        try {
            daysPresent = Double.parseDouble(stringDaysPresent);

        } catch (NumberFormatException a) {
            //
        }
        return daysPresent;
    }

    // accessor method of numOfRemainingModules
    public int getNumOfRemainingModules() {
        int numOfRemainingModules = INVALID;
        String stringNumOfRemainingModules = remainingModulesTextField.getText().trim();
        try {
            numOfRemainingModules = Integer.parseInt(stringNumOfRemainingModules);

        } catch (NumberFormatException e) {
            //
        }
        return numOfRemainingModules;
    }

    // accessor method of numOfMonthsAttended
    public int getNumOfMonthsAttended() {
        int numOfMonthsAttended = INVALID;
        String stringNumOfMonthsAttended = monthAttendedTextfield.getText().trim();
        try {
            numOfMonthsAttended = Integer.parseInt(stringNumOfMonthsAttended);

        } catch (NumberFormatException a) {
            //
        }
        return numOfMonthsAttended;
    }

    // accessor method of dateOfDropout
    public String getDateOfDropout() {
        String dropoutYear = yearDropoutComboBox.getSelectedItem().toString();
        String dropoutMonth = monthDropoutComboBox.getSelectedItem().toString();
        String dropoutDay = dayDropoutComboBox.getSelectedItem().toString();
        String DateOfDropout = null;
        if (dropoutYear.equals("Year") || dropoutMonth.equals("Month") || dropoutDay.equals("Day")) {
            DateOfDropout = null;
        } else {
            DateOfDropout = (dropoutYear + "/" + dropoutMonth + "/" + dropoutDay);
        }
        return DateOfDropout;
    }

    public int getRegularEID() {
        int RegularEID = INVALID;
        String stringRegularEID = regularEIDTextField.getText().trim();
        try {
            RegularEID = Integer.parseInt(stringRegularEID);
            if (RegularEID <= 0) {
                RegularEID = INVALID;
            }
        } catch (NumberFormatException e) {
            //
        }
        return RegularEID;
    }

    // enrolmentID for grant certificate
    public int getRegularGCEID() {
    int GCEID = INVALID;
    String stringGCEID = regularEIDTextField.getText().trim();
    try {
    GCEID = Integer.parseInt(stringGCEID);
    if (GCEID <= 0) {
    GCEID = INVALID;
    }
    } catch (NumberFormatException e) {
    //
    }
    return GCEID;

    }

    // // accessor method of daysPresent
    public int getRegularDaysPresent() {
        int RegularDaysPresent = INVALID;
        String stringRegularDaysPresent = regularDPTextField.getText().trim();
        try {
            RegularDaysPresent = Integer.parseInt(stringRegularDaysPresent);

        } catch (NumberFormatException a) {
            //
        }
        return RegularDaysPresent;
    }

    // method to check all the details are filled or not in the Student class if
    // filled move to regular if not give a message in a dialogbox
    private boolean fieldStudentDetails() {

        // checks for all the fields to ensure they are not empty or invalid as
        // needed.
        boolean isValid = true;
        String studentName = studentNameTextfield.getText();
        if (studentName.isEmpty()) {
            isValid = false;
            System.out.println("Please enter student name.");
        }
        String enrollmentID = enrollmentIDTextfield.getText();
        if (enrollmentID.isEmpty()) {
            isValid = false;
            System.out.println("Please enter enrollment ID.");
        }
        String dateOfBirth = getDateOfBirth();
        if (dateOfBirth == null) {
            isValid = false;
            System.out.println("Please select a valid date of birth.");

        }
        String courseName = courseNameTextField.getText();
        if (courseName.isEmpty()) {
            isValid = false;
            System.out.println("Please enter course name.");
        }
        String dateOfEnrollment = getDateOfEnrollment();
        if (dateOfEnrollment == null) {
            isValid = false;
            System.out.println("Please select a valid date of enrollment.");
        }
        String courseDuration = courseDurationTextField.getText();
        if (courseDuration.isEmpty()) {
            isValid = false;
            System.out.println("Please enter course duration.");
        }
        String tuitionFee = tuitionFeeTextField.getText();
        if (tuitionFee.isEmpty()) {
            isValid = false;
            System.out.println("Please enter tuition fee.");
        }
        return isValid;
    }

    public static void main(String[] args) {
        StudentGUI s1 = new StudentGUI();
        s1.show();
    }
}