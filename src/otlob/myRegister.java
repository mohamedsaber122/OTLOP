package otlob;

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class myRegister extends JFrame implements Serializable {

    private JLabel Register;
    private JLabel email;
    private JLabel username;
    private JLabel password;
    private JLabel phoneNum;
    private JButton confirm;
    private JTextField mail;
    private JTextField name;
    private JTextField pass;
    private JTextField phone;
    private JButton back;
    private Container c;
    private String x;
    private String y;
    private String z;
    private String w;
    
    public myRegister()
    {
        super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\images\\otlob11.jpg")))));
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
        Register = new JLabel("Register");
        Register.setFont(new Font("Arial",Font.BOLD,30));
        Register.setLocation(340,10);
        Register.setSize(390,30);
        Register.setForeground(Color.white);
        email=new JLabel("E-Mail: ");
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setLocation(270,130);
        email.setSize(200,25);
        email.setForeground(Color.white);
        mail=new JTextField();
        mail.setLocation(350,133);
        mail.setSize(100,20);
        x=mail.getText();
        username=new JLabel("Name: ");
        username.setFont(new Font("Arial",Font.BOLD,20));
        username.setLocation(270,160);
        username.setSize(200,25);
        username.setForeground(Color.white);
        name=new JTextField();
        name.setLocation(350,163);
        name.setSize(100,20);
        y=name.getText();
        password=new JLabel("Password: ");
        password.setFont(new Font("Arial",Font.BOLD,20));
        password.setLocation(230,190);
        password.setSize(200,25);
        password.setForeground(Color.white);
        pass=new JTextField();
        pass.setLocation(350,193);
        pass.setSize(100,20);
        z=pass.getText();
        phoneNum=new JLabel("Phone: ");
        phoneNum.setFont(new Font("Arial",Font.BOLD,20));
        phoneNum.setLocation(264,220);
        phoneNum.setSize(200,25);
        phoneNum.setForeground(Color.white);
        phone =new JTextField();
        phone.setLocation(350,223);
        phone.setSize(100,20);
        w=phone.getText();
        confirm=new JButton("Register");
        confirm.setLocation(355,400);
        confirm.setSize(100,20);
        confirm.addActionListener(new submitWatcher());
        
      /*  confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               try {
                    ObjectOutputStream bout=new ObjectOutputStream(new FileOutputStream(""));
                    bout.writeChars(x);
                    bout.writeChars(y);
                    bout.writeChars(z);
                    bout.writeChars(w);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(myRegister.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(myRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
                    JOptionPane.showMessageDialog(new Frame(),"Registration Succefull");
            }
        });*/
        back =new JButton("<<<Back");
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
        c.add(Register);
        c.add(email);
        c.add(mail);
        c.add(username);
        c.add(name);
        c.add(password);
        c.add(pass);
        c.add(phoneNum);
        c.add(phone);
        c.add(confirm);
        c.add(back);
        setVisible(true);
    }

   public class submitWatcher implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           FileManager.loadUsersData();
           User myUser=new User();
           myUser.setUsername(name.getText());
           myUser.setPassword(pass.getText());
           myUser.setEmail(mail.getText());
           myUser.setPhone(phone.getText());
           if(name.getText().equals("")||pass.getText().equals("")||mail.getText().equals("")||phone.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Please fill the required fields!");
           }
           else
           {
               if(myUser.RegisterAsUserHash(myUser))
               {
                   JOptionPane.showMessageDialog(null, "Registeration Successfull!");
                      dispose();
                     
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "The data you entered is invalid!");
               }
           }
        
       }
   }
}
