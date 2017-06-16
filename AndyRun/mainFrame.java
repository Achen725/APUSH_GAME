import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
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
import java.io.File;
import java.io.IOException;
/*
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 */





public class mainFrame extends JFrame implements KeyListener{
    private mainDraw draw;
    private int numberCollected;




    public void keyPressed(KeyEvent e) {
        //System.out.println("keyPressed");
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            draw.moveRight();
        }
        else if(e.getKeyCode()== KeyEvent.VK_LEFT){
            draw.moveLeft();
        }
        else if(e.getKeyCode()== KeyEvent.VK_DOWN){
            draw.moveDown();
        }
        else if(e.getKeyCode()== KeyEvent.VK_UP){
            draw.moveUp();
        }

    }
    public void keyTyped(KeyEvent e) {
        //System.out.println("keyTyped");
    }

    public void incrementNumberCollected()
    {
        numberCollected++;
    }

    public void setNumberCollected(int x)
    {
        numberCollected = x;
    }


    public mainFrame(){
        numberCollected = 0;
        this.draw=new mainDraw();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {

                mainFrame frame = new mainFrame();
                frame.setTitle("Andy Game");
                frame.setResizable(false);
                frame.setSize(1000, 1000);
                frame.setMinimumSize(new Dimension(1000, 1000));
                frame.getContentPane().setBackground(Color.WHITE);
                frame.getContentPane().add(frame.draw);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              //  JukeBox.playSong1();
                frame.pack();
                frame.setVisible(true);

            }
        });
    }

    //method to close down this program
    public  void stop()
    {
        //clip.stop();
    }
}// end class ImageDisplay
