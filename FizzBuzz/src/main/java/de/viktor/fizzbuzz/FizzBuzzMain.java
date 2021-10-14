/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

public class FizzBuzzMain
{
    public static void main(String[] args)
    {
	FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
	for (int index = 1; index <= FizzBuzzConstants.maxNumbers; index++)
	{
	    FizzBuzz fizzBuzzCase = fizzBuzzFactory.determineFizzBuzz(index);
	    System.out.println(fizzBuzzCase.getFizzBuzz());
	}
    }
}
