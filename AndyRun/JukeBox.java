 
/**
 * Write a description of class JukeBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class JukeBox
{
    private static Clip clip1;
    private static Clip clip2;
    private static Clip clip3;
    private static Clip clip4;
    
    
    
    public static void playSong1()
    {
         try 
		{
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Andy/Downloads/AndyRun/Music/WhiteX6Panda.wav").getAbsoluteFile());
          clip1 = AudioSystem.getClip();
          clip1.open(audioInputStream);
      			  
        } 
        catch(Exception ex) 
        {
      	 System.out.println("Error with playing sound.");
         ex.printStackTrace();
    	}
        clip1.start();
    }
    
    public static void stopSong1()
    {
        clip1.stop();
    }
    
    public static void playSong2()
    {
        try 
		{
          AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(new File("/Users/Andy/Downloads/AndyRun/Music/SurfinBirdforGame.wav").getAbsoluteFile());
          clip2 = AudioSystem.getClip();
          clip2.open(audioInputStream2);
          
      			  
        } 
        catch(Exception ex) 
        {
      	 System.out.println("Error with playing sound.");
         ex.printStackTrace();
    	}
        clip2.start();
    }
    
    public static void stopSong2()
    {
        clip2.stop();
    }
    
    public static void playSong3()
    {
        try 
		{
          AudioInputStream audioInputStream3 = AudioSystem.getAudioInputStream(new File("/Users/Andy/Downloads/AndyRun/Music/FinalCountdown.wav").getAbsoluteFile());
          clip3 = AudioSystem.getClip();
          clip3.open(audioInputStream3);
          
      			  
        } 
        catch(Exception ex) 
        {
      	 System.out.println("Error with playing sound.");
         ex.printStackTrace();
    	}
        clip3.start();
    }
    
    public static void stopSong3()
    {
        clip3.stop();
    }
    
    public static void playSong4()
    {
        try 
		{
          AudioInputStream audioInputStream4 = AudioSystem.getAudioInputStream(new File("/Users/Andy/Downloads/AndyRun/Music/WhiteX6Panda.wav").getAbsoluteFile());
          clip4 = AudioSystem.getClip();
          clip4.open(audioInputStream4);
          
      			  
        } 
        catch(Exception ex) 
        {
      	 System.out.println("Error with playing sound.");
      	 
      	 
      	 
         ex.printStackTrace();
    	}
        clip4.start();
    }
    
    public static void stopSong4()
    {
        clip4.stop();
    }
}
 
 
