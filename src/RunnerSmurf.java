
public class RunnerSmurf { public static void main(String[] args) {
	// Copyright Wintriss Technical Schools 2013
	/* 
	 * 1. Watch this smurf cartoon: http://www.youtube.com/watch?v=drf4t7wBTsA
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
	Smurf Handy = new Smurf("Handy");
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Handy.getName());
	System.out.println("The smurf is a " + Handy.isGirlOrBoy());
	System.out.println("The smurfs hat color is " + Handy.getHatColor());
}

}
