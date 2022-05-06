package morekatas.morekatas.LeapYearKata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeapYearTest {

   @ParameterizedTest
    @CsvSource({
            "3, false",
            "5, false",
            "1997, false",
            "4, true",
            "8, true",
            "1996, true",
            "1600, true",
            "1800, false"
    })

    void returnCorrectCheckForLeapYear(int input, boolean output) {
        assertEquals(output, newYear(input).check());
    }

    /*
    @Test
    void sayTrueIfYearIsDivisibleBy400()  {
        LeapYear leapYear = new LeapYear(1600);

        assertEquals(leapYear.check(), newYear(1600).check());
    }*/

    private LeapYear newYear(int input) {
        return new LeapYear(input);
    }
}
