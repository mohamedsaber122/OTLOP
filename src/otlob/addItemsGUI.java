package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class addItemsGUI extends JFrame {
private JLabel label;
    private JLabel itemName;
    private JTextField itemN;
    private JLabel itemPrice;
    private JTextField itemP;
    private JLabel restID;
    private JTextField restI;
    private JButton back;
    private JButton add;
    private Container c;
    public addItemsGUI() {
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
        Restaurant r=new Restaurant();
        setTitle("OTLOB");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        label=new JLabel("Add Item");
        label.setSize(200,20);
        label.setLocation(310,10);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setForeground(Color.white);
        itemName=new JLabel("Item Name: ");
        itemName.setSize(150,20);
        itemName.setLocation(230,100);
        itemName.setFont(new Font("Arial",Font.BOLD,20));
        itemName.setForeground(Color.white);
        itemN=new JTextField();
        itemN.setSize(100,20);
        itemN.setLocation(340,100);
        itemPrice =new JLabel("Item Cost: ");
        itemPrice.setSize(200,20);
        itemPrice.setLocation(230,150);
        itemPrice.setFont(new Font("Aria",Font.BOLD,20));
        itemPrice.setForeground(Color.white);
        itemP=new JTextField();
        itemP.setSize(100,20);
        itemP.setLocation(340,150);
        restID=new JLabel("Restaurant ID: ");
        restID.setSize(200,25);
        restID.setLocation(200,200);
        restID.setFont(new Font("Arial",Font.BOLD,20));
        restID.setForeground(Color.white);
        restI=new JTextField();
        restI.setSize(100,20);
        restI.setLocation(340,200);
        back=new JButton("<<<Back");
        back.setLocation(10,10);
        back.setSize(100,20);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new editRestaurants();
            }
        });
        add=new JButton("Add");
        add.setSize(100,20);
        add.setLocation(355,400);
        add.addActionListener(new addWatcher());
        c.add(label);
        c.add(itemName);
        c.add(itemN);
        c.add(itemPrice);
        c.add(itemP);
        c.add(restID);
        c.add(restI);
        c.add(back);
        c.add(add);
        setVisible(true);
    }
    public class addWatcher implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            
                Items myItem=new Items();
                myItem.setName(itemN.getText());
                myItem.setCost(Integer.parseInt(itemP.getText()));
                myItem.setRestID(restI.getText());
                System.out.println(myItem.getName());
                Admin myAdmin=new Admin();
               
                
                if(myAdmin.addItem(myItem))
                {
                    JOptionPane.showMessageDialog(null, "Item is Successfully Added!");
                    
                    dispose();
                    new adminFunctions();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        }
    }



