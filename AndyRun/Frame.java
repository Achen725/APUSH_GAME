import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Frame extends JFrame {
    private JFrame menu;
    private Panel menupan;
    private JButton play;
    private JButton help;
    private JButton credits;
    private JPanel gamename;
    public Frame()
    {
        menu = new JFrame("Main Menu");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menupan = new Panel();
        menupan.setPreferredSize(new Dimension(2000,2000));
        menu.getContentPane().add(menupan);
        play = new JButton("Play");
        menupan.setLayout(null);
        play.setBounds(550,350 , 250, 100);
        menupan.add(play);
        help = new JButton("Help");
        credits = new JButton("Credits");
        help.setBounds(550, 450, 250, 100);
        menupan.add(help);
        credits.setBounds(550, 550, 250, 100);
        menupan.add(credits);
        
        
    }
    public void display()
    {
    	menu.pack();
        menu.setVisible(true);
    
    } 
}