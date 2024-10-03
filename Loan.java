
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Loan{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel pan=new JPanel();
        pan.setBackground(new Color(153,255,204));
        pan.setBounds(0,0,500,500);
        pan.setLayout(null);
        f.add(pan);
        JLabel l1=new JLabel("LOAN MANAGEMENT SYSTEM");
        l1.setBounds(0, 10, 450, 50);
        l1.setHorizontalAlignment(JLabel.CENTER); // Center align the text
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        pan.add(l1);
        JLabel l2=new JLabel("LOAN AMOUNT:");
        l2.setBounds(45,60,90,20);
        pan.add(l2);
        JTextField tf1=new JTextField();
        tf1.setBounds(150,60,150,18);
        pan.add(tf1);
        JLabel l3=new JLabel("LOAN PERIOD:");
        l3.setBounds(50,100,90,20);
        pan.add(l3);
        JTextField tf2=new JTextField();
        tf2.setBounds(150,100,150,18);
        pan.add(tf2);
        JLabel l4=new JLabel("INTEREST RATE IN %:");
        l4.setBounds(15,140,120,20);
        pan.add(l4);
        JTextField tf3=new JTextField();
        tf3.setBounds(150,140,150,18);
        pan.add(tf3);
        JLabel l5=new JLabel("PROCESSING FEE:");
        l5.setBounds(30,180,120,20);
        pan.add(l5);
        JTextField tf4=new JTextField();
        tf4.setBounds(150,180,150,18);
        pan.add(tf4);
        JButton b1=new JButton("CALCULATE TOTAT AMOUNT TO BE PAID");
        b1.setBounds(15,220,300,20);
        pan.add(b1);
        JTextField tf5=new JTextField();
        tf5.setBounds(350,220,70,20);
        pan.add(tf5);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=tf1.getText();
                String s2=tf2.getText();
                String s3=tf3.getText();
                String s4=tf4.getText();
                String s5=tf5.getText();
                
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                float c = Float.parseFloat(s3);
                int d=Integer.parseInt(s4);
                c=c/100;
                float total = a + (a * b * c) + d; 
                String result=String.valueOf(total);
                tf5.setText(result); 

            }
        });
       
        JButton b2=new JButton("CALCULATE AMOUNT TO BE PAID PER MONTH");
        b2.setBounds(15,280,300,20);
        pan.add(b2);
        JTextField tf6=new JTextField();
        tf6.setBounds(350,280,70,20);
        pan.add(tf6);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=tf1.getText();
                String s2=tf2.getText();
                String s3=tf3.getText();
                String s4=tf4.getText();
                String s5=tf5.getText();
                
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                float c = Float.parseFloat(s3);
                int d=Integer.parseInt(s4);
                c=c/100;
                int g=a+d;
                float i=c/12;
               float n=b*12; 
               float mult = g * i * (float)(Math.pow(1 + i, n)) / (float)(Math.pow(1 + i, n) - 1);
                String answer=String.valueOf(mult);
                tf6.setText(answer);
            }
        });
        f.setSize(450,370);
        f.setLayout(null);
        f.setVisible(true);
       
    }
    
}
