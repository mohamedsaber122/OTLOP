package otlob;

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class addAdminGUI extends JFrame implements Serializable {

    private JLabel addadmin;
    private JLabel adminName;
    private JTextField name;
    private JLabel password;
    private JTextField pass;
    private JButton submit;
    private JButton back;
    private Container c;

    public addAdminGUI() {
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
        addadmin = new JLabel("Add Admin");
        addadmin.setFont(new Font("Arial", Font.BOLD, 28));
        addadmin.setSize(300, 30);
        addadmin.setLocation(315, 10);
        addadmin.setForeground(Color.white);
        adminName = new JLabel("Admin name:");
        adminName.setFont(new Font("Arial", Font.BOLD, 20));
        adminName.setSize(200, 25);
        adminName.setLocation(290, 200);
        adminName.setForeground(Color.white);
        name = new JTextField();
        name.setSize(100, 20);
        name.setLocation(420, 203);
        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setSize(200, 25);
        password.setLocation(290, 240);
        password.setForeground(Color.white);
        pass = new JTextField();
        pass.setSize(100, 20);
        pass.setLocation(420, 243);
        back = new JButton("<<<Back");
        back.setSize(100, 20);
        back.setLocation(10, 10);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new adminFunctions();
            }
        });
        submit=new JButton("Add");
        submit.setSize(100,20);
        submit.setLocation(355,400);
        submit.addActionListener(new submitWatcher());
        c.add(addadmin);
        c.add(adminName);
        c.add(name);
        c.add(password);
        c.add(pass);
        c.add(back);
        c.add(submit);
        setVisible(true);
    }
    public class submitWatcher implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(name.getText().equals("")||pass.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"PLease fill the required fields!");
            }
            else
            {
                Admin myAdmin=new Admin();
                FileManager.loadAdminsData();
                myAdmin.setUsername(name.getText());
                myAdmin.setPassword(pass.getText());
                if (myAdmin.RegisterAsAdminHash(myAdmin))
                {
                    JOptionPane.showMessageDialog(null,"New admin was added successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        }
    }
}
