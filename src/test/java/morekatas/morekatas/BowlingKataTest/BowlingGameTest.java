package morekatas.morekatas.BowlingKataTest;

import morekatas.morekatas.BowlingKata.BowlingGame;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    void TestGutterGame() {
        BowlingGame bowlingGame = new BowlingGame();

        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }

        assertEquals(0, bowlingGame.score());
    }

    @Test
    void TestAllOnes() {
        BowlingGame bowlingGame = new BowlingGame();

        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }

        assertEquals(20, bowlingGame.score());
    }
}
