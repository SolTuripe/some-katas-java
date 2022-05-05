package morekatas.morekatas.LeapYearKata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "1997, false"
    })
    void returnCorrectCheckForLeapYear(int input, boolean output) {
        assertEquals(output, newYear(input).check());
    }

    private LeapYear newYear(int input) {
        return new LeapYear(input);
    }
}
