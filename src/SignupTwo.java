import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField pan,adr;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,cato,income,education,occupation;
    String formno;
        SignupTwo(String s) {
        setLayout(null);
        this.formno = s;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel AdditionalDetails = new JLabel("PAGE 2: ADDITIONAL DETAILS");
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        AdditionalDetails.setBounds(290, 80, 400, 30);

        add(AdditionalDetails);


        JLabel reli = new JLabel("Religion:");
        reli.setFont(new Font("Raleway", Font.BOLD, 20));
        reli.setBounds(100, 140, 100, 30);
        add(reli);

        String[] typesOfreligions={"Hindu","Muslim","Others"};
        religion = new JComboBox(typesOfreligions);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);


        JLabel catog = new JLabel("Category:");
        catog.setFont(new Font("Raleway", Font.BOLD, 20));
        catog.setBounds(100, 190, 200, 30);
        add(catog);

        String[] valcat={"General","OBC","SC","ST","OTHER"};
        cato=new JComboBox(valcat);
        cato.setBounds(300, 190, 400, 30);
        cato.setBackground(Color.white);
        add(cato);


        JLabel incm = new JLabel("Income:");
        incm.setFont(new Font("Raleway", Font.BOLD, 20));
        incm.setBounds(100, 240, 200, 30);
        add(incm);

        String[] Incomes={"Null","<1,50,000","<2.50,000","<5,00,000","Upto 10,00,000"};
        income=new JComboBox(Incomes);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);



        JLabel edu = new JLabel("Educational:");
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        JLabel quali = new JLabel("Qualification:");
        quali.setFont(new Font("Raleway", Font.BOLD, 20));
        quali.setBounds(100, 315, 400, 30);
        add(quali);

        String educationList[]={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        education=new JComboBox(educationList);
        education.setBounds(300, 290, 400, 30);
        education.setBackground(Color.white);
        add(education);



        JLabel occup = new JLabel("Occupation: ");
        occup.setFont(new Font("Raleway", Font.BOLD, 20));
        occup.setBounds(100, 390, 200, 30);
        add(occup);

        String[] occuValues={"Salaried","Self-Employed","Business","Student","Others"};

        occupation=new  JComboBox(occuValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);



        JLabel Pan_num = new JLabel("Pan Number:");
        Pan_num.setFont(new Font("Raleway", Font.BOLD, 20));
        Pan_num.setBounds(100, 440, 200, 30);
        add(Pan_num);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel adhar = new JLabel("Adhar Number:");
        adhar.setFont(new Font("Raleway", Font.BOLD, 20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);

        adr = new JTextField();
        adr.setFont(new Font("Raleway", Font.BOLD, 14));
        adr.setBounds(300, 490, 400, 30);
        add(adr);


        JLabel citizen = new JLabel("Senior Citizen");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);

        syes = new JRadioButton("Yes");
       syes.setBackground(Color.white);
       syes.setBounds(300, 540, 100, 30);
       add(syes);

       sno = new JRadioButton("No");
       sno.setBackground(Color.white);
       sno.setBounds(450, 540, 100, 30);
       add(sno);


       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(syes);
       buttonGroup.add(sno);



        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);

        eyes = new JRadioButton("Yes");
        eyes.setBackground(Color.white);
        eyes.setBounds(300, 590, 100, 30);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBackground(Color.white);
        eno.setBounds(450, 590, 100, 30);
        add(eno);

        ButtonGroup vuttonGroup = new ButtonGroup();
        vuttonGroup.add(eyes);
        vuttonGroup.add(eno);





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
                String sreli=religion.getSelectedItem().toString();
                String scato=cato.getSelectedItem().toString();
                String sincome=income.getSelectedItem().toString();
                String seducation=education.getSelectedItem().toString();
                String soccupation=occupation.getSelectedItem().toString();
                String span=pan.getText();
                String sad=adr.getText();

                String sencit=null;
                if(syes.isSelected()) {
                    sencit = "Yes";
                }
                else if(sno.isSelected()) {
                    sencit = "No";
                }
                String existing=null;
                if(eyes.isSelected()) {
                    existing="Yes";
                }
                else if(eno.isSelected()) {
                    existing="No";
                }



        try{
                Conn conn = new Conn();
                String query="insert into signupTwo values('"+formno+"','"+sreli+"','"+scato+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sad+"','"+sencit+"','"+existing+"')";
                conn.s.executeUpdate(query);

        }catch (Exception e) {
            System.out.println(e);
        }

    }

    public static  void main(String[] args)
    {
        new SignupTwo("");
    }
}
