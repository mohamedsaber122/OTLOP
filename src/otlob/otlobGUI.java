package otlob;

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class otlobGUI extends JFrame implements ActionListener,Serializable {
    JFrame f=new JFrame();
    private JButton register;
    private JButton loginAdmin;
    private JButton loginUser;
    private JLabel welcome;
    private JButton back;
    private Container c;

    public otlobGUI() {
        super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\images\\otlobImage.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        // this.setVisible(true);
        setTitle("OTLOB");
        setBounds(300, 90, 900, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        welcome = new JLabel("Welcome to OTLOB !");
        welcome.setFont(new Font("Arial", Font.BOLD, 28));
        welcome.setSize(290, 30);
        welcome.setLocation(300, 30);
        loginAdmin = new JButton("Login as admin");    
        loginAdmin.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                    f.dispose();
                    new myAdminLogin();
                }
                });
        loginAdmin.setSize(200, 30);
        loginAdmin.setLocation(30, 500);
        register = new JButton("Register");
        register.setSize(200, 30);
        register.setLocation(350, 500);
        register.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                   f.dispose();
                   new myRegister();
                }
                });
        loginUser = new JButton("Login as user");
        loginUser.setSize(200, 30);
        loginUser.setLocation(657, 500);
        loginUser.addActionListener(new ActionListener()
                {
                     @Override
       public void actionPerformed(ActionEvent e)
        {
            f.dispose();
            new myLogin();
            
        }
                });
      
        
        c.add(welcome);
        c.add(loginAdmin);
        c.add(register);
        c.add(loginUser);
        setVisible(true);
        
    }
         @Override
       public void actionPerformed(ActionEvent e)
        {
        
        }
       
       

}
