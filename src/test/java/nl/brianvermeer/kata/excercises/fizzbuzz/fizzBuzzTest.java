package nl.brianvermeer.kata.excercises.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fizzBuzzTest {

    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, " +
                "19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, " +
                "37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz]";
        assertEquals(expected, fizzBuzz.fizzBuzz().toString());
    }

}
