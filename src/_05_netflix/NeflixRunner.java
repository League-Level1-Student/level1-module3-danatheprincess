package _05_netflix;

public class NeflixRunner {
public static void main(String[] args) {
	Movie Wonder=new Movie("Wonder",5);
	Movie SchoolOfRock=new Movie("School of Rock",3);
	Movie TheEraOfZomies=new Movie("The Era of Zombies",2);
	Movie TheSilence=new Movie("The Silence",4);
	Movie WorstMovieEver=new Movie("Worst Movie Ever",1);
	Wonder.getTicketPrice();
	NetflixQueue netflix=new NetflixQueue();
	netflix.addMovie(WorstMovieEver);
	netflix.addMovie(TheSilence);
	netflix.addMovie(TheEraOfZomies);
	netflix.addMovie(SchoolOfRock);
	netflix.addMovie(Wonder);
	netflix.printMovies();
	System.out.println("The best movie is "+netflix.getBestMovie());
	System.out.println("The second best movie is "+netflix.getMovie(1));
} 
}
