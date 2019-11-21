import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void canGetCards(){
        assertEquals(52, deck.getCards().size());
    }

//    @Test
//    public void deckIsShuffled(){
//        deck.shuffle();
//        assertFalse(RankType.KING == deck.checkRank(51));
//    }

//    @Test
//    public void deckCanDealCard(){
//        deck.shuffle();
//        deck.dealHand();
//       assertEquals(7, deck.getHand().size());
//    }
}
