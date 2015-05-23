//Paste the code below into 2 classes called Movie and NetflixQueue.
//Create your own class with a main() method that will use Movie and NetflixQueue to complete the following challenges:
	//1. Instantiate some Movie objects (at least 5).
	//2. Use the methods in the Movie object to print the name and rating of your favorite.
	
	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 





import java.util.ArrayList;
import java.util.Collections;

public class Netflix {
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

}



