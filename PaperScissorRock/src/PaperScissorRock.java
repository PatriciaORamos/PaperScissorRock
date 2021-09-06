
import java.util.Random;
import java.util.Scanner;

/**
 * @author Patricia Ramos
 *
 */
public class PaperScissorRock {

	private static Scanner key;

	public static void main(String[] args) {

		key = new Scanner(System.in);
		Random random = new Random();
		boolean isPlay = true;

		Player user;
		Player computer = new Player("Computer");

		System.out.println("* Welcome to Paper Scissor Rock *");
		System.out.println("What is your name?");
		user = new Player(key.nextLine());

		while (isPlay) {

			System.out.println("\nChoose 1 to Paper, 2 to Scissor, 3 to Rock");
			int userValue = key.nextInt();
			if (userValue < 1 || userValue > 3) {
				System.out.println("--> The number inputed is invalid, try again");
				continue;
			}

			// generate ramdomly choice to computer
			int computerValue = random.nextInt(3) + 1;

			// output the choice of the user and computer
			System.out.println(user.getName() + ", you choose " + getChoose(userValue));
			System.out.println("Computador choose " + getChoose(computerValue));

			validateWinner(user, computer, userValue, computerValue);

			// output total of the points each round
			System.out.println("\nTotal Point:");
			System.out.println("You - " + user.getTotalWin());
			System.out.println("Computer - " + computer.getTotalWin());

		}

	}

	/**
	 * This method validate Winner
	 * 
	 * @param Player user
	 * @param Player computer
	 * @param int    userValue
	 * @param int    computerValue
	 */
	private static void validateWinner(Player user, Player computer, int userValue, int computerValue) {
		// validate who winner
		if (computerValue == userValue) {
			System.out.println("GAME TIED");
		} else if ((userValue == 1 && computerValue == 3) || (userValue == 2 && computerValue == 1)
				|| (userValue == 3 && computerValue == 2)) {
			System.out.println("\n*** USER WINNER ***");
			user.setTotalWin();
		} else {
			System.out.println("\n*** COMPUTER WINNER ***");
			computer.setTotalWin();
		}
	}

	/**
	 * method return name of the choice
	 * 
	 * @param int value
	 * @return
	 */
	public static String getChoose(int value) {
		String valueName = "";
		if (value == 1)
			valueName = "PAPER";
		else if (value == 2)
			valueName = "SCISSOR";
		else if (value == 3)
			valueName = "ROCK";
		return valueName;
	}

}
