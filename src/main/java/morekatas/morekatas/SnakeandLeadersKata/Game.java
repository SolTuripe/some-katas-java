package morekatas.morekatas.SnakeandLeadersKata;

import java.util.ArrayList;

public class Game {

    private int playersNumbers;
    private ArrayList<Players> playersList = new ArrayList<Players>();

    public Game(int playersNumbers) {
        this.playersNumbers = playersNumbers;
        generatePLayers();
    }

    public void generatePLayers() {
        for (int i = 0; i < this.playersNumbers ; i++) {
            playersList.add(i,new Players(i));
        }
    }

    public ArrayList<Players> getPlayersList() {
        return playersList;
    }
}
