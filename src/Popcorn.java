
public class Popcorn {
	private int kernels = 20;
	private String flavor;

	Popcorn(String flavor) {
		System.out.println("Popcorn says: making package of " + flavor + " popcorn.");
		this.flavor = flavor;
	}

	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
