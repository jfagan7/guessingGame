/*
 * NAME: Guessing Game
 * AUTHOR: Justin Fagan
 * DATE: 9/26
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class GuessingGame{
	public static void main(String[]args)
	{
		boolean isNumber=false;
		int guess = 0;
		int answer = (int) (Math.random()*10 + 1);
		Scanner input = new Scanner(System.in);
		int x = 0;
		String g= " guess!";
		while(guess != answer)
		{
			isNumber=false;
			while(!isNumber)
			{
				try
				{
					System.out.println("Guess a number between 1 and 10");
					guess = input.nextInt();
					isNumber=true;
					if(x>1)
					{
						g=" guesses!";
					}
					if(guess != answer)
					{
						System.out.println("That was incorrect!");
						x++;
					}
					else
					{
						System.out.println("Congratulations you found the answer after " + x + " guesses!");
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
