
import java.util.Scanner;

public class If_Test {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your score? : ");

		int score = keyboard.nextInt();
		java.lang.String grade = "";

		if (score > 80 && score < 100)
			grade = "A";
		else if (score > 70 && score < 79)
			grade = "B";
		else if (score > 60 && score < 69)
			grade = "C";
		else if (score > 50 && score < 59)
			grade = "D";
		else
			grade = "You Failed!";
		System.out.println("Your grade is " + grade);

		keyboard.close();
	}

}
