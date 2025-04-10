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
import static otlob.FileManager.myUsersData;

public class myLogin extends JFrame implements Serializable {

    private JLabel login;
    private JLabel username;
    private JLabel password;
    private JTextField user;
    private JTextField pass;
    private JButton log;
    private JButton back;
    private Container c;
    private String x;
    private String y;

    public myLogin() {
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
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        login = new JLabel("Login as user");
        login.setFont(new Font("Arial", Font.BOLD, 28));
        login.setLocation(320, 10);
        login.setSize(290, 30);
        login.setForeground(Color.white);
        username = new JLabel("Username:");
        username.setFont(new Font("Arial", Font.BOLD, 20));
        username.setSize(200, 25);
        username.setLocation(310, 200);
        username.setForeground(Color.white);
        user = new JTextField();
        user.setLocation(413, 203);
        user.setSize(100, 20);
        x = user.getText();
        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setSize(200, 25);
        password.setForeground(Color.white);
        password.setLocation(310, 230);
        pass = new JTextField();
        pass.setLocation(413, 233);
        pass.setSize(100, 20);
        y = pass.getText();
        log = new JButton("Login");
        log.setSize(100, 20);
        log.setLocation(355, 400);
        log.addActionListener(new loginWatcher());      
       /* log.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str;
                ObjectInputStream bin;
                try {
                    bin = new ObjectInputStream(new FileInputStream(""));
                    myUsersData = (HashMap<String, User>) bin.readObject();
                    bin.close();
                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                } catch (IOException ex) {
                    Logger.getLogger(myLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(myLogin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });*/
        back = new JButton("<<<Back");
        back.setSize(100, 20);
        back.setLocation(10, 10);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new myAdminLogin().setVisible(false);
                new otlobGUI().setVisible(true);

            }
        });
        c.add(login);
        c.add(username);
        c.add(user);
        c.add(password);
        c.add(pass);
        c.add(log);
        c.add(back);
        setVisible(true);
    }
    public class loginWatcher implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            User myUser= new User();
//            if(myUser.LoginAsUserHash(user.getText(), pass.getText()))
//            {
//                JOptionPane.showMessageDialog(null, "Login Successfull!");
//                dispose();
                new menuGUI();
        }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "The data you entered is invalid!");
//            }
       }    }

