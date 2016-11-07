import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by _iDong on 11/7/2016.
 */
public class KeyInput extends KeyAdapter{
   public Player player;

    public KeyInput(Player player) {
        this.player = player;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        player.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        player.keyReleased(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
    }
}
