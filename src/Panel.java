import com.sun.prism.Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by _iDong on 11/3/2016.
 */

public class Panel extends JPanel implements Runnable {
    public Thread loop;
    public Image BG;

    public Player player;

    public boolean isRunning = false;

    public Panel() {
        start();
        player = new Player(60,325);
        addKeyListener(new KeyInput(player));
        setFocusable(isRunning);
    }

    public void setBackground(java.awt.Graphics g) {
        BG = new ImageIcon("file/BG.jpg").getImage();
        g.drawImage(BG, 0, 0, null);

    }

    public void start() {
        loop = new Thread(this);
        loop.start();
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        setBackground(g);
        Graphics2D g2d= (Graphics2D)g;

        player.draw(g2d);
    }

    @Override
    public void run() {
        while (isRunning){
            //System.out.println("OK");
            if(player != null)
            player.update();
            repaint();


            try {
               Thread.sleep(30);
            }catch (Exception e){
            }
        }




    }
}
/*public class Panel extends JPanel implements Runnable {
    public Thread thread;

    public int fps = 1000;
    public int fallingSpeed = 10;

    public boolean isRunning = false;
    public boolean objectDefine = false;
    public boolean isfalling = false;

    private Image bg ,hero;


    public Panel() {
        //start();
        setBackground();
        defineObjects();
        thread = new Thread(this);
        start();

    }
    public void defineObjects(){
        hero = new ImageIcon("file/b1.png").getImage();
        objectDefine = true;
        repaint();
    }

    public void setBackground(){
        bg = new ImageIcon("file/BG.jpg").getImage();

    }


    public void paint(java.awt.Graphics g){
        super.paint(g);
        g.drawImage(bg,0,0,null);//set Background
        if(isRunning){
            Graphics2D player = (Graphics2D)g;
            player.drawImage(hero,0,0,100,100,null);
        }

    }

    public void start(){
        isRunning = true;
        thread.start();

    }

    public void stop(){
        isRunning = false;
    }

    public void render(){

    }

    public void run(){

        while (isRunning){
           // System.out.println("hello");




            try{
                thread.sleep(fps/1000);
            }catch (Exception e){}
            repaint();
        }
    }
}
*/
