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

class FizzBuzzCaseTest
{
    private FizzBuzzCase fizzBuzzCase;
    
    @BeforeEach
    void setUp()
    {
	fizzBuzzCase = new FizzBuzzCase();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = fizzBuzzCase.getFizzBuzz();
	
	assertThat(actualString, is(FizzBuzzConstants.fizzBuzz));
    }
}
