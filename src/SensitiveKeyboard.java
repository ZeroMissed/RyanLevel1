import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);

		frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				String words = "";
				Random random = new Random();
				switch (random.nextInt(3)) {
				case 0:
					words = "Stop thaat hurt!";
					break;
					
				case 1:
					words = "Stop thaat hurt!";
					break;

				case 2:
					words = "ouch";
					break;
				}

				try {
					Runtime.getRuntime().exec("say " + words).waitFor();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

	}

}
