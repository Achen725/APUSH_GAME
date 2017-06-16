
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
import java.util.*;

public class mainDraw extends JComponent {

    //panda position
    public int x = 0;
    public int y = 0;

    //runner position and running direction
    int time = 0;

    ArrayList<Integer> xpos = new ArrayList<Integer>();
    ArrayList<Integer> ypos = new ArrayList<Integer>();

    ArrayList<Integer> xstuck = new ArrayList<Integer>();
    ArrayList<Integer> ystuck = new ArrayList<Integer>();

    ArrayList<Integer> xbull = new ArrayList<Integer>();
    ArrayList<Integer> ybull = new ArrayList<Integer>();

    ArrayList<Integer> dir = new ArrayList<Integer>();
    ArrayList<Boolean> collected = new ArrayList<Boolean>();
    private int song = 0;
    public int count = 0;
    private int collectedCount = 0;
    private BufferedImage bi;
    private BufferedImage RB;
    private BufferedImage Obs;
    private BufferedImage K;
    private BufferedImage D;
    private BufferedImage B;
    private BufferedImage Stud;
    public boolean oneDone = false;
    public boolean twoDone = false;
    public boolean threeDone = false;


    public boolean collide(int x,int y,int x2, int y2) {
        if(y>=y2+100 || y + 100 <=y2){
            return false;
        }
        if(x>=x2+100 || x+100<=x2){
            return false;
        }
        return true;
    }

    public void drawOne(Graphics g) {

        if(time == 0) {
            x=0;
            y=0;
            ArrayList<Integer> xpos2 = new ArrayList<Integer>(Arrays.asList(700,0,0,0,300,500,700));
            ArrayList<Integer> ypos2 = new ArrayList<Integer>(Arrays.asList(0,500,200,700,700,500,600));

            ArrayList<Integer> xstuck2 = new ArrayList<Integer>(Arrays.asList(300,600,100,500,600,900,0,200,300,400,600,800,200,100,400,900,600));
            ArrayList<Integer> ystuck2 = new ArrayList<Integer>(Arrays.asList(0,0,100,100,200,200,400,500,600,600,600,600,700,800,800,800,900));

            ArrayList<Integer> xbull2 = new ArrayList<Integer>(Arrays.asList(900,300,800,100,600,400,500,200,0,800));
            ArrayList<Integer> ybull2 = new ArrayList<Integer>(Arrays.asList(0,100,200,300,400,500,700,800,900,900));

            ArrayList<Integer> dir2 = new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1));
            ArrayList<Boolean> collected2 = new ArrayList<Boolean>(Arrays.asList(false,false,false,false,false,false,false,false,false,false));

            xpos = xpos2;
            ypos = ypos2;
            xstuck = xstuck2;
            ystuck = ystuck2;
            xbull = xbull2;
            ybull = ybull2;

            dir = dir2;
            collected = collected2;
        }


        if(time%40==0){
            dir.set(0,-1*dir.get(0));
        }
        ypos.set(0,ypos.get(0) + dir.get(0)*(5));
        g.drawImage(Obs, xpos.get(0),ypos.get(0), null);

        if(time%20==0){
            dir.set(1,-1*dir.get(1));
        }
        xpos.set(1,xpos.get(1) + dir.get(1)*(5));
        g.drawImage(Obs, xpos.get(1),ypos.get(1), null);

        if(time%60==0){
            dir.set(2,-1*dir.get(2));
        }
        xpos.set(2,xpos.get(2) + dir.get(2)*(5));
        g.drawImage(Obs, xpos.get(2),ypos.get(2), null);

        if(time%20==0){
            dir.set(3,-1*dir.get(3));
        }
        xpos.set(3,xpos.get(3) + dir.get(3)*(5));
        g.drawImage(Obs, xpos.get(3),ypos.get(3), null);


        if(time%40==0){
            dir.set(4,-1*dir.get(4));
        }
        ypos.set(4,ypos.get(4) + dir.get(4)*(5));
        g.drawImage(Obs, xpos.get(4),ypos.get(4), null);

        if(time%20==0){
            dir.set(5,-1*dir.get(5));
        }
        ypos.set(5,ypos.get(5) + dir.get(1)*(5));
        g.drawImage(Obs, xpos.get(5),ypos.get(5), null);

        if(time%60==0){
            dir.set(6,-1*dir.get(6));
        }
        ypos.set(6,ypos.get(6) + dir.get(6)*(5));
        g.drawImage(Obs, xpos.get(6),ypos.get(6), null);


        for(int i=0;i<xstuck.size();i++){
            g.drawImage(Obs, xstuck.get(i), ystuck.get(i), null);
        }

        for(int i=0;i<collected.size();i++){
            if(!collected.get(i)) g.drawImage(RB, xbull.get(i), ybull.get(i), null);
        }

        for(int i=0;i<xpos.size();i++){
            if(collide(x,y,xpos.get(i),ypos.get(i))) {
                resetOne();
            }
        }
        for(int i=0;i<xstuck.size();i++){
            if(collide(x,y,xstuck.get(i),ystuck.get(i))) {
               resetOne();
            }
        }

        int count = 0;
        for(int i=0;i<xbull.size();i++){
            if(collide(x,y,xbull.get(i),ybull.get(i))){
                collected.set(i,true);
            }

            if(collected.get(i)) count++;
        }

        time+=1;
        repaint();

        if(count== 1 ) { //10
            oneDone = true;
            time = 0;
        }
    }


   public void drawTwo(Graphics g) {
       if(time == 0) {
            x=0;
            y=0;
            ArrayList<Integer> xpos2 = new ArrayList<Integer>(Arrays.asList(500,600,0,400,800,500,200));
            ArrayList<Integer> ypos2 = new ArrayList<Integer>(Arrays.asList(0,200,300,500,500,600,700));

            ArrayList<Integer> xstuck2 = new ArrayList<Integer>(Arrays.asList(0,0,100,200,200,300,300,400,400,400,500,600,700,700,800,800,800,900));
            ArrayList<Integer> ystuck2 = new ArrayList<Integer>(Arrays.asList(100,800,600,100,600,200,700,300,600,900,300,800,0,600,100,400,700,300));

            ArrayList<Integer> xbull2 = new ArrayList<Integer>(Arrays.asList(0,100,200,200,300,400,500,600,600,700,800,900,900));
            ArrayList<Integer> ybull2 = new ArrayList<Integer>(Arrays.asList(900,800,200,500,100,700,400,0,900,500,300,0,600));

            ArrayList<Integer> dir2 = new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1));
            ArrayList<Boolean> collected2 = new ArrayList<Boolean>(Arrays.asList(false,false,false,false,false,false,false,false,false,false,false,false,false));

            xpos = xpos2;
            ypos = ypos2;
            xstuck = xstuck2;
            ystuck = ystuck2;
            xbull = xbull2;
            ybull = ybull2;

            dir = dir2;
            collected = collected2;
        }

        if(time%20==0){
            dir.set(0,-1*dir.get(0));
        }
        ypos.set(0,ypos.get(0) + dir.get(0)*(5));
        g.drawImage(Stud, xpos.get(0),ypos.get(0), null);

        if(time%40==0){
            dir.set(1,-1*dir.get(1));
        }
        ypos.set(1,ypos.get(1) + dir.get(1)*(5));
        g.drawImage(Stud, xpos.get(1),ypos.get(1), null);

        if(time%60==0){
            dir.set(2,-1*dir.get(2));
        }
        xpos.set(2,xpos.get(2) + dir.get(2)*(5));
        g.drawImage(Stud, xpos.get(2),ypos.get(2), null);

        if(time%40==0){
            dir.set(3,-1*dir.get(3));
        }
        xpos.set(3,xpos.get(3) + dir.get(3)*(5));
        g.drawImage(Stud, xpos.get(3),ypos.get(3), null);

        if(time%20==0){
            dir.set(4,-1*dir.get(4));
        }
        ypos.set(4,ypos.get(4) + dir.get(4)*(5));
        g.drawImage(Stud, xpos.get(4),ypos.get(4), null);

        if(time%40==0){
            dir.set(5,-1*dir.get(5));
        }
        ypos.set(5,ypos.get(5) + dir.get(1)*(5));
        g.drawImage(Stud, xpos.get(5),ypos.get(5), null);

        if(time%20==0){
            dir.set(6,-1*dir.get(6));
        }
        ypos.set(6,ypos.get(6) + dir.get(6)*(5));
        g.drawImage(Stud, xpos.get(6),ypos.get(6), null);


        for(int i=0;i<xstuck.size();i++){
            g.drawImage(Stud, xstuck.get(i), ystuck.get(i), null);
        }


        for(int i=0;i<collected.size();i++){
            if(!collected.get(i)) g.drawImage(B, xbull.get(i), ybull.get(i), null);
        }

        for(int i=0;i<xpos.size();i++){
            if(collide(x,y,xpos.get(i),ypos.get(i))) {
                //resetTwo();
                oneDone = false;
            }
        }

        for(int i=0;i<xstuck.size();i++){
            if(collide(x,y,xstuck.get(i),ystuck.get(i))) {
               //resetTwo();
               oneDone = false;
            }
        }

        int count = 0;
        for(int i=0;i<xbull.size();i++){
            if(collide(x,y,xbull.get(i),ybull.get(i))){
                collected.set(i,true);
            }

            if(collected.get(i)) count++;
        }

        time+=1;
        repaint();
        if(!oneDone) time = 0;
        if(count==1) { // 13
            twoDone = true;
            time = 0;
        }
    }


   public void drawThree(Graphics g) {
       if(time == 0) {
            x=500;
            y=900;

            ArrayList<Integer> xpos2 = new ArrayList<Integer>(Arrays.asList(0,500,600,0,100,200,700,500,400,400,600,700));
            ArrayList<Integer> ypos2 = new ArrayList<Integer>(Arrays.asList(0,0,100,600,300,200,100,300,500,700,600,700));

            ArrayList<Integer> xstuck2 = new ArrayList<Integer>(Arrays.asList(0,0,100,100,100,200,200,200,300,300,300,400,400,400,500,600,600,800,800,800,800,900,900));
            ArrayList<Integer> ystuck2 = new ArrayList<Integer>(Arrays.asList(500,900,0,200,800,400,600,800,300,500,900,100,200,800,800,0,800,0,300,600,700,100,400));;

            ArrayList<Integer> dir2 = new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1));

            xpos = xpos2;
            ypos = ypos2;
            xstuck = xstuck2;
            ystuck = ystuck2;

            dir = dir2;
        }

        if(time%20==0){
            dir.set(1,-1*dir.get(1));
        }
        ypos.set(1,ypos.get(1) + dir.get(1)*(5));
        g.drawImage(Obs, xpos.get(1),ypos.get(1), null);

        if(time%20==0){
            dir.set(2,-1*dir.get(2));
        }
        ypos.set(2,ypos.get(2) + dir.get(2)*(5));
        g.drawImage(Obs, xpos.get(2),ypos.get(2), null);

        if(time%20==0){
            dir.set(3,-1*dir.get(3));
        }
        ypos.set(3,ypos.get(3) + dir.get(3)*(5));
        g.drawImage(Obs, xpos.get(3),ypos.get(3), null);

        if(time%20==0){
            dir.set(4,-1*dir.get(4));
        }
        xpos.set(4,xpos.get(4) + dir.get(4)*(5));
        g.drawImage(Obs, xpos.get(4),ypos.get(4), null);

        if(time%20==0){
            dir.set(5,-1*dir.get(5));
        }
        xpos.set(5,xpos.get(5) + dir.get(1)*(5));
        g.drawImage(Obs, xpos.get(5),ypos.get(5), null);

        if(time%20==0){
            dir.set(6,-1*dir.get(6));
        }
        xpos.set(6,xpos.get(6) + dir.get(6)*(5));
        g.drawImage(Obs, xpos.get(6),ypos.get(6), null);

        if(time%40==0){
            dir.set(7,-1*dir.get(7));
        }
        xpos.set(7,xpos.get(7) + dir.get(7)*(5));
        g.drawImage(Obs, xpos.get(7),ypos.get(7), null);

        if(time%40==0){
            dir.set(8,-1*dir.get(8));
        }
        xpos.set(8,xpos.get(8) + dir.get(8)*(5));
        g.drawImage(Obs, xpos.get(8),ypos.get(8), null);

        if(time%40==0){
            dir.set(9,-1*dir.get(9));
        }
        xpos.set(9,xpos.get(9) + dir.get(9)*(5));
        g.drawImage(Obs, xpos.get(9),ypos.get(9), null);

        if(time%20==0){
            dir.set(10,-1*dir.get(10));
        }
        xpos.set(10,xpos.get(10) + dir.get(10)*(5));
        g.drawImage(Obs, xpos.get(10),ypos.get(10), null);
        g.drawImage(K, 400,0, null);


        if(time%20==0){
            dir.set(11,-1*dir.get(11));
        }
        ypos.set(11,ypos.get(11) + dir.get(11)*(5));
        g.drawImage(Obs, xpos.get(11),ypos.get(11), null);
        g.drawImage(K, 400,0, null);

        for(int i=0;i<xstuck.size();i++){
            g.drawImage(D, xstuck.get(i), ystuck.get(i), null);
        }


        for(int i=0;i<xpos.size();i++){
            if(collide(x,y,xpos.get(i),ypos.get(i))) {
                //resetTwo();
                oneDone = false;
                twoDone = false;
            }
        }


        for(int i=0;i<xstuck.size();i++){
            if(collide(x,y,xstuck.get(i),ystuck.get(i))) {
               //resetTwo();
               oneDone = false;
               twoDone = false;
            }
        }
         time+=1;
         repaint();
         if(!oneDone ) {
             time = 0;
            }
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //File andy = new File("C:\\Users\\yural\\Downloads\\picturesforourgame\\Panda.jpg");
        File andy = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/Panda.jpg");
        //File RBCan = new File("C:\\Users\\yural\\Downloads\\picturesforourgame\\RBCanCollectableItem.jpg");
        File RBCan = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/newRB.jpg");
        //File SObstacle = new File("C:\\Users\\yural\\Downloads\\picturesforourgame\\SeventhGraderObstacle.jpg");
        File SObstacle = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/7thGrader.jpg");
        File S = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/newStudentOb.jpg");
        File DObstacle = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/newDesk.jpg");
        File KRO = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/Kro.jpg");
        File Book = new File("/Users/Andy/Desktop/SchoolProj/APUSH_GAME/AndyRun/pictures4game/newBook.jpg");


        try {
            bi = ImageIO.read(andy);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try {
           Stud = ImageIO.read(S);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try {
            B = ImageIO.read(Book);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try{
            Obs = ImageIO.read(SObstacle);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try{
            RB = ImageIO.read(RBCan);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try{
            D = ImageIO.read(DObstacle);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }
        try{
            K = ImageIO.read(KRO);
        }
        catch (IOException e){
            System.out.println("Image could not be read");
        }


        g.drawImage(bi, x, y, null);
      //  music();

        if(!oneDone) {drawOne(g);}
        else if(!twoDone) {drawTwo(g);}
        /*else if(twoDone && song == 0)
        {
            JukeBox.stopSong1();
            JukeBox.playSong3();
            song = 1;
        }*/
        else if(!threeDone) {drawThree(g);}

    }
    public void resetOne() {
        ArrayList<Integer> xbull2 = new ArrayList<Integer>(Arrays.asList(900,300,800,100,600,400,500,200,0,800));
        ArrayList<Integer> ybull2 = new ArrayList<Integer>(Arrays.asList(0,100,200,300,400,500,700,800,900,900));
        ArrayList<Boolean> collected2 = new ArrayList<Boolean>(Arrays.asList(false,false,false,false,false,false,false,false,false,false));


        xbull = xbull2;
        ybull = ybull2;
        collected = collected2;
        x=0;
        y=0;
    }
    public static void moveObstacleOne (Graphics g){
        int c = 300;
        int d = 100;
        int i = 0;
        int j = 0;
        while(i < 4)
        {    g.drawOval(c,d,100,100);
             g.fillOval(c,d,100,100);
             g.setColor(Color.RED);
            c +=100;
            if(i == 3)
            {
                j = 4;
            }
            i++;
        }
        while(j > 0)
        {    g.drawOval(c,d,100,100);
             g.fillOval(c,d,100,100);
             g.setColor(Color.RED);
            c -= 100;
            if(j == 1)
            {
                i = 0;
            }
            j--;
        }

    }

    public void moveRight() {
        if(x == 900)
        {
            //repaint();
            return;
        }
        x = x + 100;

        count ++;
        //repaint();
    }

    public void moveLeft() {
        if(x == 0)
        {
            //repaint();
            return;
        }
        x = x - 100;

        count ++;
        //repaint();
    }

    public void moveDown() {
        if(y == 900)
        {
          //repaint();
          return;
        }
        y = y + 100;

        count++;
        //repaint();
    }

    public void moveUp() {
        if(y == 0)
        {
            //repaint();
            return;
        }
        y = y - 100;

        count ++;
        //repaint();
    }
}
