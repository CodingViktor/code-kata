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

class BuzzTest
{
    private Buzz buzz;
    
    @BeforeEach
    void setUp()
    {
	buzz = new Buzz();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = buzz.getFizzBuzz(99);
	
	assertThat(actualString, is(FizzBuzzConstants.buzz));
    }
}
