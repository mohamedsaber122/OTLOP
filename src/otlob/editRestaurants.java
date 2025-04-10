package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static otlob.FileManager.restaurants;
import static otlob.FileManager.items;
public class editRestaurants extends JFrame implements Serializable {
private JList list;
private JTable table;
private JLabel label;
private JTextField Fond;
private JButton back;
private JButton addItem;
private Container c;
int x = 50;
int y =50;
public editRestaurants()
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
        FileManager.loadRestaurantsData();
        Restaurant r=new Restaurant();
        setTitle("OTLOB");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
     
        String[] array = new String[restaurants.size()];
        for(int i = 0; i < array.length; i++) {
        array[i] = restaurants.get(i).toString();
        }
        JComboBox comboBox = new JComboBox(array);
        comboBox.setSize(500,20);
        comboBox.setLocation(150,150);
        
        label=new JLabel("Edit a Restaurant");
        label.setSize(200,20);
        label.setLocation(300,10);
        label.setForeground(Color.white);
        back=new JButton("<<<Back");
        back.setLocation(10,10);
        back.setSize(100,20);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new adminFunctions();
            }
        });
        addItem=new JButton("Add Item");
        addItem.setSize(100,20);
        addItem.setLocation(50,50);
        addItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new addItemsGUI();
            }
        });
        //c.add(Fond);
       //c.add(list);
        c.add(label);
        c.add(back);
        c.add(addItem);
        //c.add(rests);
        setVisible(true);
        c.add(comboBox);
}

}
