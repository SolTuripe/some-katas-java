package morekatas.morekatas.FizzBuzzKataTest;

import morekatas.morekatas.FizzBuzzKata.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    void setup() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void canStartFizzBuzz() {
        assertNotNull(fizzbuzz);
    }

    @Test
    void numDivBy3RetFizz() {
        String expected = "Fizz";
        String actual = fizzbuzz.convert(3);
        assertEquals(expected, actual);
    }

    @Test
    void numDivBy5RetBuzz() {
        String expected = "Buzz";
        String actual = fizzbuzz.convert(5);
        assertEquals(expected, actual);
    }

    @Test
    void numDivByThreeAndFiveRetFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = fizzbuzz.convert(15);
        assertEquals(expected, actual);
    }

    @Test
    void numNotDivByThreeOrFiveRetNumAssString() {
        String expected = "4";
        String actual = fizzbuzz.convert(4);
        assertEquals(expected, actual);
    }
}
