/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Mohamed Saber
 */
public class orderGUI extends JFrame {
    private Container c;
    private JLabel label;
    private JLabel add;
    private JLabel mob;
    private JLabel name;
    static public JTextField addT;
    static public JTextField mobT;
    static public JTextField nameT;
    private JLabel p;
    static public JComboBox pC;
    private JButton otlob;
    private JButton back;
    private String [] choices={"Cash","Visa","MasterCard"};
    public orderGUI(){
           super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\images\\otlobImage2.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        setTitle("Otlob");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        label= new JLabel("Order Details");
        label.setSize(300,20);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setLocation(290,10);
        label.setForeground(Color.white);
        c.add(label);
        add=new JLabel("Address : ");
        add.setSize(200, 25);
        add.setLocation(300, 150);
        add.setFont(new Font("Arial",Font.BOLD,20));
        add.setForeground(Color.white);
        addT=new JTextField();
        addT.setSize(100,20);
        addT.setLocation(400,150);
        mob=new JLabel("Mobile : ");
        mob.setSize(200, 25);
        mob.setLocation(300, 200);
        mob.setFont(new Font("Arial",Font.BOLD,20));
        mob.setForeground(Color.white);
        mobT=new JTextField();
        mobT.setSize(100,20);
        mobT.setLocation(400,200);
        name=new JLabel("Name : ");
        name.setSize(200, 25);
        name.setLocation(300, 250);
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setForeground(Color.white);
        nameT=new JTextField();
        nameT.setSize(100,20);
        nameT.setLocation(400,250);
        p=new JLabel("Payment : ");
        p.setFont(new Font("Arial",Font.BOLD,20));
        p.setSize(300,30);
        p.setLocation(300,300);
        p.setForeground(Color.white);
        pC=new JComboBox(choices);
        pC.setSize(150, 20);
        pC.setLocation(400,300);
        otlob=new JButton("OTLOB!");
        otlob.setSize(100,20);
        otlob.setLocation(350, 350);
        c.add(otlob);
        otlob.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                
                dispose();
                InvoiceGUI invoiceGUI = new InvoiceGUI();
            }
        });
        back=new JButton("<<<Back");
        back.setSize(100,20);
        back.setLocation(10, 10);
        c.add(back);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new selectedRestUser();
            }
        });
        
        c.add(mobT);
        c.add(p);
        c.add(pC);
        c.add(name);
        c.add(mob);
        c.add(nameT);
        c.add(add);
        c.add(addT);
        setVisible(true);
        
    }
    
}
