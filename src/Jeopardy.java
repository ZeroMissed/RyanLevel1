import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	
	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		
		// 1. Make the frame show up
        frame.show();
		// 2. Give your frame a title
		frame.setTitle("Jeopardy Questions");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header = createHeader("Header");
		// 4. Add the header component to the quizPanel
		quizPanel.add(header);
		// 5. Add the quizPanel to the frame
        frame.add(quizPanel);
		
		// 6. Use the firstButton variable to hold a button using the createButton method
	    firstButton = createButton("$100");
	// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that your game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		
		// 9. Use the secondButton variable to hold a button using the createButton method
		secondButton = createButton("$300");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		thirdButton = createButton("$3000");
		quizPanel.add(thirdButton);
		fourthButton = createButton("$5000");
		quizPanel.add(fourthButton);
		// 11. Add an action listeners to the buttons (2 lines of code)
	    firstButton.addActionListener(this);
	    secondButton.addActionListener(this);
	    thirdButton.addActionListener(this);
	    fourthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount+1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	 //* 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 //* 
	 //* [optional] Use the showImage or playSound methods when the user answers a question 
	 //* [optional] Add new topics for the quiz
	// */
	
	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton Button100 = new JButton(dollarAmount);
		// Set the text of the button to the dollarAmount
		Button100.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
	    buttonCount++;
		// Return your new button instead of the temporary button
		return Button100;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		//JOptionPane.showMessageDialog(null,"pressed " + ((JButton)arg0.getSource()).getText() + " button");

		// Use the method that plays the jeopardy theme music.

		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed == firstButton){
			// Call the askQuestion() method
			askQuestion("What is your favorite color?", "noColor", 100);
			// Fill in the askQuestion() method. When you play the game, the score should change.
		}
		if(buttonPressed == secondButton){
			// Call the askQuestion() method
			askQuestion("What is the best movie?", "noMovie", 300);
			// Fill in the askQuestion() method. When you play the game, the score should change.
		}
		if(buttonPressed == thirdButton){
			// Call the askQuestion() method
			askQuestion("How do you feel about your life?", "noLife", 3000);
			// Fill in the askQuestion() method. When you play the game, the score should change.
		}
		if(buttonPressed == fourthButton){
			// Call the askQuestion() method
			askQuestion("What is the best flavor of popcorn?", "Caramel", 5000);
			// Fill in the askQuestion() method. When you play the game, the score should change.
		}
		// Or if the buttonPressed was the secondButton


			// Call the askQuestionRecipe with a harder question
			
		
		// Clear the button text (set the button text to nothing)
		
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		//JOptionPane.showMessageDialog(null, "this is where the question will be asked");
		// Use a pop up to ask the user the question
	   String Answer = JOptionPane.showInputDialog(question);
		// If the answer is correct
		if(Answer == correctAnswer) {
			score+=prizeMoney;
			// Call the updateScore() method
			updateScore();
			// Pop up a message to tell the user they were correct
			JOptionPane.showMessageDialog(null, "You have good taste!");
		// Otherwise
		}
		else{
			JOptionPane.showMessageDialog(null, "Your opinion is inferrior to that of a Computer. You Fool!");
			score-=prizeMoney;
			//JOptionPane.showMessageDialog(null, "You were Wrong!");
			updateScore();
		}
			
			// Decrement the score by the prizeMoney
			
			// Pop up a message to tell the user the correct answer
			
			// Call the updateScore() method
			
		
	}

	public void playJeopardyTheme() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL("http://school.wintrisstech.org/sounds/jeopardy.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        ex.printStackTrace();
	    }
	}


	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}


