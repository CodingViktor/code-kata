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

class FizzCaseTest
{
    private FizzCase fizzCase;
    
    @BeforeEach
    void setUp()
    {
	fizzCase = new FizzCase();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = fizzCase.getFizzBuzz();
	
	assertThat(actualString, is(FizzBuzzConstants.fizz));
    }
}
