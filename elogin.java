package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class elogin extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, p1, t2;

    JButton b1, b2, b3;
    elogin(){
        super("bank management system ");
        //bank icon image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350,10,100,100);
        Component add = add(image);

        //card icon image
        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.webp"));
        Image ii2= ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel imagecard= new JLabel(ii3);
        imagecard.setBounds(630,350,100,100);
        Component add1 = add(imagecard);

        l1= new JLabel("WELCOME TO THE EMPLOYEE LOGIN");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Avant-grade", Font.BOLD, 24));
        l1.setBounds(200,125,450,40);
        add(l1);

        l2= new JLabel("Employee ID: ");
        l2.setFont(new Font("Ralway", Font.BOLD,22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(150,190,375,30);
        add(l2);

        t1= new JTextField(15);
        t1.setBounds(325, 190, 375, 30);
        t1.setFont(new Font("Arial", Font.BOLD, 14));
        add(t1);

        l3= new JLabel("Employee ID:");
        l3.setFont(new Font("Ralway", Font.BOLD, 22));
        l3.setForeground(Color.BLACK);
        l3.setBounds(150, 250, 375, 30);
        add(l3);

        p1= new JTextField(15);
        p1.setBounds(325, 250, 230, 30);
        p1.setFont(new Font("Arial", Font.BOLD, 14));
        add(p1);

        l4= new JLabel("Position:");
        l4.setFont(new Font("Ralway", Font.BOLD, 22));
        l4.setForeground(Color.BLACK);
        l4.setBounds(150, 310, 375, 30);
        add(l4);

        t2= new JTextField(15);
        t2.setBounds(325, 310, 230, 30);
        t2.setFont(new Font("Arial", Font.BOLD, 14));
        add(t2);




        b1= new JButton(" LOGIN");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(300, 370, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("CLEAR");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(430, 370, 100, 30);
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("BACK");
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(560, 370, 100, 30);
        b3.addActionListener(this);
        add(b3);








        //background setup
        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/baackground.jpg"));
        Image iii2= iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel imagebg= new JLabel(iii3);
        imagebg.setBounds(0,0,850,480);
        Component add2 = add(imagebg);

        setLayout(null);
        setSize(850, 480);
        setLocation(300,150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == b1) {
                con c2= new con();
                String q1= "select * from employee";
                c2.statement.executeUpdate(q1);

                setVisible(false);




            } else if (e.getSource()== b2) {
                t1.setText("");
                p1.setText("");

            } else if (e.getSource()==b3) {
                new index();

            }


        }catch(Exception E){

        }
    }

    public static void main(String args[]){
        new elogin();

  }


}
