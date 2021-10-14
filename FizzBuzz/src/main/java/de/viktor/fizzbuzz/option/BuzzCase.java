/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import de.viktor.fizzbuzz.FizzBuzzConstants;
import de.viktor.fizzbuzz.FizzBuzz;

public class BuzzCase implements FizzBuzz
{
    @Override
    public String getFizzBuzz()
    {
	return FizzBuzzConstants.buzz;
    }
}
