package morekatas.morekatas.SnakeandLeaderKata;

import morekatas.morekatas.SnakeandLeadersKata.Game;
import morekatas.morekatas.SnakeandLeadersKata.Players;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakeAndLeaderTest {

    @Test
    void thereAreTwoPlayersAndBothStartOffTheBoardOnSquare0 () {
        //given and when
        Game game = new Game(2);
        ArrayList<Players> players = game.getPlayersList();

        //then
        assertEquals(2, players.size());
        assertEquals(0, players.get(0).boardPosition());
        assertEquals(0, players.get(1).boardPosition());
    }

    @Test
    void player1StartsAndAlternatesWithPlayer2() {
        /*mockDices = mock(Dices.class);
        Game game = new Game(2,mockDices);

        when(mockDices.equalNumbers()).thenReturn(false);

        assertEquals(0,game.getTurn());
        game.play();
        assertEquals(1,game.getTurn());
        game.play();
        assertEquals(0,game.getTurn());*/
    }
}
