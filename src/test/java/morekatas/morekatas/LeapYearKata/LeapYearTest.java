package morekatas.morekatas.LeapYearKata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeapYearTest {

   /* @ParameterizedTest
    @CsvSource({
            "1997, false",
            "1996, true"
    })*/
    @Test
    void sayFalseIfYearIsNotDivisibleBy4() {
        LeapYear leapYear = new LeapYear(1997);

        assertEquals(leapYear.check(), newYear(1997).check());
    }

    @Test
    void sayTrueIfYearIsDivisibleBy4()  {
        LeapYear leapYear = new LeapYear(1996);

        assertEquals(leapYear.check(), newYear(1996).check());
    }

    @Test
    void returnCorrectCheckForLeapYear3() {

    }

    private LeapYear newYear(int input) {
        return new LeapYear(input);
    }
}
