/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

import static de.viktor.fizzbuzz.FizzBuzzConstants.*;

import de.viktor.fizzbuzz.option.BuzzCase;
import de.viktor.fizzbuzz.option.FizzCase;
import de.viktor.fizzbuzz.option.FizzBuzzCase;
import de.viktor.fizzbuzz.option.NumberCase;

public class FizzBuzzFactory
{
    public FizzBuzz determineFizzBuzz(int number)
    {
	if (isFizzBuzz(number))
	{
	    return new FizzBuzzCase();
	}
	else if (isFizz(number))
	{
	    return new FizzCase();
	}
	else if (isBuzz(number))
	{
	    return new BuzzCase();
	}
	else
	{
	    return new NumberCase(number);
	}
    }

    private static boolean isFizzBuzz(int number)
    {
	return (number % fizzNumber) == 0 && (number % buzzNumber) == 0 ? true : false;
    }

    private static boolean isFizz(int number)
    {
	if ((number % fizzNumber) == 0 || containsDigits(number, fizzNumber))
	{
	    return true;
	}
	return false;
    }

    private static boolean isBuzz(int number)
    {
	if ((number % buzzNumber) == 0 || containsDigits(number, buzzNumber))
	{
	    return true;
	}
	return false;
    }

    private static boolean containsDigits(int number, int containsNumber)
    {
	String convertedNumber	       = String.valueOf(number);
	String convertedContainsNumber = String.valueOf(containsNumber);
	
	return convertedNumber.contains(convertedContainsNumber) ? true : false;
    }
}
