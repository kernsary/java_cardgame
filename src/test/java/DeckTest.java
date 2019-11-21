import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getNumCards());
    }

    @Test
    public void lastCardIsKingOfSpades(){
        assertEquals(SuitType.SPADES, deck.checkSuit(51));
        assertEquals(RankType.KING, deck.checkRank(51));
    }

}
