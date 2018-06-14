//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {
   String kassandra = "singing";
   String emilse = "patience";
   String roberto = "speed";
   String jp = "funny";
   String emilio = "fly";

String answer = JOptionPane.showInputDialog("Enter a name of someone at your table");
	if(answer.equals("kassandra")) {
		//show super power
		JOptionPane.showMessageDialog(null, "singing");
	}
	if(answer.equals("emilse")) {
		//show super power
		JOptionPane.showMessageDialog(null, "patience");
	}
	if(answer.equals("roberto")) {
		//show super power
		JOptionPane.showMessageDialog(null, "speed");
	}
	if(answer.equals("emilio")) {
		//show super power
		JOptionPane.showMessageDialog(null, "fly");
	}
	if(answer.equals("jp")) {
		//show super power
		JOptionPane.showMessageDialog(null, "funny");
	}
	}
	
		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}


