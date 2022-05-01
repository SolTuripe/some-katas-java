package morekatas.morekatas.FizzBuzzKataTest;

import morekatas.morekatas.FizzBuzzKata.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void CanStartFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertNotNull(fizzbuzz);
    }

    @Test
    void NumDivBy3RetFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.convert(3);
        assertEquals(expected, actual);
    }
}
