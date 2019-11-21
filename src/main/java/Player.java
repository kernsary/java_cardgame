import java.util.ArrayList;
import java.util.BitSet;

public class Player {

    private ArrayList<Card> hand;
    private int total;

    public Player() {
        this.hand = new ArrayList<Card>();
        this.total = 0;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public int getTotal() {
        for(Card card : hand){
            total += card.getValueFromEnum();
        }
        return total;
    }
}
