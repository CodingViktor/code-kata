/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

import static de.viktor.fizzbuzz.FizzBuzzConstants.*;

import de.viktor.fizzbuzz.option.Buzz;
import de.viktor.fizzbuzz.option.Fizz;
import de.viktor.fizzbuzz.option.FizzBuzz;
import de.viktor.fizzbuzz.option.Number;

public class FizzBuzzFactory
{
    public IFizzBuzz determineFizzBuzz(int number)
    {
	if (isFizzBuzz(number))
	{
	    return new FizzBuzz();
	}
	else if (isFizz(number))
	{
	    return new Fizz();
	}
	else if (isBuzz(number))
	{
	    return new Buzz();
	}
	else
	{
	    return new Number();
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
