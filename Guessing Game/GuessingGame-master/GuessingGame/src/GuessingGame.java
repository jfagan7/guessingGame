import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame
{
	public static void main(String[]args)
	{
		int guess = 0;
		int answer = (int)(Math.random()*10 + 1);
		boolean isNumber = false;
		Scanner input = new Scanner(System.in);
		
		while(guess != answer)
		{
			isNumber = false;
			
			while(!isNumber)
			{
				
				try
				{
					System.out.println("What is your number?");
					guess = input.nextInt();	
					isNumber = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was error type" + e);
				}
			}
			
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		System.out.println("What is your age?");
		String r = input.next();
		System.out.println("Nice!" + r + "is cool.");
		*/
		}
		
	}
}

