package _01_intro_to_static;
public class RunningRace {


	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Athlete geo=new Athlete("Andrew",5);
	    		System.out.println(geo.name+" "+geo.bibNumber+" "+geo.raceLocation);
	    
	    		Athlete nick=new Athlete("Dana",3);
	    		System.out.println(nick.name+" "+nick.bibNumber+" "+nick.raceLocation);
	    }

}
