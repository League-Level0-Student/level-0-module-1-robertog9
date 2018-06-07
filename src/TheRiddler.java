import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score=0;
		 String thisisThePassword = "Footsteps";
		String answer=JOptionPane.showInputDialog("The more you take, the more you leave behind. What am I?");
       
		if(answer.equals(thisisThePassword)){
			//correct answer
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score +1;
			JOptionPane.showMessageDialog(null,"Congratulations, you scored " +score);
	        
		}
	
		else {
			//wrong answer
			JOptionPane.showMessageDialog(null, "Wrong, the answer is Footsteps");
		}
		
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

