import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest{

  Card card;
  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }


  @Test
  public void canGetNumberOfCardsInDeck(){
    assertEquals(36, deck.numberOfCards());
  }

}

