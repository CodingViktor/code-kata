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

class NumberCaseTest
{
    private NumberCase numberCase;

    @BeforeEach
    void setUp()
    {
	numberCase = new NumberCase(99);
    }

    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = numberCase.getFizzBuzz();
	assertThat(actualString, is("99"));
    }
}
