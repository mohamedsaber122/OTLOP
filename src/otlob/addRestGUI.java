
package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static otlob.FileManager.restaurants;
public class addRestGUI extends JFrame implements Serializable {
    private JLabel addrest;
    private JLabel restName;
    private JTextField restN;
    private JLabel category;
    private String [] choices={"Burger","Chinese Food","Chicken Wings","Sushi","Italian Food","Pizza"};
    private JComboBox<String> cat;
    private JLabel priceRng;
    private String[] aChoices={"50-100","100-150","150,200","200-250"};
    private JComboBox<String> prices;
    private JLabel ID;
    private JTextField aID;
    private JButton submit;
    private JButton back;
    private JComboBox box;
    private Container c;
    public addRestGUI()
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
        addrest=new JLabel("Add a Restaurant");
        addrest.setSize(300,30);
        addrest.setFont(new Font("Arial",Font.BOLD,28));
        addrest.setLocation(280,10);
        addrest.setForeground(Color.white);
        restName=new JLabel("Restaurant Name: ");
        restName.setFont(new Font("Arial",Font.BOLD,20));
        restName.setSize(200,25);
        restName.setLocation(10,100);
        restName.setForeground(Color.white);
        restN=new JTextField();
        restN.setSize(100,20);
        restN.setLocation(190,103);
        category=new JLabel("Category: ");
        category.setFont(new Font("Arial",Font.BOLD,20));
        category.setSize(300,30);
        category.setLocation(10,140);
        category.setForeground(Color.white);
        cat=new JComboBox(choices);
        cat.setSize(150, 20);
        cat.setLocation(115,146);
        priceRng=new JLabel("Price Range: ");
        priceRng.setFont(new Font("Arial",Font.BOLD,20));
        priceRng.setSize(200,25);
        priceRng.setLocation(540,90);
        priceRng.setForeground(Color.white);
        prices=new JComboBox(aChoices);
        prices.setSize(100,20);
        prices.setLocation(670,93);
        submit=new JButton("Submit");
        submit.setSize(100,20);
        submit.setLocation(355,400);
        submit.addActionListener(new submitWatcher());
        back=new JButton("<<<Back");
        back.setSize(100,20);
        back.setLocation(10,10);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new adminFunctions();
            }
        });
        c.add(addrest);
        c.add(restName);
        c.add(restN);
        c.add(category);
        c.add(cat);
        c.add(priceRng);
        c.add(prices);
        c.add(submit);
        c.add(back);
        setVisible(true);
    }
    public class submitWatcher implements ActionListener,Serializable
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(restN.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill the quired fields!");
                
            }   
            else
            {
                Restaurant myRest=new Restaurant();
                myRest.setName(restN.getText());
                myRest.setCategory(cat.getSelectedItem().toString());
                myRest.setPriceRange(prices.getSelectedItem().toString());
                myRest.setId(restaurants.toArray().length);
                System.out.println(myRest.getName());
                Admin myAdmin=new Admin();
                /*for (int i = 0; i <= restaurants.toArray().length; i++) {
                System.out.println(restaurants.get(i).toString());    
                }*/
                
//                if(myAdmin.addRest(myRest))
                
                    JOptionPane.showMessageDialog(null, "Restaurant added successfully!");
                    Restaurant newRest=new Restaurant();
                    dispose();
                    new adminFunctions();
                
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Error!");
//                }
            }
        }
    }
}
