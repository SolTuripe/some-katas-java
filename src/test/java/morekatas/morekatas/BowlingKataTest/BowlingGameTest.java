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
    void TestGutterGame() {
        rollMany(20, 0);

        assertEquals(0, bowlingGame.score());
    }

    @Test
    void TestAllOnes() {
        rollMany(20,1);

        assertEquals(20, bowlingGame.score());
    }

    @Test
    void TestOneSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        rollMany(17, 0);

        assertEquals(16, bowlingGame.score());
    }

    private void rollMany(int n, int pins) {

        for (int i = 0; i < n; i++) {
            bowlingGame.roll(pins);
        }
    }
}
