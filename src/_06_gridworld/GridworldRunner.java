	import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {public static void main(String[] args) {
	World wor=new World();
	wor.show();
	Bug insect=new Bug();
	Location loc= new Location(0,6);
	wor.add(loc, insect);
    insect.setColor(Color.BLUE);
    Bug ins=new Bug();
	Location place = new Location(3,6);
	ins.getLocation();
	wor.add(place, ins);
	}
                             }                      
