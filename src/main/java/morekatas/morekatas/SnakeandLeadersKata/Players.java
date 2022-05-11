package morekatas.morekatas.SnakeandLeadersKata;

public class Players {

    private int id;
    private int position = 0;

    public Players(int id) {
        this.id = id;
    }

    public int boardPosition() {
        return position;
    }
}
