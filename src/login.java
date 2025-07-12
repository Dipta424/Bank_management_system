import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JButton Login,clear,regi;
    JTextField card;
    JPasswordField pn;

    login()
    {
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800,480);
        setLocation(350,200);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));

        Image img= i1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);

        ImageIcon i2 = new ImageIcon(img);

        JLabel l1 = new JLabel(i2);
        l1.setBounds(70,10,100,100);
        add(l1);
        JLabel l2 = new JLabel("Welcome to ATM");
        l2.setFont(new Font("Osward",Font.BOLD,38));
        l2.setBounds(200,40,400,40);
        add(l2);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);

        JLabel pin = new JLabel("PIN No:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,150,40);
        add(pin);

        card = new JTextField();
        card.setFont(new Font("Arial",Font.BOLD,18));
        card.setBounds(300,155,250,30);
        add(card);

        pn= new JPasswordField();
        pn.setBounds(300,225,250,30);
        add(pn);

         Login = new JButton("SIGN IN");
        Login.setBounds(300,300,100,30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.addActionListener(this);

        add(Login);


        clear=new JButton("CLEAR");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        regi=new JButton("SIGN UP");
        regi.setBounds(300,350,250,30);
        regi.setBackground(Color.black);
        regi.setForeground(Color.white);
        regi.addActionListener(this);
        add(regi);


        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==Login)
        {

        }
        if(ae.getSource()==clear)
        {
            card.setText("");
            pn.setText("");
        }
    }

    public static void main(String[] args)
    {
        new login();
    }
}