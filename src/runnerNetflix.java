//Paste the code below into 2 classes called Movie and NetflixQueue.
//Create your own class with a main() method that will use Movie and NetflixQueue to complete the following challenges:
	//1. Instantiate some Movie objects (at least 5).
	//2. Use the methods in the Movie object to print the name and rating of your favorite.
	
	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 

public class runnerNetflix { public static void main(String[] args) {
	Movie one = new Movie("The Interview", 5);
	Movie two = new Movie("Unbroken", 4);
	Movie three = new Movie("Avatar", 3);
	Movie four = new Movie("Hobbit", 3);
	Netflix Ryan = new Netflix();
	Ryan.addMovie(one);
	Ryan.addMovie(two);
	Ryan.addMovie(three);
	Ryan.addMovie(four);
	System.out.println("The best movie is " + one.getTitle());
	System.out.println("The second best movie is " + two.getTitle());
	
}
}
