package map;

import java.awt.*;

public class Solids extends Rectangle {

    public Solids(int x, int y){
        super(x, y, 48, 48);
    }

    public void render(Graphics g){
        g.setColor(Color.magenta);
        g.fillRect(x,y,width,height);
    }
}
