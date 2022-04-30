package morekatas.morekatas.BowlingKataTest;

import morekatas.morekatas.BowlingKata.BowlingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    void GutterGameTest() {
        rollMany(20, 0);

        assertEquals(0, bowlingGame.score());
    }

    @Test
    void AllOnesTest() {
        rollMany(20,1);

        assertEquals(20, bowlingGame.score());
    }

    @Test
    void OneSpareTest() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);

        assertEquals(16, bowlingGame.score());
    }

    @Test
    void OneStrikeTest() {
        bowlingGame.roll(10);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);

        assertEquals(24, bowlingGame.score());
    }

    private void rollMany(int n, int pins) {

        for (int i = 0; i < n; i++) {
            bowlingGame.roll(pins);
        }
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }
}
