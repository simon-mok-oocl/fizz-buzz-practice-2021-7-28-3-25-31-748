package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_output_fizz_when_fizzbuzz_given_normal_number()
    {
        int given = 2;
        String expected = "2";

        FizzBuzz fb= new FizzBuzz();
        String result = fb.countOff(given);

        assertEquals(expected , result);

    }

    @Test
    public void should_output_fizz_when_fizzbuzz_given_multiple_3()
    {
        int given = 6;
        String expected = "Fizz";

        FizzBuzz fb= new FizzBuzz();
        String result = fb.countOff(given);

        assertEquals(expected , result);

    }

}
