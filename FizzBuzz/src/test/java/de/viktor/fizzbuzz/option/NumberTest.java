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

class NumberTest
{
    private Number number;

    @BeforeEach
    void setUp()
    {
	number = new Number();
    }

    @Test
    void testGetFizzBuzzOptionBuzz()
    {
	String actualString = number.getFizzBuzz(99);
	assertThat(actualString, is("99"));
    }
}
