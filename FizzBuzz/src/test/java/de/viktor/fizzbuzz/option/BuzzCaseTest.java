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

class BuzzCaseTest
{
    private BuzzCase buzzCase;
    
    @BeforeEach
    void setUp()
    {
	buzzCase = new BuzzCase();
    }    
    
    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = buzzCase.getFizzBuzz();
	
	assertThat(actualString, is(FizzBuzzConstants.buzz));
    }
}
