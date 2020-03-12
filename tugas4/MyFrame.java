package tugas4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public static final long serialVersionUID = 1L;

    private JTextField tname;
    private JTextField tnim;
    private JRadioButton male;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    public MyFrame() {
        String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String[] months = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
        String[] years = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020" };

        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        container.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        container.add(tname);

        JLabel nim = new JLabel("Nim");
        nim.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        nim.setSize(100, 20);
        nim.setLocation(100, 150);
        container.add(nim);

        tnim = new JTextField();
        tnim.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tnim.setSize(150, 20);
        tnim.setLocation(200, 150);
        container.add(tnim);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        container.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        container.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        container.add(female);

        ButtonGroup gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        JLabel birth = new JLabel("Birth");
        birth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        birth.setSize(100, 20);
        birth.setLocation(100, 250);
        container.add(birth);

        date = new JComboBox(dates);
        date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        container.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        container.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        container.add(year);

        JLabel add = new JLabel("Address");
        add.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        container.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        tadd.setBackground(Color.lightGray);
        container.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        container.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        container.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        container.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        container.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        container.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setForeground(Color.BLUE);
        resadd.setBackground(Color.darkGray);
        resadd.setLineWrap(true);
        container.add(resadd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String head = "   Your Identity\n";
                String data = "Name : " + tname.getText() + "\n" + "Nim : " + tnim.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male" + "\n";
                else
                    data1 = "Gender : Female" + "\n";
                String data2 = "Birth : " + date.getSelectedItem() + " - " + month.getSelectedItem() + " - "
                        + year.getSelectedItem() + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(head + data + data1 + data2 + data3);
                tout.setFont(new Font("Times New Roman", Font.ITALIC + Font. BOLD , 18));
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tnim.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
