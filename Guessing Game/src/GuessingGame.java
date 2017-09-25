import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame{
	public static void main(String[]args)
	{
		/*
		Scanner input= new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		*/
	}	
	public static void guessingGame(boolean isNumber, int guess)
	{
		int answer = (int) (Math.random()*10 + 1);
		while(guess != answer)
		{
			while(!isNumber)
			{
				try
				{
					System.out.println("Guess a number between 1 and 10");
					if(guess==answer) 
					{
						isNumber=true;
					}
					else
					{
						System.out.println("You guessed wrong try again");
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was error type:" + e);
				}
			}
		}
	}
}
