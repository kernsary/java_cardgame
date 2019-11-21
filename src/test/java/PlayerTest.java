import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player stephen;
    private Player charles;
    private Deck deck;

    @Before
    public void before() {
        stephen = new Player();
        charles = new Player();
        deck = new Deck();
    }

    @Test
    public void playerHasHand() {
        deck.dealHand(stephen);
        assertEquals(1, stephen.getHand().size());
    }
}
