package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textfild2;
    JPasswordField passwordfild2;
    JButton button1,button2,button3;

    Login()
    {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image i5 = i4.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(630,350,100,100);
        add(image2);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

        textfild2 = new JTextField(15);
        textfild2.setBounds(325,190,230,30);
        textfild2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(textfild2);

        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordfild2 = new JPasswordField(15);
        passwordfild2.setBounds(325,250,230,30);
        passwordfild2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(passwordfild2);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image i8 = i7.getImage().getScaledInstance(840,480, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(0,0,840,480);
        add(image3);

        setLayout(null);
        setSize(840,480);
        setLocation(450,200);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1)
            {
                Con c = new Con();
                String cardno = textfild2.getText();
                String pin = passwordfild2.getText();
                String q = "select * from login where card_no = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next())
                {
                    setVisible(false);
                    new main_class(pin);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }
            else if (e.getSource() == button2)
            {
                textfild2.setText("");
                passwordfild2.setText("");
            }
            else if (e.getSource() == button3)
            {
                new Signup();
                setVisible(false);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
