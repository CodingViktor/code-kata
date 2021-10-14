/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import de.viktor.fizzbuzz.IFizzBuzz;

public class Number implements IFizzBuzz
{
    @Override
    public String getFizzBuzz(int number)
    {
	return String.valueOf(number);
    }
}
