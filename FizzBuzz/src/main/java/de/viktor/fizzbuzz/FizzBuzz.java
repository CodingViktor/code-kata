/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

public class FizzBuzz
{
    private static int maxNumbers = 100;
    private static int fizzNumber = 3;
    private static int buzzNumber = 5;

    public static void main(String[] args)
    {
	for (int index = 1; index <= maxNumbers; index++)
	{
	    if (isFizz(index))
	    {
		System.out.println("Fizz");
	    }
	    else if (isBuzz(index))
	    {
		System.out.println("Buzz");
	    }
	    else
	    {
		System.out.println(index);
	    }
	}
    }

    private static boolean isFizz(int number)
    {
	return (number % fizzNumber) == 0 ? true : false;
    }

    private static boolean isBuzz(int number)
    {
	return (number % buzzNumber) == 0 ? true : false;
    }
}
