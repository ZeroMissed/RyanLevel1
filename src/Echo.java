import javax.swing.JOptionPane;

public class Echo {
	
	public static void main(String[] args) {
	Echo r = new Echo();
	int num = Integer.parseInt(JOptionPane.showInputDialog("Input a number and I will tell you whether it is odd or even."));
	String mad = "";
	if(r.isOdd(num) == true){
	  mad = "The number you gave me is odd.";
	}
	else {
		  mad = "The number you gave me is even.";
		}
	JOptionPane.showMessageDialog(null, mad);
	
}
	
public  boolean isOdd(int number) {
	boolean out = true;
	 if(number%2 == 0){
		out = false;
	 }
	return out;
}

}
