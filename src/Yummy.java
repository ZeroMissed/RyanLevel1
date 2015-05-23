
public class Yummy { public static void main(String[] args) {
	Microwave microwave = new Microwave();
	Popcorn popcorn = new Popcorn("Butter");
	microwave.putInMicrowave(popcorn);
	microwave.setTime(3);
	microwave.startMicrowave();
	
}

}





