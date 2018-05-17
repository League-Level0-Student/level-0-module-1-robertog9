import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("When is your birthday?");
	
	if (answer.equals("05/17")) {
		// wish them a happy birthday
		JOptionPane.showMessageDialog(null, "Happy birthday");
	}
	else {
		// wish them a happy UN birthday
		JOptionPane.showMessageDialog(null, "Happy UN birthday");
		
	}
}
}
