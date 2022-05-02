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
    void CanStartFizzBuzz() {
        assertNotNull(fizzbuzz);
    }

    @Test
    void NumDivBy3RetFizz() {
        String expected = "Fizz";
        String actual = fizzbuzz.convert(3);
        assertEquals(expected, actual);
    }

    @Test
    void NumDivBy5RetBuzz() {
        String expected = "Buzz";
        String actual = fizzbuzz.convert(5);
        assertEquals(expected, actual);
    }
}
