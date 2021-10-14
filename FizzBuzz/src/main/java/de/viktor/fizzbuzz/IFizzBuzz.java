/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

public interface IFizzBuzz
{
    /**
     * Returns a string containing "Fizz", "Buzz", "FizzBuzz" or a number.
     * 
     * @param number in case a number will be returned it will be the number of the
     *               parameter. <br>
     *               In the other cases("Fizz", "Buzz" and "FizzBuzz") the parameter
     *               is not needed.
     * 
     * @return Returns a string containing "Fizz", "Buzz", "FizzBuzz" or a number.
     */
    public String getFizzBuzz(int number);
}
