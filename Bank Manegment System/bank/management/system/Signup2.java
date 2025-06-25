package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton next;

    Signup2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(105,5,100,100);
        add(image);

        this.formno = first;

        JLabel label1 = new JLabel("Page 2");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        label1.setBounds(347,30,600,40);
        add(label1);

        JLabel labelabel2 = new JLabel("Additional Details");
        labelabel2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        labelabel2.setBounds(300,60,600,40);
        add(labelabel2);

        JLabel label3 = new JLabel("Religion :");
        label3.setFont(new Font("Times New Roman", Font.BOLD,18));
        label3.setBounds(100,120,100,30);
        add(label3);

        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(255,255,204));
        comboBox.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel label4 = new JLabel("Category : ");
        label4.setFont(new Font("Times New Roman", Font.BOLD,18));
        label4.setBounds(100,170,100,30);
        add(label4);

        String Category [] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(255,255,204));
        comboBox2.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel label5 = new JLabel("Income : ");
        label5.setFont(new Font("Times New Roman", Font.BOLD,18));
        label5.setBounds(100,220,100,30);
        add(label5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(255,255,204));
        comboBox3.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel label6 = new JLabel("Educational : ");
        label6.setFont(new Font("Times New Roman", Font.BOLD,18));
        label6.setBounds(100,270,150,30);
        add(label6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(255,255,204));
        comboBox4.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);


        JLabel label7 = new JLabel("Occupation : ");
        label7.setFont(new Font("Times New Roman", Font.BOLD,18));
        label7.setBounds(100,340,150,30);
        add(label7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(255,255,204));
        comboBox5.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel label8 = new JLabel("PAN Number : ");
        label8.setFont(new Font("Times New Roman", Font.BOLD,18));
        label8.setBounds(100,390,150,30);
        add(label8);

        textPan = new JTextField();
        textPan.setFont(new Font("Times New Roman", Font.BOLD,18));
        textPan.setBackground(new Color(255,255,204));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel label9 = new JLabel("Aadhar Number : ");
        label9.setFont(new Font("Times New Roman", Font.BOLD,18));
        label9.setBounds(100,440,180,30);
        add(label9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Times New Roman", Font.BOLD,18));
        textAadhar.setBackground(new Color(255,255,204));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);


        JLabel label10 = new JLabel("Senior Citizen : ");
        label10.setFont(new Font("Times New Roman", Font.BOLD,18));
        label10.setBounds(100,490,180,30);
        add(label10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Times New Roman", Font.BOLD,14));
        r1.setBackground(new Color(255,255,204));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Times New Roman", Font.BOLD,14));
        r2.setBackground(new Color(255,255,204));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel label11 = new JLabel("Existing Account : ");
        label11.setFont(new Font("Times New Roman", Font.BOLD,18));
        label11.setBounds(100,540,180,30);
        add(label11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Times New Roman", Font.BOLD,14));
        e1.setBackground(new Color(255,255,204));
        e1.setBounds(350,540,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Times New Roman", Font.BOLD,14));
        e2.setBackground(new Color(255,255,204));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(e1);
        bg1.add(e2);

        JLabel label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Times New Roman", Font.BOLD,14));
        label12.setBounds(700,10,100,30);
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setFont(new Font("Times New Roman", Font.BOLD,14));
        label13.setBounds(760,10,60,30);
        add(label13);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850 ,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(255,255,204));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate =(String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();
        String scitizen = null;
        if(r1.isSelected())
        {
            scitizen = "Yes";
        }
        else if (r2.isSelected())
        {
            scitizen = "No";
        }
        String eAccount = null;
        if(e1.isSelected())
        {
            eAccount = "Yes";
        }
        else if (e2.isSelected())
        {
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAadhar.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill All Fields");
            }
            else
            {
                Con c1 = new Con();
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"', '"+occ+"','"+pan+"', '"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}