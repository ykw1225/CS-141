//Yeung Kit Wong
//10/22/2014
//HW5

import java.util.*;
public class GuessingGame
{
	public static final int MAX = 100;
	public static void main (String[] args)
	{
		haiku ();
		Scanner input = new Scanner (System.in);
		Random rand = new Random ();
		//Create a guess counter to count the total times of guessing
		int totalGuess = 0;
		//Create a game counter to count the times of games
		int gameCounter = 0;
		//Create a variable to count the times of guess in each game
		int guessCounter;
		//Create a variable for saving the times of guessing of the fast game
		int bestGame = 0;
		//Create a variable for saving the yes no answer which from asking the user
		String yn = "";

		do{
			//A bounch of update
			guessCounter = 0;
			gameCounter ++;
			//Start a game
			guessCounter = playGame (input, rand, guessCounter);
			//Show the result of one game
			result(guessCounter);
			totalGuess += guessCounter;
			//Set the fast game is the first game as initialization
			//Run compasion when it is not the first game
			if (gameCounter == 1) bestGame = guessCounter;
			else bestGame = Math.min (bestGame, guessCounter);
			//Ask the user if play again
			yn = playAgain (input, yn);
		}while (yn.equals ("y")|| yn.equals ("Y"));
		//Show the overall result
		conclusion (totalGuess, gameCounter, bestGame);
	}

	//Method for ask play again
	public static String playAgain (Scanner input, String yn)
	{
		System.out.print ("Do you want to play again? ");
		yn = input.next ();
		yn = yn.substring (0,1);
		return yn;
	}

	//Haiku poem
	public static void haiku ()
	{
		System.out.println ("If you feel so bored!");
		System.out.println ("You can open this door!");
		System.out.println ("Let brain be your sword!");
	}

	//Check the input only have int
	public static int inputIntCheck (Scanner input)
	{
		while (!input.hasNextInt())
		{
			input.next();
			System.out.print ("Invalid datatype! Enter again: ");
		}
		//Create a variable for guess number
		int guessNum = input.nextInt();
		//Check the input range
		guessNum = intRangeCheck (input, guessNum);
		return guessNum;
	}

	//Check the int input range
	public static int intRangeCheck (Scanner input, int guessNum)
	{
		while (guessNum < 1 || guessNum > 100)
		{
			System.out.print ("Invalid number! Enter again: ");
			guessNum = inputIntCheck (input); //check input only int
		}
		return guessNum;
	}
	//Play a game once
	public static int playGame (Scanner input, Random rand, int guessCounter)
	{
		//Create a random number between 1 and 100
		int randomNum = rand.nextInt(MAX) + 1;
		System.out.println ("\nI'm thinking of a number between 1 and 100...");
		System.out.print ("Your guess? ");
		//Create a variable for guess number
		int guessNum = inputIntCheck (input);
		guessCounter ++;
		while (guessNum != randomNum)
		{
			if (guessNum < randomNum)
			{
				System.out.println ("It's higher.");
			}
			else
			{
				System.out.println ("It's lower.");
			}
			System.out.print ("Your guess? ");
			guessNum = inputIntCheck (input);
			guessCounter++;
		}
		return guessCounter;
	}

	//Show the result of one game
	public static void result (int guessCounter)
	{
		System.out.print ("You got it right in " + guessCounter);
		if (guessCounter != 1) System.out.println (" guesses!");
		else System.out.println (" guess!");
	}

	//Overall result
	public static void conclusion (int totalGuess, int gameCounter, int bestGame)
	{
		double average = 1.0 * totalGuess / gameCounter;
		System.out.println ("\n\nOverall resultes:");
		System.out.println ("Total games   = " + gameCounter);
		System.out.println ("Total guesses = " + totalGuess);
		System.out.printf  ("Guesses/game  = %.1f\n", average);
		System.out.println ("Best game     = " + bestGame + "\n");
	}
}