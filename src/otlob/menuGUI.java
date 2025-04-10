package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static otlob.FileManager.items;
import static otlob.FileManager.restaurants;
public class menuGUI extends JFrame implements Serializable{
private JLabel label;
private JList list;
private JTextField choice;
private JLabel enter;
private JButton confirm;
private JButton back;
private Container c;
public static String choice1;
public String[] arrayItems=new String[items.size()];
 public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }
   
public menuGUI()
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
        label= new JLabel("Main Menu");
        label.setSize(200,20);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setLocation(320,10);
        label.setForeground(Color.white);
        c.add(label);
        setVisible(true);
      
        FileManager.loadRestaurantsData();
        String[] array = new String[restaurants.size()];
        for(int i = 0; i < array.length; i++) {
        array[i] = restaurants.get(i).toString();
        }
        
     
        
        
        JComboBox comboBox = new JComboBox(array);
     
        
        
        
        comboBox.setSize(500,20);
        comboBox.setLocation(150,150);
        choice = new JTextField();
        choice.setSize(100,20);
        choice.setLocation(350,300);
        enter=new JLabel("Enter Restaurant ID: ");
        enter.setSize(200,25);
        enter.setLocation(150,300);
        enter.setForeground(Color.white);
        enter.setFont(new Font("Arial",Font.BOLD,20));
        confirm=new JButton("Confirm");
        confirm.setSize(100,20);
        confirm.setLocation(350,400);
        
        confirm.addActionListener(new ActionListener()
        {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                choice1=choice.getText();
                System.out.println(choice1);
                
                setChoice1(choice1);
                System.out.println(getChoice1());
                dispose();
                new selectedRestUser();
            }
        });
        back=new JButton("LogOut");
        back.setSize(100,20);
        back.setLocation(10, 10);
        c.add(back);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new otlobGUI();
            }
        });
        
        c.add(choice);
        c.add(comboBox);
        c.add(enter);
        c.add(confirm);
}
public static String getChoice1() {
        return choice1;
    }

    


}

