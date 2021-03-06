import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canDeal(){
        Card dealtCard = deck.dealCard();
        assertNotNull(dealtCard);
        System.out.println(dealtCard.getRank());
        System.out.println(dealtCard.getSuit());
    }
}
