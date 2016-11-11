import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 * Created by _iDong on 11/7/2016.
 */
public class Player {
    private int x;
    private int y;
    private boolean up;
    public double counter;
    private Dimension size = new Dimension(100,100);

    private int speedx = 0;
    private int speedy = 0;


    public Image hero;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        setUpHero();
    }
   public void setUpHero(){
       hero = new ImageIcon("file/hero_b7.gif").getImage();
   }

    public void update(){
        this.x += speedx;
        this.y += speedy;

        if(x < 0){
            x = 640;
        }
        if(y < 0){
            y = 0;
        }
        if(x > 640){
            x = 0;
        }
        if(y > 480){
            y = 0;
        }
        if (up == true){
            counter += 0.05;
            y = y + (int) ((Math.sin(counter) + Math.cos(counter))* 5);
            if(counter >= 2){
                counter = 4;

            }
        }
    }

    public void draw(Graphics2D g2d){
       g2d.drawImage(hero, x, y, size.width, size.height,null);
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 3;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = -3;
        }
        if(key == KeyEvent.VK_UP ){
            up=true;
        }
        if(key == KeyEvent.VK_DOWN){

        }
    }


    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_UP){

        }
        if(key == KeyEvent.VK_DOWN){

        }
    }
}
