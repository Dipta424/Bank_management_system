import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nmt, fnmt, et, ad, ct, st, pc;
    JButton next;
    JRadioButton male, female, married, unmarried, others;
    JDateChooser date;

    SignupOne() {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("Application Form No. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);

        add(formno);

        JLabel personaldtl = new JLabel("Page 1: Personal Details");
        personaldtl.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldtl.setBounds(290, 80, 400, 30);
        add(personaldtl);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nmt = new JTextField();
        nmt.setFont(new Font("Raleway", Font.BOLD, 14));
        nmt.setBounds(300, 140, 400, 30);
        add(nmt);


        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnmt = new JTextField();
        fnmt.setFont(new Font("Raleway", Font.BOLD, 14));
        fnmt.setBounds(300, 190, 400, 30);
        add(fnmt);


        JLabel dob = new JLabel("Date of  Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        date = new JDateChooser();
        date.setForeground(new Color(105, 105, 105));
        date.setBounds(300, 240, 400, 30);
        add(date);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergrp = new ButtonGroup();
        gendergrp.add(male);
        gendergrp.add(female);


        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 400, 30);
        add(email);

        et = new JTextField();
        et.setFont(new Font("Raleway", Font.BOLD, 14));
        et.setBounds(300, 340, 400, 30);
        add(et);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        others = new JRadioButton("Others");
        others.setBounds(600, 390, 100, 30);
        others.setBackground(Color.white);
        add(others);

        ButtonGroup maritalstatusgrp = new ButtonGroup();
        maritalstatusgrp.add(married);
        maritalstatusgrp.add(unmarried);
        maritalstatusgrp.add(others);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        ad = new JTextField();
        ad.setFont(new Font("Raleway", Font.BOLD, 14));
        ad.setBounds(300, 440, 400, 30);
        add(ad);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        ct = new JTextField();
        ct.setFont(new Font("Raleway", Font.BOLD, 14));
        ct.setBounds(300, 490, 400, 30);
        add(ct);


        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        st = new JTextField();
        st.setFont(new Font("Raleway", Font.BOLD, 14));
        st.setBounds(300, 540, 400, 30);
        add(st);


        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pc = new JTextField();
        pc.setFont(new Font("Raleway", Font.BOLD, 14));
        pc.setBounds(300, 590, 400, 30);
        add(pc);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        next.addActionListener(this);



        setSize(850, 800);
        setLocation(350, 10);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
            String formno= ""+random;
            String name=nmt.getText();
            String father=fnmt.getText();
            String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
            String gender=null;
            if(male.isSelected())
            {
                gender="Male";
            }
            else if(female.isSelected())
            {
                gender="Female";
            }

            String email=et.getText();

            String marital=null;
            if(married.isSelected())
            {
                marital="Married";
            }
            else if(unmarried.isSelected())
            {
                marital="Unmarried";
            }

            else if(others.isSelected())
            {
                marital="Others";
            }

            String address=ad.getText();
            String pin=pc.getText();
            String city=ct.getText();
            String state=st.getText();

        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name cannot be empty");
            }
            else{
               Conn conn = new Conn();
               String query="insert into signup values('"+formno+"','"+name+"','"+father+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
               conn.s.executeUpdate(query);

               setVisible(false);
               new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static  void main(String[] args)
    {
        new SignupOne();
    }
}
