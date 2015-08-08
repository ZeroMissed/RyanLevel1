import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	JButton ybutton = new JButton();
	JButton rbutton = new JButton();
	JButton bbutton = new JButton();
	JButton gbutton = new JButton();

	public static void main(String[] args) {
		Level1Exam exam = new Level1Exam();
		exam.createUI();
	}

	public void createUI() {
		JFrame frame = new JFrame("Color Teacher");
		JPanel panel = new JPanel();
		frame.add(panel);

		ybutton.setBackground(Color.yellow);
		panel.add(ybutton);
		ybutton.setOpaque(true);
		ybutton.addActionListener(this);

		rbutton.setBackground(Color.red);
		panel.add(rbutton);
		rbutton.setOpaque(true);
		rbutton.addActionListener(this);

		bbutton.setBackground(Color.blue);
		panel.add(bbutton);
		bbutton.setOpaque(true);
		bbutton.addActionListener(this);

		gbutton.setBackground(Color.green);
		panel.add(gbutton);
		gbutton.setOpaque(true);
		gbutton.addActionListener(this);

		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(ybutton)) {
			speak("yellow");
		}
		if (arg0.getSource().equals(rbutton)) {
			speak("red");
		}
		if (arg0.getSource().equals(bbutton)) {
			speak("blue");
		}
		if (arg0.getSource().equals(gbutton)) {
			speak("green");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}