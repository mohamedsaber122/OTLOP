package otlob;

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class adminFunctions extends JFrame implements Serializable {

    private JLabel choose;
    private JButton addRes;
    //  private JButton removeRest;
    private JButton addAdmin;
    // private JButton removeAdmin;
    private JButton editRest;
    private JButton back;
    private Container c;

    public adminFunctions() {
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
        choose = new JLabel("Choose your function");
        choose.setFont(new Font("Arial", Font.BOLD, 28));
        choose.setSize(300, 30);
        choose.setLocation(280, 10);
        choose.setForeground(Color.white);
        addRes = new JButton("Add Restaurant");
        addRes.setSize(200, 50);
        addRes.setLocation(310, 110);
        addRes.setFont(new Font("Arial", Font.BOLD, 17));
        addRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new addRestGUI();
            }
        });

        addAdmin = new JButton("Add Admin");
        addAdmin.setSize(200, 50);
        addAdmin.setLocation(310, 210);
        addAdmin.setFont(new Font("Arial", Font.BOLD, 17));
        addAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new addAdminGUI();
            }
        });

        back = new JButton("Logout");
        back.setSize(100, 20);
        back.setLocation(10, 10);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new myAdminLogin();
            }
        });
        editRest=new JButton("Edit Restaurant");
        editRest.setSize(200,50);
        editRest.setLocation(310,310);
        editRest.setFont(new Font("Arial",Font.BOLD,17));
        editRest.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                new editRestaurants();
            }
        });
       /*editRest.addActionListener(new editRestWatcher());*/
        c.add(choose);
        c.add(addRes);
        c.add(addAdmin);
        c.add(back);
        c.add(editRest);
        setVisible(true);
    }
    
}
