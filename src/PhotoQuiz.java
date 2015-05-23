// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		int counter = 0;
		String URL1 = "http://img.youtube.com/vi/Mmdc9RIhmOI/0.jpg";
		String URL2 = "http://i.imgur.com/qzHc7xe.png";

		Component Image1 = createImage(URL1);
		Component Image2 = createImage(URL2);

		quizWindow.add(Image1);

		quizWindow.pack();

		String Input = JOptionPane.showInputDialog("Who created this song ?");

		if (Input.equalsIgnoreCase("tobuscus")) {
			JOptionPane.showMessageDialog(null, "Correct. You have been wasting your time with this garbage.");
			counter += 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Incorrect. Good for you, you have not been wasting your time with this garbage.");
		}

		quizWindow.remove(Image1);

		quizWindow.add(Image2);

		quizWindow.pack();

		String Input2 = JOptionPane
				.showInputDialog("What type of sword is this?");
		if (Input2.equalsIgnoreCase("diamond sword")) {
			counter += 1;
			JOptionPane.showMessageDialog(null,"Correct. You have been wasting your time with this garbage.");
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. Good for you, you have notbeen wasting your time with this garbage.");// 14+
																												
		}
JOptionPane.showMessageDialog(null, "You got " + counter + " questions right!");
	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
