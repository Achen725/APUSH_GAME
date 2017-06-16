import java.awt.*; 
import javax.swing.*; 
import java.util.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;

public class Menu{

    private JFrame frame;
    private JPanel panel;
    private JButton h2p;
    private JButton play;
    private JButton credit;

    public static void main (String[] args ){

        JFrame frame = new JFrame("APUSH Game");
        JPanel panel = new JPanel();

        frame.setSize(new Dimension(1000,1000));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton h2p = new JButton("How to Play");
        JButton play = new JButton("Play");
        JButton credit = new JButton("Credit");

        play.setVisible(true);        
        h2p.setVisible(true);        
        credit.setVisible(true);
       
        play.setBounds(500, 550, 250 ,100);
        h2p.setBounds(500, 450, 250 ,100);
        credit.setBounds(500, 350, 250 ,100);
        
        frame.add(play);
        frame.add(credit);
        frame.add(h2p);
        
    }

}