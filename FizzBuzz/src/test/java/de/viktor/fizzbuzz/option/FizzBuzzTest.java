/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz.option;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.viktor.fizzbuzz.FizzBuzzConstants;

class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;
    
    @BeforeEach
    void setUp()
    {
	fizzBuzz = new FizzBuzz();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = fizzBuzz.getFizzBuzz(99);
	
	assertThat(actualString, is(FizzBuzzConstants.fizzBuzz));
    }
}
