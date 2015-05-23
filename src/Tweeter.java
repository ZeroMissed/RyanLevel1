import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Tweeter { 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Search The Twitterverse");
	public static void main(String[] args) {
	Tweeter r = new Tweeter();
	r.createUI();
}

private void createUI() {
	
	frame.add(panel);
	panel.add(button);
	frame.pack();
	frame.setVisible(true);
	
}

}
