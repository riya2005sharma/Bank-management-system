package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class index extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    index(){
        super("bank management system ");
        //bank icon image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350,10,100,100);
        Component add = add(image);

        b1= new JButton("CUSTOMER LOGIN ");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(320, 180, 200, 30);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("ADMIN LOGIN");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(320, 250, 200, 30);
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("EMPLOYEE LOGIN");
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(320, 320, 200, 30);
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
        if (e.getSource()==b1) {
         new login();
        } else if (e.getSource()==b2) {
            new adminlogin();
        }
        else{
            new elogin();
        }


    }
     public static void main(String args[]){
        new index();

    }
}
