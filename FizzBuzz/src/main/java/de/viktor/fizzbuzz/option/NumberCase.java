/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import de.viktor.fizzbuzz.FizzBuzz;

public class NumberCase implements FizzBuzz
{
    private int number;

    public NumberCase (int number)
    {
	this.number = number;
    }

    @Override
    public String getFizzBuzz()
    {
	return String.valueOf(number);
    }
}
