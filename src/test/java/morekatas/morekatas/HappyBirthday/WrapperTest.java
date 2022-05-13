package morekatas.morekatas.HappyBirthday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WrapperTest {

    @Test
    void ifSomeSideAreNotGreaterThanZeroWrapMethodThrowsException() {
        Exception thrown = assertThrows(Exception.class, ()->Wrapper.wrap(1, 1, 0));

        assertEquals("some side isn't greater then zero", thrown.getMessage());
    }

    @Test
    void isSidesAreGreaterThanZeroWrapCalculatesTheRibbonLength() throws Exception {
        Wrapper wrapper = new Wrapper();

        double sut = wrapper.wrap(1, 3, 1);
        double sut1 = wrapper.wrap(13, 13, 13);
        double sut2 = wrapper.wrap(17, 32, 11);

        assertEquals(32, sut);
        assertEquals(124, sut1);
        assertEquals(162, sut2);
    }
}
