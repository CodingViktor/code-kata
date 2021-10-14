/**
 *
 * @author Viktor
 *
 */
package de.viktor.fizzbuzz;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.viktor.fizzbuzz.option.BuzzCase;
import de.viktor.fizzbuzz.option.FizzCase;
import de.viktor.fizzbuzz.option.NumberCase;
import de.viktor.fizzbuzz.option.FizzBuzzCase;

class FizzBuzzFactoryTest
{
    private FizzBuzzFactory fizzBuzzFactory;

    @BeforeEach
    void setUp()
    {
	fizzBuzzFactory = new FizzBuzzFactory();
    }

    @Test
    void testDetermineFizzBuzzOptionFizzBuzz() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(60);
	assertThat(actualFizzBuzz, is(instanceOf(FizzBuzzCase.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionFizz() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(36);
	assertThat(actualFizzBuzz, is(instanceOf(FizzCase.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionFizzContainsDigit() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(13);
	assertThat(actualFizzBuzz, is(instanceOf(FizzCase.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionBuzz() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(40);
	assertThat(actualFizzBuzz, is(instanceOf(BuzzCase.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionBuzzContainsDigit() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(56);
	assertThat(actualFizzBuzz, is(instanceOf(BuzzCase.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionNumber() throws Exception
    {
	FizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(77);
	assertThat(actualFizzBuzz, is(instanceOf(NumberCase.class)));
    }
}
