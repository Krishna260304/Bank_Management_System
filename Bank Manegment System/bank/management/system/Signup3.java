package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;

    Signup3(String formno)
    {
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(105,5,100,100);
        add(image);

        JLabel label1 = new JLabel("Page 3");
        label1.setFont(new Font("Times New Roman",Font.BOLD,28));
        label1.setBounds(318,40,400,40);
        add(label1);

        JLabel label2 = new JLabel("Account Details");
        label2.setFont(new Font("Times New Roman",Font.BOLD,22));
        label2.setBounds(280,70,400,40);
        add(label2);

        JLabel label3 = new JLabel("Account Type:");
        label3.setFont(new Font("Times New Roman",Font.BOLD,18));
        label3.setBounds(100,140,200,30);
        add(label3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Times New Roman",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Times New Roman",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Times New Roman",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Times New Roman",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel label4 = new JLabel("Card Number:");
        label4.setFont(new Font("Times New Roman",Font.BOLD,18));
        label4.setBounds(100,300,200,30);
        add(label4);

        JLabel label5 = new JLabel("(Your 16-digit Card Number)");
        label5.setFont(new Font("Times New Roman",Font.BOLD,12));
        label5.setBounds(100,330,200,20);
        add(label5);

        JLabel label6 = new JLabel("XXXX-XXXX-XXXX-4841");
        label6.setFont(new Font("Times New Roman",Font.BOLD,18));
        label6.setBounds(330,300,250,30);
        add(label6);

        JLabel label7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        label7.setFont(new Font("Times New Roman",Font.BOLD,12));
        label7.setBounds(330,330,500,20);
        add(label7);

        JLabel label8 = new JLabel("PIN:");
        label8.setFont(new Font("Times New Roman",Font.BOLD,18));
        label8.setBounds(100,370,200,30);
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setFont(new Font("Times New Roman",Font.BOLD,18));
        label9.setBounds(330,370,200,30);
        add(label9);

        JLabel label10 = new JLabel("(4-digit Password)");
        label10.setFont(new Font("Times New Roman",Font.BOLD,12));
        label10.setBounds(100,400,200,20);
        add(label10);

        JLabel label11 = new JLabel("Services Required:");
        label11.setFont(new Font("Times New Roman",Font.BOLD,18));
        label11.setBounds(100,450,200,30);
        add(label11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Times New Roman",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Times New Roman",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Times New Roman",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Times New Roman",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Times New Roman",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Times New Roman",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Times New Roman",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Times New Roman", Font.BOLD,14));
        label12.setBounds(700,10,100,30);
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setFont(new Font("Times New Roman", Font.BOLD,14));
        label13.setBounds(760,10,60,30);
        add(label13);

        s = new JButton("Submit");
        s.setFont(new Font("Times New Roman", Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Times New Roman", Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(211, 255, 255));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }
        else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        }
        else if (r3.isSelected()) {
            atype = "Current Account";
        }
        else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) +1409963000000000L;
        String cardno = ""+Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin = ""+Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM CARD";
        }
        else if (c2.isSelected()) {
            fac += "Internet Banking";
        }
        else if (c3.isSelected()) {
            fac += "Mobile Banking";
        }
        else if (c4.isSelected()) {
            fac += "Email Alerts";
        }
        else if(c5.isSelected()){
            fac += "Cheque Book";
        }
        else if(c6.isSelected()){
            fac += "E-Statement";
        }

        try {
            if (e.getSource() == s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }
                else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('" + formno + "', '" + atype + "', '" + cardno + "', '" + pin + "', '" + fac + "')";
                    String q2 = "insert into login values('" + formno + "', '" + cardno + "', '" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\nPin : " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
            else if (e.getSource() == c) {
                System.exit(0);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
