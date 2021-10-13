package _06_gridworld;
import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {public static void main(String[] args) {
	World wor=new World();
	wor.show();
	Bug insect=new Bug();
	Location loc= new Location(0,6);
	wor.add(loc, insect);
    insect.setColor(Color.BLUE);
    insect.turn();
    Flower flor=new Flower();
    Location place=new Location(0,5);
    wor.add(place, flor);
    Flower plant=new Flower();
    Location cat=new Location(0,7);
    wor.add(cat, plant);
    for(int i=0;i<10;i++) {
    	for(int j=0;j<10;j++){
    	Flower sun=new Flower();
    	Location beach=new Location(i,j);
    	wor.add(beach, sun);
    }
    	
    }
	}
}  
