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
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static otlob.FileManager.items;
import static otlob.FileManager.restaurants;

/**
 *
 * @author Mohamed Saber
 */
public class selectedRestUser extends JFrame implements Serializable{
    static public JComboBox comboBox;
    private JLabel label;
    private JButton back;
    private JButton Go;
private Container c;
public selectedRestUser()
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
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        label= new JLabel("Restaurant Items");
        label.setSize(300,20);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setLocation(290,10);
        label.setForeground(Color.white);
        c.add(label);
        back=new JButton("<<<Back");
        back.setSize(100,20);
        back.setLocation(10, 10);
        c.add(back);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new menuGUI();
            }
        });
        Go=new JButton("GO!");
        Go.setSize(100,20);
        Go.setLocation(350, 350);
        c.add(Go);
        Go.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new orderGUI();
            }
        });
        String myChoice;
        myChoice=menuGUI.getChoice1();
        System.out.println(menuGUI.getChoice1());
        FileManager.loadItemsData();
        //String[] itemArray = new String[items.size()];
        ArrayList <String> myItems=new ArrayList<String>();
        //System.out.println(items.size());
        //int j = 0;
        for (int i = 0; i <items.toArray().length; i++) {
            if(myChoice.equals(items.get(i).getRestID())){
                myItems.add(items.get(i).toString());
                
                }
        }
        
        
        comboBox = new JComboBox(myItems.toArray());
        comboBox.setSize(500,20);
        comboBox.setLocation(150,150);
    
        c.add(comboBox);
        setVisible(true);
        
        
}
}