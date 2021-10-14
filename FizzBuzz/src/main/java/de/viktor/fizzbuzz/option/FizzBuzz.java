/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import de.viktor.fizzbuzz.FizzBuzzConstants;
import de.viktor.fizzbuzz.IFizzBuzz;

public class FizzBuzz implements IFizzBuzz
{
    @Override
    public String getFizzBuzz(int number)
    {
	return FizzBuzzConstants.fizzBuzz;
    }
}
