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

class FizzTest
{
    private Fizz fizz;
    
    @BeforeEach
    void setUp()
    {
	fizz = new Fizz();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = fizz.getFizzBuzz(99);
	
	assertThat(actualString, is(FizzBuzzConstants.fizz));
    }
}
