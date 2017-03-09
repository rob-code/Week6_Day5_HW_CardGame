import static org.junit.Assert.*;
import org.junit.*;

public class TraditionalDeckTest{

  Card card;
  TraditionalDeck deck;

  @Before
  public void before(){
    deck = new TraditionalDeck();
  }

  @Test
  public void canGetNumberOfCardsInDeck(){
    assertEquals(52, deck.numberOfCards());
  }

  @Test
  public void canShuffleTheDeck(){
    deck.shuffle();
  }

  @Test
  public void getTopCardFromDeck(){
   Card card = deck.getCard();
   System.out.println(card.getValue() + " " + card.getSuit());    
  }






}

