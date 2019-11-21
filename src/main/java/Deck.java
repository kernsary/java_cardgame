import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> cards;
    private Card testCard;
    private ArrayList<Card> hand;

    public Deck(){
        this.cards = new ArrayList<Card>(52);
        this.testCard = new Card(SuitType.HEARTS, RankType.ACE);
        for (int i = 0; i < 52; i++){
            cards.add(i, testCard);
        }
        this.hand = new ArrayList<Card>();

    }

    public void populate() {
        int i = 0;
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                cards.set(i, new Card(suit, rank));
                i++;
            }
        }
    }

    public int getNumCards() {
        return this.cards.size();
    }

    public SuitType checkSuit(int cardNumber) {
        return this.cards.get(cardNumber).getSuit();
    }

    public RankType checkRank(int cardNumber) {
        return this.cards.get(cardNumber).getRank();
    }

    public List<?> getCards() {
        return this.cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void dealHand() {
        for (int i = 0; i < 7; i++){
            Card dealtCard = cards.remove(i);
            hand.add(dealtCard);
        }

    }

    public List<?> getHand() {
        return this.hand;
    }
}
