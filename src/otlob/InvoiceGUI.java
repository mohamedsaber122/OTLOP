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
public class InvoiceGUI extends JFrame {
    private Container c;
    private JLabel label;
    private JLabel Add;
    private JLabel Mobile;
    private JLabel Name;
    private JLabel AddT;
    private JLabel MobileT;
    private JLabel NameT;
    private JLabel Payment;
    private JLabel OrderItem;
    private JLabel Order;
    private JLabel ItemPrice;
    private JLabel Msg;
    private JButton back;
    
    public InvoiceGUI(){
           super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\images.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        setTitle("OTLOB");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        label= new JLabel("INVOICE");
        label.setSize(300,20);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setLocation(290,10);
        label.setForeground(Color.black);
        c.add(label);
        Add=new JLabel("Address : ");
        Add.setSize(200, 25);
        Add.setLocation(300, 150);
        Add.setFont(new Font("Arial",Font.BOLD,20));
        Add.setForeground(Color.black);
        AddT=new JLabel(orderGUI.addT.getText());
        AddT.setSize(100,20);
        AddT.setLocation(400,150);
        Mobile=new JLabel("Mobile : ");
        Mobile.setSize(200, 25);
        Mobile.setLocation(300, 200);
        Mobile.setFont(new Font("Arial",Font.BOLD,20));
        Mobile.setForeground(Color.black);
        MobileT=new JLabel(orderGUI.mobT.getText());
        MobileT.setSize(100,20);
        MobileT.setLocation(400,200);
        Name=new JLabel("Name : ");
        Name.setSize(200, 25);
        Name.setLocation(300, 250);
        Name.setFont(new Font("Arial",Font.BOLD,20));
        Name.setForeground(Color.black);
        NameT=new JLabel(orderGUI.nameT.getText());
        NameT.setSize(100,20);
        NameT.setLocation(400,250);
        Payment=new JLabel("Payment : ");
        Payment.setFont(new Font("Arial",Font.BOLD,20));
        Payment.setSize(300,30);
        Payment.setLocation(300,300);
        Payment.setForeground(Color.black);
        OrderItem=new JLabel(orderGUI.pC.getSelectedItem().toString());
        OrderItem.setSize(150, 20);
        OrderItem.setLocation(400,300);
        Order=new JLabel("Order : ");
        Order.setFont(new Font("Arial",Font.BOLD,20));
        Order.setSize(300,30);
        Order.setLocation(300,350);
        Order.setForeground(Color.black);
        ItemPrice=new JLabel(selectedRestUser.comboBox.getSelectedItem().toString());
        ItemPrice.setSize(150, 20);
        ItemPrice.setLocation(400,350);
        Msg=new JLabel("Thanks for using Otlob :) ");
        Msg.setFont(new Font("Arial",Font.BOLD,20));
        Msg.setSize(300,30);
        Msg.setLocation(300,400);
        Msg.setForeground(Color.black);
               
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
        c.add(MobileT);
        c.add(Payment);
        c.add(OrderItem);
        c.add(Name);
        c.add(Mobile);
        c.add(NameT);
        c.add(Add);
        c.add(AddT);
        c.add(Order);
        c.add(ItemPrice);
        c.add(Msg);
        setVisible(true);
        
    }
    
}
