package otlob;

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class myAdminLogin extends JFrame implements Serializable {
    private JLabel adminLog;
    private JLabel username;
    private JTextField user;
    private JLabel password;
    private JTextField pass;
    private JButton login;
    private JButton back;
    private Container c;
    
    public myAdminLogin()
    {
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
        setTitle("OTLOB");
        setBounds(300,90,800,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        adminLog=new JLabel("Admin Login");
        adminLog.setFont(new Font("Arial",Font.BOLD,28));
        adminLog.setLocation(320,10);
        adminLog.setSize(290,30);
        adminLog.setForeground(Color.white);
        username=new JLabel("Username: ");
        username.setFont(new Font("Arial",Font.BOLD,20));
        username.setSize(200,25);
        username.setLocation(290,200);
        username.setForeground(Color.white);
        user=new JTextField();
        user.setSize(100,20);
        user.setLocation(400,203);
        password=new JLabel("Password: ");
        password.setFont(new Font("Arial",Font.BOLD,20));
        password.setSize(200,25);
        password.setLocation(290,250);
        password.setForeground(Color.white);
        pass=new JTextField();
        pass.setSize(100,20);
        pass.setLocation(400,253);
        login=new JButton("Login");
        login.setSize(100,20);
        login.setLocation(355,400);
        login.addActionListener(new loginWatcherA());
        back=new JButton("<<<Back");
        back.setSize(100,20);
        back.setLocation(10,10);
        back.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                   //new myAdminLogin().setVisible(false);
                   new otlobGUI().setVisible(true);
                   
                }
                });
        c.add(adminLog);
        c.add(username);
        c.add(user);
        c.add(password);
        c.add(pass);
        c.add(login);
        c.add(back);
        setVisible(true);
        
    }

   public class loginWatcherA implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           Admin myAdmin=new Admin();
//          if(myAdmin.LoginAsAdminHash(user.getText(), pass.getText()))
//          {
              JOptionPane.showMessageDialog(null, "Login Successfull!");
              dispose();
              new adminFunctions();
//          }
//          else
//          {
//              JOptionPane.showMessageDialog(null, "The data you entered is invalid!");
//          }
       }
   }
 
}
