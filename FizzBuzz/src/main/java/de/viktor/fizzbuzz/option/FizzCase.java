/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import de.viktor.fizzbuzz.FizzBuzzConstants;
import de.viktor.fizzbuzz.FizzBuzz;

public class FizzCase implements FizzBuzz
{
    @Override
    public String getFizzBuzz()
    {
	return FizzBuzzConstants.fizz;
    }
}
