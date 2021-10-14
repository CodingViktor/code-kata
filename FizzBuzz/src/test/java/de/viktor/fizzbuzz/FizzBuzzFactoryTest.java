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

import de.viktor.fizzbuzz.option.Buzz;
import de.viktor.fizzbuzz.option.Fizz;
import de.viktor.fizzbuzz.option.FizzBuzz;

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
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(60);
	assertThat(actualFizzBuzz, is(instanceOf(FizzBuzz.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionFizz() throws Exception
    {
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(36);
	assertThat(actualFizzBuzz, is(instanceOf(Fizz.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionFizzContainsDigit() throws Exception
    {
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(13);
	assertThat(actualFizzBuzz, is(instanceOf(Fizz.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionBuzz() throws Exception
    {
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(40);
	assertThat(actualFizzBuzz, is(instanceOf(Buzz.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionBuzzContainsDigit() throws Exception
    {
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(56);
	assertThat(actualFizzBuzz, is(instanceOf(Buzz.class)));
    }
    
    @Test
    void testDetermineFizzBuzzOptionNumber() throws Exception
    {
	IFizzBuzz actualFizzBuzz = fizzBuzzFactory.determineFizzBuzz(77);
	assertThat(actualFizzBuzz, is(instanceOf(de.viktor.fizzbuzz.option.Number.class)));
    }
}
