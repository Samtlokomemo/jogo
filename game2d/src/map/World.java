package map;

import main.JogoPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class World extends JogoPanel {

    public List<Solids> solids = new ArrayList<Solids>();

    public World(){
        for (int xx = 0; xx < 15; xx++) {
            solids.add(new Solids(xx * 48, 0));
        }
    }

    public void render(Graphics g){
        for (int i = 0; i < solids.size(); i++) {
            solids.get(i).render(g);
        }
    }
}
