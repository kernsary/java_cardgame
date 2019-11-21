import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private Card testCard;

    public Deck(){
        this.cards = new ArrayList<Card>(52);
        this.testCard = new Card(SuitType.HEARTS, RankType.ACE);
        for (int i = 0; i < 52; i++){
            cards.add(i, testCard);
        }

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
}
