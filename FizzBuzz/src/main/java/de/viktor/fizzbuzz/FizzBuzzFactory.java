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

    private boolean isFizzBuzz(int number)
    {
	return (number % fizzNumber) == 0 && (number % buzzNumber) == 0 ? true : false;
    }

    private boolean isFizz(int number)
    {
	if ((number % fizzNumber) == 0 || containsDigits(number, fizzNumber))
	{
	    return true;
	}
	return false;
    }

    private boolean isBuzz(int number)
    {
	if ((number % buzzNumber) == 0 || containsDigits(number, buzzNumber))
	{
	    return true;
	}
	return false;
    }

    private boolean containsDigits(int number, int expectedNumber)
    {
	String convertedNumber	       = String.valueOf(number);
	String convertedExpectedNumber = String.valueOf(expectedNumber);
	
	return convertedNumber.contains(convertedExpectedNumber) ? true : false;
    }
}
